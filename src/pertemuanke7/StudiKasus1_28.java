package pertemuanke7;
import java.util.Scanner;

public class StudiKasus1_28 {
    public static void main(String[] args) {
     Scanner fauzi = new Scanner(System.in);
     int hargaPerCup = 19000, jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;

     System.out.print("Masukkan jumlah cup: ");
     jumlahCup = fauzi.nextInt();
     System.out.print("Jumlah uang yang dibayarkan: ");
     uangBayar = fauzi.nextInt();

     totalHarga = jumlahCup * hargaPerCup;
    diskon = 0;
     
     if (totalHarga >= 110000) {
         diskon = totalHarga * 9/100;
     } else {
        diskon = 0;
     }
     totalBayar = totalHarga - diskon;
     System.out.println("Total harga: " + totalHarga);
     System.out.println("Banyak diskon: " + diskon);
     System.out.println("Total yang harus dibayar: " + totalBayar);

     if (uangBayar >= totalBayar) {
         kembalian = uangBayar - totalBayar;
         System.out.println("Kembalian" + kembalian);
     } else {
        kurang = totalBayar - uangBayar;
        System.out.println("Uang tidak cukup kurang Rp" + kurang);
     }
     fauzi.close();
    }
}
