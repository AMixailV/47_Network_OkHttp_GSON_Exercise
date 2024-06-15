package ru.mixail_akulov.a47_network_okhttp_gson_exercise.sources

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import ru.mixail_akulov.a47_network_okhttp_gson_exercise.app.model.SourcesProvider
import ru.mixail_akulov.a47_network_okhttp_gson_exercise.app.model.settings.AppSettings

object SourceProviderHolder {

    val sourcesProvider: SourcesProvider by lazy<SourcesProvider> {
        TODO("#12: Create SourcesProvider. " +
                "Hint: use Const.BASE_URL as a value for 'baseUrl' argument")
    }

    private fun createOkHttpClient(): OkHttpClient {
        TODO("#11: create OkHttpClient by using OkHttpClient.Builder. " +
                "Add 2 interceptors: for authorization and for logging requests.")
        // Hint: use 'Singletons.appSettings' as an implementation of AppSettings interface.
    }

    private fun createAuthorizationInterceptor(settings: AppSettings): Interceptor {
        TODO("#10: create an Interceptor which adds Authorization header if " +
                "there is a token in the app settings")
    }

    private fun createLoggingInterceptor(): Interceptor {
        TODO("#9: create HttpLoggingInterceptor")
    }

}
