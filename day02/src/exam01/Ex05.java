package exam01;

public interface Ex05 {
    public static void main(String[] args) {
        int num1 = 10;
        int result = num1++ + 5;
        System.out.println(result);

        int result2 = ++num1 + 5;
        System.out.println(result2);
    }
}
