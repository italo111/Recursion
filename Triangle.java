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
public class Triangle {
    private int width;
    public Triangle(int aWidth){
        width = aWidth;
    }
    public int getArea(){
        //EXTREME CASE or smallest area
        if(width ==1){
            return 1;
        }
        Triangle smallerTriangle = new Triangle(width -1);
        int smallerArea = smallerTriangle.getArea();//calling itself, recursion
        return (smallerArea + width);
    }
}
