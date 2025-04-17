package lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* 반복문 사용 해서 연산을 반복 */
        while (true) {
            Scanner sc = new Scanner(System.in);
            int value1 = 0;
            int value2 = 0;

            while(true) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                value1 = sc.nextInt();

                if (value1 < 0) { // 양의 정수(0포함) 조건 확인
                    System.out.println("양의 정수(0 포함)를 입력해주세요.");
                    continue;
                }
                break;
            }

            while(true) {
                System.out.print("두 번째 숫자를 입력하세요: ");
                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                value2 = sc.nextInt();

                if (value2 < 0) { // 양의 정수(0포함) 조건 확인
                    System.out.println("양의 정수(0 포함)를 입력해주세요.");
                    continue;
                }
                break;
            }

            sc.nextLine(); // ← 버퍼에 남은 줄바꿈 제거
            System.out.print("사칙연산 기호를 입력하세요: ");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            char op = sc.nextLine().charAt(0);

            int result = 0; // 연산 결과

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
            System.out.println("연산 결과 : " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            /* exit을 입력 받으면 반복 종료 */
            String exit = sc.nextLine();
            if(exit.equals("exit")) break;
        }
    }
}
