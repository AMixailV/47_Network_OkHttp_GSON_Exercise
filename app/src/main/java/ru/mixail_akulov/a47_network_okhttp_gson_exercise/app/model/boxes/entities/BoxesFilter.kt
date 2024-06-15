package ru.mixail_akulov.a47_network_okhttp_gson_exercise.app.model.boxes.entities

enum class BoxesFilter {
    /**
     * Fetch all boxes, both active and inactive
     */
    ALL,

    /**
     * Fetch only active boxes
     */
    ONLY_ACTIVE
}