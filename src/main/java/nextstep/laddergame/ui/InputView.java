package nextstep.laddergame.ui;

import java.util.Scanner;
import nextstep.laddergame.engine.util.StringUtils;

public class InputView {

  private InputView() {
  }

  private static final String DELIMITER = ",";
  private static final Scanner SCANNER = new Scanner(System.in);

  public static String[] inputMembers() {
    System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
    return getInput().split(DELIMITER);
  }

  public static String[] inputResults() {
    System.out.println("실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)");
    return getInput().split(DELIMITER);
  }

  public static int inputLadderHeight() {
    System.out.println("최대 사다리 높이는 몇 개인가요?");
    return Integer.parseInt(getInput().trim());
  }

  private static String getInput() {
    String input = SCANNER.nextLine();
    StringUtils.checkNullOrBlank(input);
    return input;
  }

  public static String inputMemberOfResult() {
    System.out.println("결과를 보고 싶은 사람은?");
    return getInput().trim();
  }
}
