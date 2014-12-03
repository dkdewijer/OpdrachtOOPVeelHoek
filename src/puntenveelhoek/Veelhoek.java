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
 private String naam;
 private Punt[] veelhoekArray;
 private static final int DRIE = 3; //Hier haal ik the magic number weg
 /**
  * 
  * @param naam 
  */
public Veelhoek(String naam){
    this.naam = naam;
    
    //maak een array veelhoekArray aan en vul deze met 3 punten
    veelhoekArray = new Punt[3];
    veelhoekArray[0] = new Punt("P1");
    veelhoekArray[1] = new Punt("P2");
    veelhoekArray[2] = new Punt("P3");
}
/**
 * 
 * @param naam
 * @param aantalPunten 
 * Als het aantal punten dat de gebruiker opgeeft groter of gelijk is aan 3 gaat het door een for loop waarbij 
 */
public Veelhoek(String naam, int aantalPunten){
    this.naam = naam;
    if(aantalPunten >= DRIE){
    veelhoekArray = new Punt[aantalPunten];
    for(int j = 0; j < veelhoekArray.length; j++){
    veelhoekArray[j] = new Punt("P" + (j+1) );
   }
   } 
   else {
        System.out.println("Het aantal punten is niet 3 of groter");
        }
}

public void print(){
        //een method die de naam van de veelhoek, het aantal punten en de x- en y-coördinaten uitprint
        System.out.print("De veelhoek " + naam + " heeft " + veelhoekArray.length + " punten ");
        for(int i = 0; i < veelhoekArray.length; i++){
        veelhoekArray[i].display();
    }
}
/**
 * een method die de coördinaten veranderd en uitprint als het punt dat ingevoerd wordt niet bestaat
 * @param index
 * @param p 
 */
public void setPunt(int index, Punt p){
if(index < 0 && index > veelhoekArray.length){
    System.out.println("Het punt dat je wilt veranderen bestaat niet");
}
else{
veelhoekArray[index] = p;
}
}
/**
 * een method om acces te krijgen tot de lengte van de array veelhoekArray
 * @return de lengte van de array veelhoekArray
 */
public int getArrayLength(){
return veelhoekArray.length;
}
/**
 * 
 * @param dx
 * @param dy 
 */
public void verschuif(int dx,int dy){
 for(int i = 0; i < veelhoekArray.length; i++){
        veelhoekArray[i].verschuif(dx, dy);
}
}

}
