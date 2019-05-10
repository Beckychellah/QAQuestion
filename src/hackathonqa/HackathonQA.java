/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackathonqa;

import java.util.Scanner;

/**
 *
 * @author NAOMI
 */
public class HackathonQA {

    public int i = 0;
    public int n = 0;

    public static void main(String[] args) {
        // initialize i and n to 0
        int i = 0;
        int n = 0;

        //we need to capture input of i and n
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        n = input.nextInt();
        System.out.print("Enter i: ");
        i = input.nextInt();

        //Validate the inputs following the constraints given 2<n<20 & 1<i<10
        if ((n <= 2 || n >= 20) || (i <= 1 || i >= 10)) {
            System.out.println(" enter valid numbers");
            System.exit(1);
        } 
        //if validation passes do this
        else {
            
            multiply(n, i);
        }

    }
    
     //func to multiply
    public static void multiply(int n, int i) {
        
   //loop through the values of i and multiply n by that value
        for (int increament = 1; increament <= i; increament++) {
            System.out.println(n + " * " + increament + " = " + n * increament);
         
        }


    }

}
