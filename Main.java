import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your money(USD): ");
        float num = sc.nextFloat();
        final int changeMoney = 23000;
        System.out.println("Your VND: " + num * changeMoney);
    }
}
