package pertemuanke5;

import java.util.Scanner;

public class PemilihanIF28 {

    public static void main(String[] args) {
        
        Scanner fauzi = new Scanner(System.in);

        boolean uktLunas;

        System.out.println("--- Cetak KRS SIAKAD---");
        System.out.print("Apakah UKt sudah lunas? (true/false): ");
        uktLunas = fauzi.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terferifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.");
        }
        fauzi.close();
    }
}
