package pertemuanke3;

import java.util.Scanner;

public class MenghitungLuasPersegiPanjang28 {

    public static void main(String[] args) {

        try (Scanner fauzi = new Scanner (System.in);) {

        int panjang;
        int lebar;
        int luas;

        System.out.println("masukkan panjang: " );
        panjang=fauzi.nextInt();
        System.out.println("masukkan lebar: ");
        lebar=fauzi.nextInt();

        luas=panjang*lebar;
        System.out.println("Luas persegi adalah " + luas);
        
        }
    }
}
