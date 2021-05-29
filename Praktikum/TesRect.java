/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author ASUS
 */
public class TesRect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rect p = new Rect(1, 1, 4, 4);
        int a = p.x1;
        int b = p.y2;
        int c = p.x2;
        int d = p.y2;
        Rect q = new Rect(5, 6);
        p.move(1, 2);

        System.out.println("<" + p.x1 + "," + p.y1 + " is inside the union");
        System.out.println("[" + a + "," + b + ": " + c + "," + d + "] union [" + p.x1 + "," + p.y1 + "; " + p.x2 + "," + p.y2 + "] = [" + a + "," + b + "; " + p.x2 + "," + p.y2 + "]");
        System.out.println("[" + a + "," + b + ": " + c + "," + d + "] union [" + p.x1 + "," + p.y1 + "; " + p.x2 + "," + p.y2 + "] = [" + p.x1 + "," + p.y1 + "; " + c + "," + d + "]");
    }   
}

  
