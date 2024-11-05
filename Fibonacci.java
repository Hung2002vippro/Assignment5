package assignment5;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap do dai day Fibo: ");
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        int kq = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(kq + ", ");
            a = b;
            b = kq;
            kq = a + b;
        }

    }

}
