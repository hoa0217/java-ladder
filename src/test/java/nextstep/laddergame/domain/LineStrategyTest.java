package nextstep.laddergame.domain;

import static org.assertj.core.api.Assertions.assertThat;

import nextstep.laddergame.domain.strategy.LineStrategyNotTwoWay;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LineStrategyTest {

  @DisplayName("이미 왼쪽으로 Line이 만들어진 LeftPoint는 오른쪽으로 Line을 만들 수 없다.")
  @Test
  public void LineStrategyNotTwoWay_notCreateRightLine() {
    LineStrategyNotTwoWay lineStrategyNotTwoWay = new LineStrategyNotTwoWay();
    Point leftPoint = new Point();
    leftPoint.createLineWithLeftPoint();

    assertThat(lineStrategyNotTwoWay.isCreateLine(leftPoint, new Point())).isFalse();
  }

  @DisplayName("이미 오른쪽으로 Line이 만들어진 rightPoint는 왼쪽으로 Line을 만들 수 없다.")
  @Test
  public void LineStrategyNotTwoWay_notCreateLeftLine() {
    LineStrategyNotTwoWay lineStrategyNotTwoWay = new LineStrategyNotTwoWay();
    Point rightPoint = new Point();
    rightPoint.createLineWithRightPoint();

    assertThat(lineStrategyNotTwoWay.isCreateLine(new Point(), rightPoint)).isFalse();
  }

}
