package pertemuanke10;
// Baris dan Kolom (uji 1): (2 + (28 mod 3) = 3, 4 + (28 mod 3) = 5)
// Baris dan Kolom (uji 2): (5 + (28 mod 3) = 6, 2 + (28 mod 3) = 3)
// Baris dan Kolom Pertanyaan 2: (4 + (28 mod 4) = 4, 6 + (28 mod 4) = 6)

import java.util.Scanner;

public class Rectangle28 {

    public static void main(String[] args) {
        Scanner fauzi = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = fauzi.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = fauzi.nextInt();
        for (int i = 1; i <= baris; i++) {          //outer loop: baris 
            for (int j = 1; j <= kolom; j++) {      //inner loop: kolom 
                System.out.print("#");
            }
            System.out.println();                   //pindah baris
        }
        fauzi.close();
    }
}
