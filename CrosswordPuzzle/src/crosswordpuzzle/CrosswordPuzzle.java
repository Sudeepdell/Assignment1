/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crosswordpuzzle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author sudeep
 */


   
        


    

    public class CrosswordPuzzle {

    private String ACROSS1="MONITOR";
    private String ACROSS2= "uncloud";
    private String ACROSS3= "magnet";
    private String ACROSS4= "malices";
    private String ACROSS5= "yakuza";
  
    
    private final String DOWN1 = "MUMMY";
    private final String DOWN2="oNNNA";
    private final String down3= "NCGLK";
    private final String down4= "ILNIU";
    private final String down5= "ILNIU";
    private final String down6= "OUTEA";
    private final String down7= "RDES";

    
    
    
    
    public void display(){
        System.out.println("----Across-----");
        System.out.println("\n(1) Output device which display?");
        System.out.println("\n(4) A japanese orginized crime syndicate similar to the mafia");
        System.out.println("\n(5) A piece of material that is able to attract certain metals");
        System.out.println("\n(6) hammer often made of rubber or sometimes wood, smaller than a maul or beetle");
        System.out.println("\n(7) to make clean or clear, to be free from ");
        
        System.out.println("----Down-----");
        System.out.println("\n(1) dead body of a human being preserved by the ancient egyption");
        System.out.println("\n(2) antonyms of in");
        System.out.println("\n(3) dried and prepared leaves of a shrub");
        
        

        
        
        getInput();
    }
    public static void main(String[] args) {
       CrosswordPuzzle cp =new CrosswordPuzzle();
       cp.display();
    }
    
    public void getInput(){
        System.out.println("Press d to Down\n press A to across");
        Scanner sc =new Scanner(System.in);
        String dataDA=sc.next();
        System.out.println("\nEnter the number you want to solve : ");
        sc=new Scanner(System.in);
        int dataint=sc.nextInt();
        System.out.println("\nEnter Your answer :");
        sc =new Scanner(System.in);
        String answer = sc.next();
        validateAnswer(dataDA, dataint, answer);
        
    }


    private void validateAnswer(String dataInput, int dataIntInput, String dataanswerInput) {
        if (dataInput.equalsIgnoreCase("d")&&dataIntInput==1&&dataanswerInput.equalsIgnoreCase(DOWN1)|| dataInput.equalsIgnoreCase("a")&&dataIntInput==1&&dataanswerInput.equalsIgnoreCase(ACROSS1)){
            System.out.println("Correct Answer");
            getInput();
        }
        else if (dataInput.equalsIgnoreCase("d")&&dataIntInput==2&&dataanswerInput.equalsIgnoreCase(DOWN2)|| dataInput.equalsIgnoreCase("a")&&dataIntInput==2&&dataanswerInput.equalsIgnoreCase(ACROSS2)){
            System.out.println("Correct Answer");
            getInput();
        }
        else if (dataInput.equalsIgnoreCase("d")&&dataIntInput==3&&dataanswerInput.equalsIgnoreCase(down3)|| dataInput.equalsIgnoreCase("a")&&dataIntInput==3&&dataanswerInput.equalsIgnoreCase(ACROSS3)){
            System.out.println("Correct Answer");
            getInput();
        }
        else if (dataInput.equalsIgnoreCase("d")&&dataIntInput==4&&dataanswerInput.equalsIgnoreCase(down4)|| dataInput.equalsIgnoreCase("a")&&dataIntInput==4&&dataanswerInput.equalsIgnoreCase(ACROSS4)){
             System.out.println("Correct Answer");
            getInput();
        }
        else if (dataInput.equalsIgnoreCase("d")&&dataIntInput==5&&dataanswerInput.equalsIgnoreCase(down5)|| dataInput.equalsIgnoreCase("a")&&dataIntInput==5&&dataanswerInput.equalsIgnoreCase(ACROSS5)){
            System.out.println("Correct Answer");
            getInput();
        }
        else if (dataInput.equalsIgnoreCase("d")&&dataIntInput==6&&dataanswerInput.equalsIgnoreCase(down6)|| dataInput.equalsIgnoreCase("a")){
            System.out.println("Correct Answer");
            getInput();
        }
        else if (dataInput.equalsIgnoreCase("d")&&dataIntInput==7&&dataanswerInput.equalsIgnoreCase(down7)|| dataInput.equalsIgnoreCase("a")){
            System.out.println("Correct Answer");
            getInput();
        }
        else{
            System.out.println("Wrong answer ");
            System.exit(0);
        }
        
       
    }

   
}