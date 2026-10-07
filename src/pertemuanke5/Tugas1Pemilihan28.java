package pertemuanke5;

import java.util.Scanner;

public class Tugas1Pemilihan28 {

    public static void main(String[] args) {
        
        try (Scanner fauzi = new Scanner(System.in);) {

        boolean uktLunas;

        System.out.println("--- Cetak KRS SIAKAD---");
        System.out.print("Apakah UKt sudah lunas? (true/false): ");
        uktLunas = fauzi.nextBoolean();

        String pesan = (uktLunas) ? "Pembayaran UKT terferifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA": "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.";
        
        System.out.println(pesan);
        }
    }
}
