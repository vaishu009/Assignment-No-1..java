/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

import java.util.Scanner;

/**
 *
 * @author kanev
 */
public class AvegareUsingArray {
    public static void main(String args[]){

      //Reading total no.of elements
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of elements/numbers");
      int num = sc.nextInt();

      //Creating an array
      int[] myArray = new int[num];

      //Read numbers from user and store it in an array
      System.out.println("Enter the numbers one by one : ");
      System.out.println("Press Enter button after each number : ");

      for(int i =0; i<num; i++){
         myArray[i] = sc.nextInt();
      }

      //Calculate the average
      double average = 0;
      for(int i =0; i<num; i++){
         average = average + myArray[i];
      }

      average = average/num;
      System.out.println("Average of given numbers :: "+average);
   }
}
