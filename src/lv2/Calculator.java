package lv2;

public class Calculator {
    private final int value1;
    private final int value2;
    private final char op;
    private int result;

    public Calculator(int value1, int value2, char op) {
        this.value1 = value1;
        this.value2 = value2;
        this.op = op;
    }

    public int calculate() {
        switch (op) {
            case '+':
                result = value1 + value2;
                break;
            case '-':
                result = value1 - value2;
                break;
            case '*':
                result = value1 * value2;
                break;
            case '/':
                result = value1 / value2;
                break;
            default:
                System.out.println("연산자를 잘못 입력하였습니다.\n +, -, *, / 중에 입력해주세요.");
        }
        return result;
    }

    public void removeResult() {

    }
}
