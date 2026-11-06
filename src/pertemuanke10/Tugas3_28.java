package pertemuanke10;
// Uji wajib: jumlahToko = 2 + (28 mod 3) = 3
import java.util.Scanner;
public class Tugas3_28 {
    public static void main(String[] args) {
        Scanner fauzi = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jmlToko = fauzi.nextInt();

        if (jmlToko <= 0) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int nomorToko = 1;
            int tokoTerbanyak = -1;
            int tokoTerbaik = 0;
            int barangSeluruhToko = 0;

            while (nomorToko <= jmlToko) {
                int barangPerToko = 0;
                int pelangganPerToko = 0;
                System.out.println("Toko " + nomorToko);
                System.out.print("Masukkan jumlah pelanggan: ");
                int pelanggan = fauzi.nextInt();
                if (pelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak valid, ulangi input.");
                    continue;
                }
                for (int j = 1; j <= pelanggan; j++) {
                    int barang;
                    do {
                        System.out.print("Barang dari pembeli " + j + ": ");
                        barang = fauzi.nextInt();
                        if (barang < 0) {
                            System.out.println("Barang harus lebih dari atau sama dengan 0 (tidak boleh minus), ulangi input.");
                        }
                    } while (barang < 0);
                    barangPerToko += barang;
                    pelangganPerToko = j;
                }
                System.out.println("Toko " + nomorToko + " - pelanggan: " + pelangganPerToko + ", total barang: " + barangPerToko);
                barangSeluruhToko += barangPerToko;
                if (barangPerToko > tokoTerbanyak) {
                    tokoTerbanyak = barangPerToko;
                    tokoTerbaik = nomorToko;
                }
                System.out.println();
                nomorToko++;
            }
            System.out.println("==================================");
            System.out.println("Total barang seluruh toko: " + barangSeluruhToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbaik);
        }
        fauzi.close();
    }
}
