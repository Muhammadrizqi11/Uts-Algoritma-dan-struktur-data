/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class no3 {
         public static void main(String[] args){
        int matriks[][] = new int[2][3];
       
        
        matriks[0][0] = 1;
        matriks[0][1] = 2;
        matriks[0][2] = 3;
        matriks[1][0] = 4;
        matriks[1][1] = 5;
        matriks[1][2] = 6;
        
        
        for (int i=0; i < matriks.length; i++){
            for (int j=0; j < matriks[i].length; j++){
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Muhammad Rizqi");
    }
}
