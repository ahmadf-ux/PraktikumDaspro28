package pertemuanke13;

import java.util.Scanner;

public class BioskopWithScanner28 {
    public static void main(String[] args) {
        Scanner fauzi = new Scanner(System.in);

        int baris, kolom;
        String nama, pilihan;
        String penonton [][] = new String[4][2];
        
        while (true) { 
         System.out.print("Masukkan nama: ");
         nama = fauzi.nextLine();
         System.out.print("Masukkan baris: ");
         baris = fauzi.nextInt();
         System.out.print("Masukkan kolom: ");
         kolom = fauzi.nextInt();
         fauzi.nextLine();
         
         penonton[baris-1][kolom-1] = nama;

         System.out.print("Input penonton lainnya? (y/n): ");
         pilihan = fauzi.nextLine();

         if (pilihan.equalsIgnoreCase("n")) {
            break;
         }
        }
        fauzi.close();
    }
}
