package ru.mixail_akulov.a47_network_okhttp_gson_exercise.sources.accounts

import kotlinx.coroutines.delay
import ru.mixail_akulov.a47_network_okhttp_gson_exercise.app.model.accounts.AccountsSource
import ru.mixail_akulov.a47_network_okhttp_gson_exercise.app.model.accounts.entities.Account
import ru.mixail_akulov.a47_network_okhttp_gson_exercise.app.model.accounts.entities.SignUpData
import ru.mixail_akulov.a47_network_okhttp_gson_exercise.sources.base.BaseOkHttpSource
import ru.mixail_akulov.a47_network_okhttp_gson_exercise.sources.base.OkHttpConfig

// todo #6: implement methods:
//          - signIn() -> for exchanging email+password to token
//          - signUp() -> for creating a new account
//          - getAccount() -> for fetching account info
//          - setUsername() -> for editing username
class OkHttpAccountsSource(
    config: OkHttpConfig
) : BaseOkHttpSource(config), AccountsSource {

    override suspend fun signIn(email: String, password: String): String {
        delay(1000)
        // Call "POST /sign-in" endpoint and return token.
        // Use SignInRequestEntity and SignInResponseEntity.
        TODO()
    }

    override suspend fun signUp(signUpData: SignUpData) {
        delay(1000)
        // Call "POST /sign-up" endpoint.
        // Use SignUpRequestEntity
        TODO()
    }

    override suspend fun getAccount(): Account {
        delay(1000)
        // Call "GET /me" endpoint.
        // Use GetAccountResponseEntity.
        TODO()
    }

    override suspend fun setUsername(username: String) {
        delay(1000)
        // Call "PUT /me" endpoint.
        // Use UpdateUsernameRequestEntity.
        TODO()
    }

}