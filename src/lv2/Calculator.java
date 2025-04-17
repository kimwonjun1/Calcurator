package lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    // 속성
    private int value1;
    private int value2;
    private char op;

    // ArrayList객체를 List<Integer>형 변수 results에 할당
    private static List<Integer> results = new ArrayList<>(); // 결과들을 저장할 리스트, 크기를 자동으로 변환하기 위해 List사용

    // 생성자
    public Calculator(int value1, int value2, char op) {
        this.value1 = value1;
        this.value2 = value2;
        this.op = op;
    }

    /* Getter 메서드 구현 */

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    public char getOp() {
        return op;
    }

    /* Setter 메서드 구현 */

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public void setOp(char op) {
        this.op = op;
    }

    // 기능
    public int calculate() {
        int result = 0;
        switch (op) {
            case '+':
                result = this.value1 + this.value2;
                break;
            case '-':
                result = this.value1 - this.value2;
                break;
            case '*':
                result = this.value1 * this.value2;
                break;
            case '/':
                if (value2 != 0) {
                    result = this.value1 / this.value2;
                }
                else {
                    System.out.println("0으로는 나눌 수 없습니다.");
                }
                break;
            default:
                System.out.println("연산자를 잘못 입력하였습니다.\n +, -, *, / 중에 입력해주세요.");
        }
        results.add(result);
        return result;
    }

    public void removeResult() {
        if (!results.isEmpty()) { // results가 비어있지 않으면
            results.remove(0); // 가장 먼저 저장된 연산 결과 삭제
            System.out.println("가장 오래된 연산 결과가 삭제되었습니다.");
        }
        else {
            System.out.println("삭제할 연산 결과가 없습니다.");
        }
    }
}
