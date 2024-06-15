package ru.mixail_akulov.a47_network_okhttp_gson_exercise.sources.base

import ru.mixail_akulov.a47_network_okhttp_gson_exercise.app.model.SourcesProvider
import ru.mixail_akulov.a47_network_okhttp_gson_exercise.app.model.accounts.AccountsSource
import ru.mixail_akulov.a47_network_okhttp_gson_exercise.app.model.boxes.BoxesSource

// todo #8: create AccountsSource and BoxesSource.
class OkHttpSourcesProvider(
    private val config: OkHttpConfig
) : SourcesProvider {

    override fun getAccountsSource(): AccountsSource {
        TODO("Create an instance of OkHttpAccountsSource")
    }

    override fun getBoxesSource(): BoxesSource {
        TODO("Create an instance of OkHttpBoxesSource")
    }

}