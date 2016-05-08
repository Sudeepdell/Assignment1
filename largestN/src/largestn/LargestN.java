/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestn;
import java.util.*;
/**
 *
 * @author sudeep
 */
public class LargestN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int large =0;
        int num;
        System.out.println("enter the number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i=0; i<n; i++)
        {
            num = input.nextInt();
            if (num>large){
                large =  num;
            }
           System.out.println("the largest is:"+large);//give the largest number in n number
    
        }
    }
    
}
