/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threenumber;

import java.util.Scanner;

/**
 *
 * @author sudeep
 */
public class ThreeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, num3;
        // Read 1st number;
        System.out.println("Enter the fisrt number :");
        Scanner sc =new Scanner(System.in);
        num1 = sc.nextInt();
        
        //Read 2nd number
        System.out.println("enter 2nd number");
        num2 = sc.nextInt();
        
        //Read 3rd number
        System.out.println("enetr 3rd number");
        num3 = sc.nextInt();
        //Find the larget number
        if (num1 > num2) {
            System.out.println("the larget number:" + num1);
        } else if (num2 >  num3){
            System.out.println("the largest number:" + num2);
        } else {
            System.err.println("the larget number:" + num3);
        }
    }

}

    }
    
}
