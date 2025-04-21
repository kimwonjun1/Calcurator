package lv3;

public enum OperatorType {
    // 고정된 매개변수값("+", "-", "*", "/"을 가지는  PLUS, MINUS, MULTIPLY, DIVIDE 객체 생성
    PLUS("+") {
        @Override
        public int apply(int value1, int value2) {
            return value1 + value2;
        }
    },
    MINUS("-") {
        @Override
        public int apply(int value1, int value2) {
            return value1 - value2;
        }
    },
    MULTIPLY("*") {
        @Override
        public int apply(int value1, int value2) {
            return value1 * value2;
        }
    },
    DIVIDE("/") {
        @Override
        public int apply(int value1, int value2) {
            if (value2 == 0) {
                throw new ArithmeticException("0으로 나눌 수 없습니다.");
            }
            return value1 / value2;
        }
    };

    // 속성
    // 각 PLUS, MINUS, MULTIPLY, DIVIDE 객체의 고유한 멤버 변수 op(연산자)
    private final String symbol;

    // 생성자
    // 각 PLUS, MINUS, MULTIPLY, DIVIDE 객체에 대한 생성자
    OperatorType(String symbol) {
        this.symbol = symbol;
    }

    // 기능
    // 각 PLUS, MINUS, MULTIPLY, DIVIDE 객체에 대한 메서드
    // getter
    public String getSymbol() {
        return this.symbol;
    }

    public static OperatorType searchSymbol(String symbol) {
        for (OperatorType op : values()) { // OperatorType enum 클래스에서
            if (op.getSymbol().equals(symbol)) { // 매개변수로 입력받은 연산자와 비교하여 같은
                return op;                 // 연산자를 리턴
            }
        }
        throw new IllegalArgumentException("잘못된 연산자: " + symbol); // 입력받은 symbol이 enum클래스에 없을 경우 예외처리
    }

    // apply() 추상 메서드 각 객체에 맞게 오버라이드하여 구현, Calculator의 계산 기능을 적용하는 메서드
    public abstract int apply(int value1, int value2);

    // 모든 PLUS, MINUS, MULTIPLY, DIVIDE 객체가 공유하여 사용하는 메서드


}
