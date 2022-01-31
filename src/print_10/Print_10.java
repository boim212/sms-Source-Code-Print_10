/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package print_10;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Print_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
       
       int angka, counter, angkaBaru;
       String nama;
       
       angkaBaru = 10;
       counter = 0;
       nama = "FX BIMA YUDHA PRATAMA";
       
        System.out.print  ("Masukkan Angka = ");
        angka = input.nextInt();
        
            while(counter < angka)
            {
                System.out.printf ("%d. %s %n" , angkaBaru, nama);
                angkaBaru+=10;
                counter++;
            }
    }
}
