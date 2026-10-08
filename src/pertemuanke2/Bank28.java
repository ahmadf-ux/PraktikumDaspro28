package  petemuanke2;
import java.util.Scanner;

public class Bank28 {
    public static void main(String[] args) {
        
       try (Scanner Bank28 = new Scanner(System.in);){

        int jml_tabungan_awal, lama_menabung;
        double presentase_bunga = 0.02, bunga, jml_tabungan_akhir;

        System.out.print("masukkan jumlah tabungan awal");
        jml_tabungan_awal = Bank28.nextInt();
        System.out.print("masukkan lama menabung anda");
        lama_menabung = Bank28.nextInt(); 

        bunga = lama_menabung * presentase_bunga * jml_tabungan_awal;
        jml_tabungan_akhir = bunga + jml_tabungan_awal;

        System.out.println("Bunga adalah " + bunga);
        System.out.println("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);
        
       }
    }
}
