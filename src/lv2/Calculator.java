package lv2;

public class Calculator {
    private int value1;
    private int value2;
    private  char op;
    private int result;

    public Calculator(int value1, int value2, char op) {
        this.value1 = value1;
        this.value2 = value2;
        this.op = op;
    }

    public int calculate(int value1, int value2, char op) {
        switch (op) {
            case '+' : result = value1 + value2;
        }
        return result;
    }
}
