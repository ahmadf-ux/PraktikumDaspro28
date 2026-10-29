package pertemuanke9;
//hargaKopi = 10000 + (28 mod 5) * 1000 = 13000
//hargaTeh = 5000 + (28 mod 4) * 1000 = 5000
//hargaRoti = 15000 + (28 mod 6) * 1000 = 19000
import java.util.Scanner;
public class KafeDoWhile28 {
    public static void main(String[] args) {
        Scanner fauzi = new Scanner(System.in);
        int kopi, teh, roti, totalHarga;
        String namaPelanggan;
        int hargaKopi = 13000, hargaTeh = 5000, hargaRoti = 19000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = fauzi.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = fauzi.nextInt();
            System.out.print("Jumlah teh: ");
            teh = fauzi.nextInt();
            System.out.print("Jumlah roti: ");
            roti = fauzi.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp. " + totalHarga);
            fauzi.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
        fauzi.close();
    }
}
