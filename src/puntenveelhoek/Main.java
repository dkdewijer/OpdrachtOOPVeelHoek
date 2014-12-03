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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       /*
         System.out.println("Opdracht A: ");
         Punt punt = new Punt("A", 1, 2);
         punt.display();
       */
       
       /*
        System.out.println("Opdracht B: ");
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
       
       /*
        System.out.println("Opdracht C: ");
        System.out.println("Wat is de naam van de veelhoek? ");
        String veelhoekNaamTest = input.next();
        
        System.out.println("Hoeveel punten zijn er? ");
         int aantalPuntenTest = input.nextInt();
       
        Veelhoek veelhoekTest = new Veelhoek(veelhoekNaamTest, aantalPuntenTest);
        veelhoekTest.print();
     */ 
       
      
        System.out.println("Opdracht D:");
        Veelhoek veelhoekTest = new Veelhoek("a");
       
        for(int i = 0; i < veelhoekTest.getArrayLength(); i++){
        System.out.println("Wat is de naam van het punt? ");
        String puntNaam = input.next();
                
        System.out.println("Wat is de x-coördinaat? ");
        int testX = input.nextInt();
        
        System.out.println("Wat is de y-coördinaat? ");
        int testY = input.nextInt();
        
        Punt test = new Punt(puntNaam,testX,testY);
        veelhoekTest.setPunt(i, test);
        }
        veelhoekTest.print();
        
       
        System.out.println("\nOpdracht E: ");
        System.out.println("Met hoeveel wil je de x-coördinaat veranderen?"); 
        int xVerander = input.nextInt();
        System.out.println("Met hoeveel wil je de y-coördinaat veranderen?"); 
        int yVerander = input.nextInt();
        veelhoekTest.verschuif(yVerander, yVerander);
        veelhoekTest.print();
    }
    }
