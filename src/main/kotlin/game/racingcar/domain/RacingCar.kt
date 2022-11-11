package game.racingcar.domain

import game.racingcar.move.MoveStrategy
import game.racingcar.move.RandomMoveStrategy

class RacingCar(
    val name: String,
    private val moveStrategy: MoveStrategy = RandomMoveStrategy(),
    location: Int = 0
) {
    var location: Int = location
        private set

    init {
        require(name.length <= 5) { "이름의 길이는 5자를 초과할 수 없습니다. 입력 값 : $name" }
        require(name.isNotBlank()) { "이름은 빈 문자열일 수 없습니다." }
    }

    fun move() {
        if (moveStrategy.movable()) {
            location += 1
        }
    }
}
