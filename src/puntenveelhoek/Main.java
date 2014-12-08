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

        System.out.println("Opdracht A: ");
        Punt punt = new Punt("A", 1, 2);
        punt.display();

        System.out.println("\nOpdracht B: ");
        System.out.println("Wat is de naam van het punt? ");
        String puntNaam = input.next();

        System.out.println("Wat is de x-coördinaat? ");
        int testX = input.nextInt();

        System.out.println("Wat is de y-coördinaat? ");
        int testY = input.nextInt();

        Punt test = new Punt(puntNaam, testX, testY);

        System.out.println("Met hoeveel wil je de x-coördinaat veranderen? ");
        int testVeranderX = input.nextInt();

        System.out.println("Met hoeveel wil je de x-coördinaat veranderen? ");
        int testveranderY = input.nextInt();

        test.verschuif(testVeranderX, testveranderY);
        test.display();

        System.out.println("\nOpdracht C: ");
        System.out.println("Wat is de naam van de veelhoek? ");
        String veelhoekNaamTest = input.next();

        System.out.println("Hoeveel punten zijn er? ");
        int aantalPuntenTest = input.nextInt();

        Veelhoek veelhoekTest = new Veelhoek(veelhoekNaamTest, aantalPuntenTest);
        veelhoekTest.print();

        System.out.println("\nOpdracht D:");
        Veelhoek veelhoekTestTwee = new Veelhoek("a");

        for (int i = 0; i < veelhoekTestTwee.getArrayLength(); i++) {
            System.out.println("Wat is de naam van het punt? ");
            String puntNaamTwee = input.next();

            System.out.println("Wat is de x-coördinaat? ");
            int testXTwee = input.nextInt();

            System.out.println("Wat is de y-coördinaat? ");
            int testYTwee = input.nextInt();

            Punt testTwee = new Punt(puntNaamTwee, testXTwee, testYTwee);
            veelhoekTestTwee.setPunt(i, testTwee);
        }
        veelhoekTestTwee.print();

        System.out.println("\nOpdracht E: ");
        System.out.println("Met hoeveel wil je de x-coördinaat veranderen?");
        int xVerander = input.nextInt();
        System.out.println("Met hoeveel wil je de y-coördinaat veranderen?");
        int yVerander = input.nextInt();
        veelhoekTestTwee.verschuif(yVerander, yVerander);
        veelhoekTestTwee.print();

    }
}
