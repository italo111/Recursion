
package central;

public class Square {
    
    private int width;
    public Square(int aWidth){
        width = aWidth;
    }
    public int getArea(){
        //EXTREME CASE or smallest area
        if(width ==3){
            return 9;
        }
        Square smallSquare = new Square(width -1);
        int smallerArea = smallSquare.getArea();//calling itself, recursion
        return (smallerArea + width + width-1);
    }


}
