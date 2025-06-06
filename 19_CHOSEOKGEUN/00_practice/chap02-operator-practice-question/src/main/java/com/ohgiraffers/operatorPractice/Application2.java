/*
   * 임의의 정수 한개를 선언하고 해당 숫자가 13세 이하이면 어린이, 13세초과 ~ 19세 이하이면
   * 청소년, 19세 초과이면 성인이라고 출력되도록 작성하세요
   *
   * 19
   *
   * ------ 출력 결과 --------
   * 청소년                     */

package com.ohgiraffers.operatorPractice;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;

        // 반복
        while (true) {
            System.out.print("0 이외의 정수를 입력 하시오: ");
            age = sc.nextInt();

            if (age == 0) {
                System.out.println("0 이외의 정수를 다시 입력 하시오.");
            } else {
                break;
            }
        }
        if (age > 0 && age <= 13) {
            System.out.println("어린이");
        } else if (age > 13 && age <= 19) {
            System.out.println("청소년");
        } else if (age > 19) {
            System.out.println("성인");
        }
        sc.close();
    }
}

