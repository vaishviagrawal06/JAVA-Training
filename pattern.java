// pattern printing
//5
//55
//555
//5555

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

         System.out.print("Enter number: ");
        int num = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                // 
                System.out.print(num);
            }
            System.out.println();
        }

    }
}
