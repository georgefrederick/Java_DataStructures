/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Fredinand
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r = new Scanner (System.in);
        int [] numArray;
        int count;
        int num;
        int remaining;
        
        numArray = new int [100];
        count = 0;
        remaining = 0;
        
        System.out.println("Enter number to enter to the array");
        while(true){
            num = r.nextInt();
            
            if(num <=0)
                break;
            count++;
            numArray[count] = num;
            System.out.println("Number "+count);
        }
        System.out.println(Arrays.toString(numArray));
        System.out.print("The remaining seats are: ");
        remaining += numArray.length-numArray[count];
        System.out.println(remaining);
    }
}
