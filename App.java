/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package central;

/**
 *
 * @author OWNER
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        System.out.println("program that uses recursion");
        System.out.println("the area  of a right triangle of side 5:");
        Triangle t = new Triangle(5);
        System.out.println(t.getArea());
        System.out.println("the area of a square of side 5:");
        Square s = new Square(5);
        System.out.println(s.getArea());
       // Sentence sen = new Sentence("tt");
       
        Sequence seq = new Sequence();
        System.out.println("the first 5 odd numbers:");
        seq.printOdd(5);
        System.out.println();
         System.out.println("the first 5 even numbers:");
        seq.printEven(5);
        
        
    }
    
}
