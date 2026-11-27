package pertemuanke13;

import java.util.Scanner;

public class BioskopWithScanner28 {

    public static void main(String[] args) {
        Scanner fauzi = new Scanner(System.in);

        int baris, kolom, menu;
        String nama, pilihan;
        String penonton[][] = new String[4][2];
        boolean kondisi = false;

        while (!kondisi) {
            System.out.println("=============== MENU ===============");
            System.out.println("1. Menginput data penonton");
            System.out.println("2. Tampilkan data penonton");
            System.out.println("3. Keluar dari program");
            System.out.print("Masukkan menu yang ingin dipilih (1,2,3): ");
            menu = fauzi.nextInt();
            fauzi.nextLine();
            System.out.println("====================================");
            switch (menu) {
                case 1:
                    while (true) {
                        System.out.println();
                        System.out.print("Masukkan nama: ");
                        nama = fauzi.nextLine();
                        System.out.print("Masukkan baris: ");
                        baris = fauzi.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = fauzi.nextInt();
                        fauzi.nextLine();

                        penonton[baris - 1][kolom - 1] = nama;

                        System.out.print("Input penonton lainnya? (y/n): ");
                        pilihan = fauzi.nextLine();

                        if (pilihan.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("==================== DATA PENONTON ===================");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.println("Penonton baris ke-" + (i + 1) + ": " + String.join(",", penonton[i]));
                    }
                    System.out.println("======================================================");
                    break;
                case 3:
                    System.out.println();
                    System.out.println("PROGRAM BERAKHIR");
                    kondisi = true;

                    break;
                default:
                    System.out.println("Menu yang dimasukkan salah! Lakukan input ulang!");
                    break;
            }
        }
        fauzi.close();
    }
}
