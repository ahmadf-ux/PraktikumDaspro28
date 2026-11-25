package pertemuanke12;
//uji wajib: jumlah item pesanan = 2 + (28 mod 4) = 2
//uji wajib: indeks menu yang wajib dipesan = 28 mod 7 = 0
import java.util.Scanner;
public class Aplikasi_Pemesanan_Kafe_Kampus28 {
    public static void main(String[] args) {
        Scanner fauzi = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("========================================================");
        System.out.println("MENU:");
        for (int i = 0; i < harga.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        System.out.println("========================================================");

        System.out.println();
        System.out.print("Masukkan jumlah menu yang ingin dipesan: ");
        int item = fauzi.nextInt();
        fauzi.nextLine();
        System.out.println();
        String[] pesanan = new String[item];
        int[] biayaPesanan = new int[item];
        int total = 0;

        for (int i = 0; i < pesanan.length; i++) {
            boolean ditemukan = false;
            do {
                System.out.println();
                System.out.print("Masukkan nama menu yang ingin dipesan: ");
                pesanan[i] = fauzi.nextLine();
                String key = pesanan[i];
                for (int j = 0; j < menu.length; j++) {
                    if (key.equalsIgnoreCase(menu[j])) {
                        biayaPesanan[i] = harga[j];
                        System.out.println("Harga menu " + menu[j] + " : " + harga[j]);
                        ditemukan = true;
                        total += harga[j];
                        break;
                    }
                }
                if (!ditemukan) {
                    System.out.println("Menu yang anda masukkan tidak tersedia.");
                }
            } while (!ditemukan);
        }
        System.out.println();
        System.out.println("============== DAFTAR PESANAN ==============");
        for (int i = 0; i < biayaPesanan.length; i++) {
            System.out.println("Pesanan ke-" + (i + 1) + ": " + pesanan[i]);
            System.out.println("Harga untuk menu tersebut: " + biayaPesanan[i]);
        }
        System.out.println();
        System.out.println("Total biaya: " + total);
        System.out.println("============================================");
        fauzi.close();
    }
}
