package com.ohgiraffers.section02.package_and_improt;

import com.ohgiraffers.section01.method.Calculator;

//import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;
//import static com.ohgiraffers.section01.method.Calculator.minNumberOf;
import static com .ohgiraffers.section01.method.Calculator.*;
public class Application2 {

    public static void main(String[] args) {
        
        //non-static method
        Calculator cal = new Calculator();
        int result = cal.plusTwoNumbers(10,20);
        System.out.println("result = " + result);

        int result2 = maxNumberOf(10,20); // import를 해 놔서 패키지명 안 붙혀도 됨
        System.out.println("result2 = " + result2);

        com.ohgiraffers.section02.test.Calculator calc =
                new com.ohgiraffers.section02.test.Calculator();

        int result3 = maxNumberOf(10,20);
        int result4 = minNumberOf(10,20);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
        
    }
}
