package lv3;

public enum OperatorType {
    // 고정된 매개변수값("+", "-", "*", "/"을 가지는  PLUS, MINUS, MULTIPLY, DIVIDE 객체 생성
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    // 속성
    // 각 PLUS, MINUS, MULTIPLY, DIVIDE 객체의 고유한 멤버 변수 op(연산자)
    private final String op;

    // 생성자
    // 각 PLUS, MINUS, MULTIPLY, DIVIDE 객체에 대한 생성자
    OperatorType(String op) {
        this.op = op;
    }

    // 기능
    // 각 PLUS, MINUS, MULTIPLY, DIVIDE 객체에 대한 메서드
    // getter
    public String getOp() {
        return this.op;
    }

    // 모든 PLUS, MINUS, MULTIPLY, DIVIDE 객체가 공유하여 사용하는 메서드


}
