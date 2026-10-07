package pertemuanke3;

import java.util.Scanner;

public class MenghitungTotalBayar28 {
    public static void main(String[] args) {
       try (Scanner fauzi = new Scanner (System.in);) {

        double harga; 
        double potongan; 
        double jml_bayar;
        double diskon=0.15;

        harga=fauzi.nextDouble();

        potongan= diskon*harga;
        jml_bayar= harga-potongan;
        
        System.out.println("Jumlah yang harus anda bayar adalah Rp. " + jml_bayar);

       }
    }
}
