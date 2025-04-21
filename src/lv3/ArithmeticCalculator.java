package lv3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T extends Number> { // ArithmeticCalculator<String>에 대한 에러처리
    // 속성
    private T value1;
    private T value2;
    private String op; // 연산자
    private double result; // 연산 결과
    // ArithmeticCalculator<Integer> calc = new ArithmeticCalculator<>(); 와 같은 상황에서
    // result는 T로 선언시 데이터 손실 가능 ex) value1 = 3, value2 = 2, result = 1.5 / .5 손실

    // ArrayList객체를 List<Double>형 변수 results에 할당
    private static List<Double> results = new ArrayList<>(); // 결과들을 저장할 리스트, 크기를 자동으로 변환하기 위해 List사용

    // 생성자

    /* Getter 메서드 구현 */

    public double getResult() { return this.result; } // 연산 결과(calculate() 메서드를 통해 연산 결과가 저장됨) 멤버 변수를 반환

    public static List<Double> getResults() {
        return results;
    }

    /* Setter 메서드 구현 */

    public void setValues(T value1, T value2, String op) { // 입력받은 value1, value2, op를 멤버변수에 설정
        this.value1 = value1;
        this.value2 = value2;
        this.op = op;
    }

    // 기능
    public void calculate() { // 연산 기능, setter를 통해 설정된 멤버변수(value1, value2, op)를 활용
        OperatorType operatorType = OperatorType.searchSymbol(this.op);
        result = operatorType.apply(this.value1.doubleValue(), this.value2.doubleValue()); // Double형 변수가 된 value1, value2를 double형으로 형변환하여 사용
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

    // Lambda & Stream 활용. 저장된 연산 결과들 중 Scanner로 입력받은 값보다 큰 결과값 들을 출력
    public void printResults(double input) {
        results.stream()                         // results 리스트를 스트림으로 변환
                .filter(result -> result > input)            // 입력한 값보다 큰 것만 필터링
                .forEach(result -> System.out.print(result + " ")); // 필터링된 값들 출력
    }
}