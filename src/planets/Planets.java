/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planets;

/**
 *
 * @author SamuelAaron
 * This is a collaboration with me and Nicole.
 * I am trying to make a user interface using Swing GUI JApplet but I can't seem to relate it with the Planets class.
 * I will be including the JApplet file with the GUI that I conceptualized.
 */
import java.util.Scanner;
public class Planets {

    public static void main(String[] args) {
        
        /* These are the input scanners for the selected planet and weight of the object */
        Scanner input = new Scanner (System.in);
        Scanner weight = new Scanner (System.in);
        
        /* These are the input values required for the code */
        int option = 0;
        double personWeight = 0;
        
        /* This is the resultant value after weight calculation */
        double resultWeight;
        
        /* These are the proportional weight value of an object on Sol's planets*/
        double Jupiter = 2.64;
        double Mars = 0.38;
        double Mercury = 0.37;
        double Neptune = 1.12;
        double Pluto = 0.04;
        double Saturn = 1.15;
        double Uranus = 1.15;
        double Venus = 0.88;
        
        /* Here is the printed menu for the Loopy Planets */
        System.out.println("******************************************");
        System.out.println("************* Menu of Planets ************");
        System.out.println("************* ==== == ======= ************");
        System.out.println("1. Jupiter       2. Mars        3. Mercury");
        System.out.println("4. Neptune       5. Pluto       6. Saturn ");
        System.out.println("7. Uranus        8. Venus       9. <Quit> ");
        System.out.println("******************************************");
        
        /* This will require the user to input an integer that corresponds to their selected Planet. */
        System.out.println("*Please enter number of selected planet: *");
        option = input.nextInt();
        
        /* This is the main logic for the code */
        if (option >= 1 && option <= 8) {
            
            /* This will require the user their weight in a double value. */
            System.out.println("****Please enter your weight on Earth: ***");
            personWeight = weight.nextDouble();
            
            switch (option) {
                case 1:
                    resultWeight = Jupiter * personWeight;
                    System.out.println("Your weight on Jupiter is " + resultWeight);
                    break;
                case 2:
                    resultWeight = Mars * personWeight;
                    System.out.println("Your weight on Mars is " + resultWeight);
                    break;
                case 3:
                    resultWeight = Mercury * personWeight;
                    System.out.println("Your weight on Mercury is " + resultWeight);
                    break;
                case 4:
                    resultWeight = Neptune * personWeight;
                    System.out.println("Your weight on Neptune is " + resultWeight);
                    break;
                case 5:
                    resultWeight = Pluto * personWeight;
                    System.out.println("Your weight on Pluto is " + resultWeight);
                    break;
                case 6:
                    resultWeight = Saturn * personWeight;
                    System.out.println("Your weight on Saturn is " + resultWeight);
                    break;
                case 7:
                    resultWeight = Uranus * personWeight;
                    System.out.println("Your weight on Uranus is " + resultWeight);
                    break;
                case 8:
                    resultWeight = Venus * personWeight;
                    System.out.println("Your weight on Venus is " + resultWeight);
                    break;
            }
        }
        else if (option == 9) {
            System.out.println("Thanks for not trying!");
        }
        else {
            System.out.println("Invalid option!");
        }
    }
}