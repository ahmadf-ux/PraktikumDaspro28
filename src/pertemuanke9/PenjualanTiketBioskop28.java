//harga tiket = 40000 + (28 mod 6) * 2000 = 48000
//Syarat diskon pertama = 3 + (28 mod 3) = 4
//Diskon ke 1 = (8 + (28 mod 5))% = 11%
//Syarat diskon kedua = 8 + (28 mod 4) = 8
//Diskon ke 2 = (15 (28 mod 4))% = 15%

import java.util.Scanner;

public class PenjualanTiketBioskop28 {

    public static void main(String[] args) {
        Scanner fauzi = new Scanner(System.in);
        int hargaTiket = 48000, tiket = 1, totalTiket = 0, harga, banyaknyaTransaksi = 0;
        double hargaAkhir, diskonTiket, totalHarga = 0;

        while (tiket != 0) {
            System.out.println("=== Tiket Bioskop ===");
            System.out.println("Masukkan 0 untuk mengakhiri program.");
            System.out.print("Jumlah Tiket Bioskop: ");
            tiket = fauzi.nextInt();

            if (tiket == 0) {
                System.out.println("Program Penjualan Tiket Bioskop Telah Berakhir Untuk Hari ini.");
                break;
            }
            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid, silahkan ulangi inputnya.");
                continue;
            }
            harga = hargaTiket * tiket;
            diskonTiket = 0;
            double persentaseDiskon = 0;

            if (tiket > 8) {
                persentaseDiskon = 0.15;
                diskonTiket = harga * persentaseDiskon;
            } else if (tiket > 4) {
                persentaseDiskon = 0.11;
                diskonTiket = harga * persentaseDiskon;
            }
            hargaAkhir = harga - diskonTiket;

            System.out.println("-------------------------------------------");
            System.out.println("Jumlah Tiket \t\t: " + tiket);
            System.out.println("Harga Per Tiket\t\t: Rp " + hargaTiket);
            System.out.println("Total Harga\t\t: Rp " + harga);
            if (diskonTiket > 0) {
                System.out.println("Diskon (" + (persentaseDiskon * 100) + "%)          -Rp " + diskonTiket);
            } else {
                System.out.println("Diskon : -");
            }
            System.out.println("Total Bayar\t\t: Rp " + hargaAkhir);
            System.out.println("-------------------------------------------");

            totalTiket += tiket;
            totalHarga += hargaAkhir;
            banyaknyaTransaksi++;
        }
        System.out.println("===============================================================");
        System.out.println("Total Harga Penjualan Tiket Hari ini\t:" + totalHarga);
        System.out.println("Total Tiket Yang Terjual Hari ini\t:" + totalTiket);
        System.out.println("Banyaknya Transaksi Hari ini\t\t:" + banyaknyaTransaksi);
        System.out.println("===============================================================");
        fauzi.close();
    }
}
