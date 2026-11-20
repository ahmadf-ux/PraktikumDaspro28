package pertemuanke12;
//uji wajiba tambahan: key = 50 + (28 mod 50) = 78

import java.util.Scanner;

public class SearchNilai28 {
    public static void main(String[] args) {
        Scanner fauzi = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen dari array nilai: ");
        int elemen = fauzi.nextInt();

        int[] nilai = new int[elemen];
        //int key = 100;
        //int key = 90;
        // int key = 78;
        boolean ditemukan = false;

        System.out.println("======================================");
        for (int j = 0; j < nilai.length; j++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (j + 1) + ": ");
            nilai[j] = fauzi.nextInt();
        }

        System.out.println("======================================");
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = fauzi.nextInt();
        System.out.println();

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan pada array nilai yang berjumlah " + elemen + ".");
        }
        fauzi.close();
    }
}
