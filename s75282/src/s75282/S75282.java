/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s75282;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class S75282 {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("ENTER THE FIRST INTEGER :");
        int num1=input.nextInt();
         System.out.println("ENTER THE SECOND INTEGER :");
        int num2=input.nextInt();
        
        
        int square1=num1*num1;
        int square2= num2*num2;
        int sumofsquare = square1 + square2;
       int diffsquare = square1 - square2;
       
        
        System.out.println ("THE SUM OF SQUARE IS " +sumofsquare);
                System.out.println ("THE DIFFERENCES OF SQUARE IS " +diffsquare);
    }
    
}