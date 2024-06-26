package ru.mixail_akulov.a47_network_okhttp_gson_exercise.app.model.settings

interface AppSettings {

    /**
     * Get auth token of the current logged-in user.
     */
    fun getCurrentToken(): String?

    /**
     * Set auth token of the logged-in user.
     */
    fun setCurrentToken(token: String?)

}
