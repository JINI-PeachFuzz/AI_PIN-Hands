package exam05;

public class Ex01 {
    public static void main(String[] args) {
        Customer c1 = new Customer(1000, "이이름", "user01@test.org");
        Customer c2 = new Customer(1000, "이이름", "user01@test.org");
        System.out.printf("c1 == c2 : 동일성 ? %s%n", c1 == c2); // c1.toString()
        System.out.printf("c1.equals(c2) : 동등성  ? %s%n", c1.equals(c2));
    }
}