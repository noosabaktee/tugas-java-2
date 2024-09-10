/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructors;

/**
 *
 * @author acer
 */
public class Bingo {
    Bingo(){
        String[] text = {"B", "I", "N", "G", "O"};
        int n = 0;
        for(int i=0;i<6;i++){
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o.");
            for(int j=0;j<3;j++){
                for(int k=0;k<n;k++){
                    System.out.print("(clap)");
                    if(k < text.length-1){
                        System.out.print("-");
                    }
                }
                for(int k=n;k<text.length;k++){
                    System.out.print(text[k]);
                    if(k < text.length-1){
                        System.out.print("-");
                    }
                }
                System.out.println();
            }
            System.out.println("And Bingo was his name-o. \n");
            n++;
        }
    }
}
