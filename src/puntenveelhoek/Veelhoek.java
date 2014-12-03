/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntenveelhoek;

/**
 *
 * @author Dees
 */
public class Veelhoek {
    String naam;
    Punt[] veelhoekArray;
   
public Veelhoek(String naam){
    this.naam = naam;

    veelhoekArray = new Punt[3];

    veelhoekArray[0] = new Punt("P1");
    veelhoekArray[1] = new Punt("P2");
    veelhoekArray[2] = new Punt("P3");
}

public Veelhoek(String naam, int aantalPunten){
    this.naam = naam;
    if(aantalPunten >= 3){
    veelhoekArray = new Punt[aantalPunten];
   
    for(int j = 0; j < veelhoekArray.length; j++){
    veelhoekArray[j] = new Punt("P" + (j+1) );
   }
   
   } 
   else {
        System.out.println("Het aantal punten is niet 3 of groter");}
}
public void print(){
        System.out.print(" De veelhoek " + naam + " heeft " + veelhoekArray.length + " punten ");
        for(int i = 0; i < veelhoekArray.length; i++){
        veelhoekArray[i].display();
    }
}
public void setPunt(int index, Punt p){

}
}
