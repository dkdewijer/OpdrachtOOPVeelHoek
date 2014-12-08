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
public class Punt {

    public String naam;
    public int x;
    public int y;

    /**
     *
     * @param naam
     */
    public Punt(String naam) {
        this.naam = naam;
        this.x = 0;
        this.y = 0;
    }

    /**
     *
     * @param naam
     * @param x
     * @param y
     */
    public Punt(String naam, int x, int y) {
        this.naam = naam;
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.print(this.naam + "(" + this.x + "," + this.y + ")");
    }

    /**
     *
     * @param dx
     * @param dy
     */
    public void verschuif(int dx, int dy) {
        x += dx;
        y += dy;

    }

}
