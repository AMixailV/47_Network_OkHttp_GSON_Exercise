package ru.mixail_akulov.a47_network_okhttp_gson_exercise

import com.google.gson.Gson
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.logging.HttpLoggingInterceptor
import java.lang.IllegalStateException

// Класс тела запроса gson
data class SignInRequestBody(
    val email: String,
    val password: String
)

// Класс тела ответа
data class SignInResponseBody(
    val token: String
)

val contentType = "application/json; charset=utf-81".toMediaType()

fun main() {

    val loggingInterceptor = HttpLoggingInterceptor()   // перехватчик сетевых запросов
        .setLevel(HttpLoggingInterceptor.Level.BODY)    // логировать все запросы с максимальным уровнем логирования

    val gson = Gson()    // парсер gson сообщений

    val client = OkHttpClient.Builder()       // используем построитель, чтобы
        .addInterceptor(loggingInterceptor)   // добавить перехватчик в клиент
        .build()

    val requestBody = SignInRequestBody(      // создаем тело запроса для админа
        email = "admin@google.com",
        password = "123"
    )
    val requestBodyString = gson.toJson(requestBody)                       // парсим тело запроса в gson строку
    val okHttpRequestBody = requestBodyString.toRequestBody(contentType)   // тело запроса

    // шаблон запроса
    val request = Request.Builder()
        .post(okHttpRequestBody)
        .url("http://127.0.0.1:12345/sign-in")
        .build()

    val call = client.newCall(request)  // вызов запроса

    // синхронный запрос
    val response = call.execute()

    if (response.isSuccessful) {
        val responseBodyString = response.body!!.string() // тело ответа преобразовываем в строку
        val signInResponseBody = gson.fromJson(           // распарсиваем в класс
            responseBodyString,
            SignInResponseBody::class.java
        )
        println("TOKEN: ${signInResponseBody.token}")
    } else {
        throw IllegalStateException("Ой")
    }

}