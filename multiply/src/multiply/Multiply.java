/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiply;

import java.util.Scanner;

/**
 *
 * @author sudeep
 */
public class Multiply {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        System.out.println("enter the number you want to:");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for (int i=0;i<=10; i++){
            int sum = n*i;
            System.out.printf("%d*%d= %d\n\n", n, i, sum);

        }
    }
    
}
