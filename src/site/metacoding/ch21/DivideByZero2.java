package site.metacoding.ch21;

import java.util.Scanner;

public class DivideByZero2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // InputMismatchException

        // 통신, 사용자입력 예외처리!!

        try {

            int x = sc.nextInt();// 문제가 없다. 버퍼가 비워져있다. 근데 문자열을 넣으면 버퍼가 안비워진다. 그러므로 타입변경
            int result = x / 0;
            System.out.println("받은 값 : " + x);
        } catch (Exception e) {
            System.out.println("============");
            System.out.println(e.getMessage());
            System.out.println("============");
            e.printStackTrace();
            sc.nextInt();// 버퍼를 비운다.
        }
    }
}