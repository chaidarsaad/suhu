/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class suhuair {
    public static void main(String[]args){
        /* pemakaian IF tiga kasus : wujud air*/
        
        //kamus
        float C;
        //program
        System.out.println("Contoh IF tiga kasus");
        System.out.print("Masukkan Celcius = ");
        //scanner untuk masukan suhu air
        Scanner scanner = new Scanner(System.in);
        C = scanner.nextFloat(); //masukan suhu air dengan tipe float
        //proses pengecekan dengan if
        if (C < 0) {
            System.out.println("Wujud air beku " + C);
        } else if ((0 <= C) && (C <= 100)){
            System.out.println("Wujud air cair " + C);
        } else if (C > 100){
            System.out.println("Wujud air uap/gas " + C);
        }   
        //konversi suhu
        System.out.println("========Konversi Suhu========");
        float reamur = (float) (0.8*C); // konversi ke reamur
        float fahrenheit = (float) (1.8*C+32); // konversi ke fahrenheit
        float kelvin = (float) (C+273.15); // konversi ke kelvin
        System.out.println("Reamur = " + reamur);
        System.out.println("Fahrenheit = " + fahrenheit);
        System.out.println("kelvin = " + kelvin);
    }
}