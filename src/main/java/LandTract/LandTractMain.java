/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LandTract;

import java.util.Scanner;

/**
 *
 * @author stephensmac
 */
public class LandTractMain {
    public static void main(String[] args) {
        //Setup Scanner 
        Scanner keyboard = new Scanner(System.in);
        
        //Create LandTracts
        LandTract ltract_1 = new LandTract(0,0);
        LandTract ltract_2 = new LandTract(0,0);
        
        //Get input(length, width) and set
        System.out.println("Enter length of LandTract 1:");
        ltract_1.setLength(keyboard.nextDouble());
        System.out.println("Enter width of LandTract 1:");
        ltract_1.setWidth(keyboard.nextDouble());
        System.out.println("Enter length of LandTract 2:");
        ltract_2.setLength(keyboard.nextDouble());
        System.out.println("Enter width of LandTract 2:");
        ltract_2.setWidth(keyboard.nextDouble());
        
        //Display Tracts and Compare
        System.out.println("Area of Land Tract 1: " + ltract_1.getArea());
        System.out.println("Area of Land Tract 2: " + ltract_2.getArea());
        if (ltract_1.equals(ltract_2)) {
            System.out.println("These Land Tracts are equal!");
        }else{
            System.out.println("These Land Tracts are NOT equal.");
        }
    }
}
