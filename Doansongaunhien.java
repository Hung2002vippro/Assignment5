package assignment5;

import java.util.Scanner;

public class Doansongaunhien {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so ngau nhien bat ki tu 1 den 50: ");
        int n = scanner.nextInt();
        while(n<=50){
            System.out.print("Nhap so ban doan: ");
            int m = scanner.nextInt();
            if(m==n)
            {
                System.out.println("Chuc mung ban da doan dung so " + m);
                n=n+100;
            }
        }
            
    }

}
