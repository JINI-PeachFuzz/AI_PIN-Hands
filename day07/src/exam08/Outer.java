package exam08;

import exam02.Calculator;

public class Outer {
    void method() {
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };
        int result = cal.add(10, 20);
        System.out.println(result);


    }
}
