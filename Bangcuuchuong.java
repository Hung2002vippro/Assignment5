package assignment5;

import java.util.Scanner;

public class Bangcuuchuong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap bang cuu chuong(tu 1 den 10): ");
        int kq;
        int n = scanner.nextInt();
        for(int i=1;i<=10;i++){
            kq=n*i;
            System.out.println(n+" * "+i+" = "+kq);
        }
    }

}
