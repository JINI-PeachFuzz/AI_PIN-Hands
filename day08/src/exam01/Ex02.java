package exam01;

public class Ex02 {
    public static void main(String[] args) {
        add(10, 20);
    }

    public static int add(int num1, int num2) {
        // Ex02도 static이라 얘도 스태틱을 해준거 스태틱은 스태틱밖에 안되서
        try {
            return num1 + num2;
        } finally {
            System.out.println("무조건 실행!");
        }
    }
}