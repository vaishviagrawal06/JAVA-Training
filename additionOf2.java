// sum of 2 no.

import java.util.Scanner;

class main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter value of a");
        int a= sc.nextInt();
        System.out.println("enter value of b");

        int b= sc.nextInt();

        int sum = a+b;

        System.out.println("the sum is :" +sum);
    }
}