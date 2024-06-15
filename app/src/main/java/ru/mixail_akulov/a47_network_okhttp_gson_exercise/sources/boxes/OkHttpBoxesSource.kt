package ru.mixail_akulov.a47_network_okhttp_gson_exercise.sources.boxes

import kotlinx.coroutines.delay
import ru.mixail_akulov.a47_network_okhttp_gson_exercise.app.model.boxes.BoxesSource
import ru.mixail_akulov.a47_network_okhttp_gson_exercise.app.model.boxes.entities.BoxAndSettings
import ru.mixail_akulov.a47_network_okhttp_gson_exercise.app.model.boxes.entities.BoxesFilter
import ru.mixail_akulov.a47_network_okhttp_gson_exercise.sources.base.BaseOkHttpSource
import ru.mixail_akulov.a47_network_okhttp_gson_exercise.sources.base.OkHttpConfig

// todo #7: implement methods:
//          - setIsActive() -> for making box active or inactive
//          - getBoxes() -> for fetching boxes data
class OkHttpBoxesSource(
    config: OkHttpConfig
) : BaseOkHttpSource(config), BoxesSource {

    override suspend fun setIsActive(boxId: Long, isActive: Boolean) {
        // Call "PUT /boxes/{boxId}" endpoint.
        // Use UpdateBoxRequestEntity.
        TODO()
    }

    override suspend fun getBoxes(boxesFilter: BoxesFilter): List<BoxAndSettings> {
        delay(500)
        // Call "GET /boxes?active=true" if boxesFilter = ONLY_ACTIVE.
        // Call "GET /boxes" if boxesFilter = ALL.
        // Hint: use TypeToken for converting server response into List<GetBoxResponseEntity>
        // Hint: use GetBoxResponseEntity.toBoxAndSettings for mapping GetBoxResponseEntity into BoxAndSettings
        TODO()
    }

}