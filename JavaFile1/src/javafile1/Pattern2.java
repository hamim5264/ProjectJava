/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafile1;

/**
 *
 * @author Win-10
 */
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, col, row;
        System.out.print("Enter line number: ");
        n = input.nextInt();
        for (row=n; row>=1; row--){
            for(col=1; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
            
        }
    }
    
}
