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
public class Sequence {
    
    private int total ;
    int [] arrayOdd;
    int [] arrayEven;
    public Sequence(){
        arrayOdd = new int [10];
        arrayEven = new int [10];
        total = 0;
    }
   int printOdd(int number){
        if(number ==1){
            arrayOdd[number-1]=1;
            System.out.print(arrayOdd[number-1] + ",");
          return 1;
            
        }
        printOdd(number-1);//recursion
        arrayOdd[number-1] = 1+2*(number-1);
        System.out.print(arrayOdd[number-1] + ",");
        return arrayOdd[number-1]; 
       
       

    }
   int printEven(int number){
       if(number ==1){
            arrayEven[number-1]=0;
            System.out.print(arrayEven[number-1] + ",");
          return 0;
            
        }
        printEven(number-1);//recursion
        arrayEven[number-1] = 2*(number-1);
        System.out.print(arrayEven[number-1] + ",");
        return arrayEven[number-1]; 
   }
   
    
}
