package lv3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {
    // 속성
    private int value1;
    private int value2;
    private String op; // 연산자
    private int result; // 연산 결과

    // ArrayList객체를 List<Integer>형 변수 results에 할당
    private static List<Integer> results = new ArrayList<>(); // 결과들을 저장할 리스트, 크기를 자동으로 변환하기 위해 List사용

    // 생성자

    /* Getter 메서드 구현 */

    public int getResult() { return this.result; } // 연산 결과(calculate() 메서드를 통해 연산 결과가 저장됨) 멤버 변수를 반환

    /* Setter 메서드 구현 */

    public void setValues(int value1, int value2, String op) { // 입력받은 value1, value2, op를 멤버변수에 설정
        this.value1 = value1;
        this.value2 = value2;
        this.op = op;
    }

    // 기능
    public void calculate() { // 연산 기능, setter를 통해 설정된 멤버변수(value1, value2, op)를 활용
        OperatorType operatorType = OperatorType.searchSymbol(this.op);
        result = operatorType.apply(this.value1, this.value2);
        results.add(result); // 연산 결과를 results list에 추가
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