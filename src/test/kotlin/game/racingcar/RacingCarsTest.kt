package game.racingcar

import game.racingcar.move.AlwaysMoveStrategy
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RacingCarsTest {

    @Test
    fun `RacingCars 의 초기 위치 스냅샷은 모두 0이다`() {
        // given
        val racingCars = RacingCars(3)
        // when
        val snapshot = racingCars.locations()
        // then
        snapshot.forEach {
            assertThat(it).isEqualTo(0)
        }
    }

    @Test
    fun `RacingCars가 AlwaysMoveStrategy로 생성되었을 때 모두 위치가 1씩 증가한다`() {
        // given
        val racingCars = RacingCars(3, AlwaysMoveStrategy())
        // when
        racingCars.moveAll()
        val snapshot = racingCars.locations()
        // then
        snapshot.forEach {
            assertThat(it).isEqualTo(1)
        }
    }
}
