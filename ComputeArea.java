/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ryanh
 */
public class ComputeArea {

    public static void main(String args[]) 
    {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);

 
         double diameter;
         double radius;
         double volume;


     System.out.println("Enter diameter"); 
     diameter = keyboard.nextDouble();

         radius = diameter /2;

         volume= (4.0/3.0)* 3.14 * (radius * radius * radius);

         System.out.println("The volume of your sphere is" +volume); 

    }
}
