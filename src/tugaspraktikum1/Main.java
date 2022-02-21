/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum1;

import java.util.Scanner;

/**
 *
 * @author Fadhil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        double suhuawal;
        System.out.println("+===========================+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+===========================+");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu Dalam Celcius\t: ");
        suhuawal = input.nextDouble();
        do{
            ProsesKonversi Celcius = new ProsesKonversi(suhuawal);
            System.out.println("");
            System.out.println("Opsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih\t: ");
            pilihan=input.nextInt();
            if(pilihan == 1){
                System.out.println("");
                System.out.println("Suhu dalam Celcius\t: " + suhuawal + "°C");
                System.out.println("Dalam Fahrenheit\t: " + Celcius.Fahrenheit() + "°F");
                System.out.println("Dalam Reamur\t\t: " + Celcius.Reamur() + "°R");
                System.out.println("Dalam Kelvin\t\t: " + Celcius.Kelvin() + "K");
                System.out.println("Kondisi Air " + Celcius.kondisi());
            }
            else if(pilihan == 2){
                System.out.println("\nInput Data");
                System.out.println("----------");
                System.out.print("Suhu Dalam Celcius\t: ");
                suhuawal = input.nextDouble();
            }
            else if(pilihan != 3){
                System.out.println("\nOpsi tidak ada. Mohon masukkan opsi dengan benar");
            }
        }while(pilihan!=3);
    }
    
}
