package lv3;

import lv3.ArithmeticCalculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value1 = 0; // 첫 번째 입력 정수
        int value2 = 0; // 두 번째 입력 정수
        String op = ""; // 연산자
        int result = 0; // 연산 결과
        ArithmeticCalculator calc = new ArithmeticCalculator(); // 계산기 객체 생성, 생성자 매캐변수로 숫자2개와 연산자

        while (true) {
            while (true) { // 입력받는 숫자에 대한 예외처리 1
                System.out.print("첫 번째 숫자를 입력하세요: ");
                // Scanner를 사용하여 문자열을 입력받음
                String input1 = sc.nextLine();
                try {
                    value1 = Integer.parseInt(input1); // 입력받은 문자열을 int형으로 형변환

                    if (value1 < 0) { // 양의 정수(0포함) 조건 확인
                        System.out.println("양의 정수(0 포함)를 입력해주세요.");
                        continue;
                    }
                    break;
                } // try문에서 에러 발생시 실행
                catch (NumberFormatException e) { // 실수나 문자를 입력한 경우 Integer.parseInt(input1)에서 에러 발생
                    System.out.println("정수를 입력해주세요."); // 에러 처리
                }
            }

            while (true) { // 입력받는 숫자에 대한 예외처리 2
                System.out.print("두 번째 숫자를 입력하세요: ");
                // Scanner를 사용하여 문자열을 입력받음
                String input2 = sc.nextLine();
                try {
                    value2 = Integer.parseInt(input2); // 입력받은 문자열을 int형으로 형변환

                    if (value2 < 0) { // 양의 정수(0포함) 조건 확인
                        System.out.println("양의 정수(0 포함)를 입력해주세요.");
                        continue;
                    }
                    break;
                } // try문에서 에러 발생시 실행
                catch (NumberFormatException e) { // 실수나 문자를 입력한 경우 Integer.parseInt(input1)에서 에러 발생
                    System.out.println("정수를 입력해주세요."); // 에러 처리
                }
            }

            while (true) { // 입력받는 연산자에 대한 예외처리 1
                System.out.print("사칙연산 기호를 입력하세요: ");
                op = sc.nextLine();

                if (op.length() != 1) {
                    System.out.println("연산자를 잘못 입력하였습니다.\n +, -, *, / 중에 입력해주세요.");
                    continue;
                }

                try {
                    OperatorType.searchSymbol(op);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("연산자를 잘못 입력하였습니다.\n +, -, *, / 중에 입력해주세요.");
                }
            }

            calc.setValues(value1, value2, op); // 예외처리된 value1,value2,op에 대해 setter를 활용하여 클래스의 private 맴버변수를 설정
            calc.calculate(); // 연산 기능(calculate() 메서드 사용
            System.out.println("연산 결과 : " + calc.getResult()); // 연산 결과를 getter를 통해 가져와서 출력
            calc.removeResult(); // 가장 오래된 연산 결과 삭제

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            /* exit을 입력 받으면 반복 종료 */
            String exit = sc.nextLine();
            if(exit.equals("exit")) break;
        }
        sc.close();
    }
}
