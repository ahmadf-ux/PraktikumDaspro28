package pertemuanke12;
//uji wajib tambahan: nilai yang diinput = 60 + (28 mod 41) = 88

import java.util.Scanner;

public class ArrayNilai28 {

    public static void main(String[] args) {
        Scanner fauzi = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = fauzi.nextInt();
        }
        System.out.println();
        for (int i = 0; i < nilaiAkhir.length; i++) {
            // String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            // System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
            String status;
            if (nilaiAkhir[i] > 70) {
                status = "LULUS";
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
            }
        }
    }
}
