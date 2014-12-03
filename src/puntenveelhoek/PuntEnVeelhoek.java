/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package puntenveelhoek;

import java.util.Scanner;

/**
 *
 * @author Dees
 */
public class PuntEnVeelhoek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
     /*  Punt punt = new Punt("A", 1, 2);
         punt.Display();
       
        System.out.println("Wat is de naam van het punt? ");
        String puntNaam = input.next();
                
        System.out.println("Wat is de x-coördinaat? ");
        int testX = input.nextInt();
        
        System.out.println("Wat is de y-coördinaat? ");
        int testY = input.nextInt();
        
        Punt test = new Punt(puntNaam,testX,testY);
        
        System.out.println("Met hoeveel wil je de x-coördinaat veranderen? ");
        int testVeranderX = input.nextInt();
        
        System.out.println("Met hoeveel wil je de x-coördinaat veranderen? ");
        int testveranderY = input.nextInt();
        
        test.verschuif(testVeranderX,testveranderY);
        test.display();
       */
        
        System.out.println("Wat is de naam van de veelhoek? ");
        String veelhoekNaamTest = input.next();
        
        System.out.println("Hoeveel punten zijn er? ");
         int aantalPuntenTest = input.nextInt();
       
        Veelhoek veelhoekTestMeeh = new Veelhoek("skuuuurt");
        Veelhoek veelhoekTest = new Veelhoek(veelhoekNaamTest, aantalPuntenTest);
        veelhoekTestMeeh.print();
        veelhoekTest.print();
        
      
    }
    
}
