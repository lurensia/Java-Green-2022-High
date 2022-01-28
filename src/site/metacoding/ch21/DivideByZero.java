package site.metacoding.ch21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // InputMismatchException

        // 통신이나 사용자입력은 예외처리를 건다.
        boolean check = true;

        try {

            int x = sc.nextInt();
            int result = x / 0;
            System.out.println("받은 값" + x);// 타입과 다른 것을 넣었을 경우

        } catch (InputMismatchException e) {
            System.out.println("======================");
            System.out.println("문자는 넣지마요,좀...;;");
            System.out.println("======================");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("======================");
            System.out.println("0으로 나누지마요,좀...;;");
            System.out.println("======================");
            e.printStackTrace();
        }
    }
}
