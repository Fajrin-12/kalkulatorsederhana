/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorsederhana;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */

public class KalkulatorSederhana {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         String pilihan;
         int nilai1;
         int nilai2;
         int pangkat;
         int akar;
         double hasil;
         System.out.println("Masukkan pilihan yang ada dibawah");
         System.out.println("1. Perkalian");
         System.out.println("2. Pembagian");
         System.out.println("3. Perpangkatan");
         System.out.println("4. Perakaran");
         System.out.println("Pilihan anda : ");
         pilihan=input.nextLine();
         
         switch(pilihan){
             case "1":
                 System.out.println("Masukkan nilai 1 : ");
                 nilai1=input.nextInt();
                 System.out.println("Masukkan nilai 2: ");
                 nilai2=input.nextInt();
                 System.out.println(nilai1*nilai2);
                 break;
             case "2":
                 System.out.println("Masukkan nilai 1 : ");
                 nilai1=input.nextInt();
                 System.out.println("Masukkan nilai 2 : ");
                 nilai2=input.nextInt();
                 System.out.println(nilai1/nilai2);
                 break;
             case "3":
                 System.out.println("Masukkan nilai : ");
                 nilai1=input.nextInt();
                 System.out.println("Masukkan pangkat : ");
                 pangkat=input.nextInt();
                 hasil=Math.pow(nilai1,pangkat);
                 System.out.println(hasil);
                 break;
             case "4":
                 System.out.println("Masukkan nilai : ");
                 nilai1=input.nextInt();
                 System.out.println("Masukkan akar : ");
                 akar=input.nextInt();
                 hasil=Math.sqrt(nilai1);
                 System.out.println(hasil);
                 break;
             default:
                 System.out.println("Masukkan format yang sesuai di atas!!");
                 
         }
    }
    
}
