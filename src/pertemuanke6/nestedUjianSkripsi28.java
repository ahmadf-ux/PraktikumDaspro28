package pertemuanke6;
import java.util.Scanner;

public class nestedUjianSkripsi28 {
    public static void main(String[] args) { 
        try (Scanner fauzi = new Scanner(System.in)) {
            String pesan;
            
            System.out.print("Apakah mahasiswa sudah bebas kompen? (ya/tidak): ");
            String bebasKompen = fauzi.nextLine().trim();
            
            System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
            int bimbinganP1 = fauzi.nextInt();
            System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
            int bimbinganP2 = fauzi.nextInt();
            
            if (bebasKompen.equalsIgnoreCase("Ya")) {
                if (bimbinganP1 >= 9 && bimbinganP2 >= 4) {
                    pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
                } else if (bimbinganP1 < 9 && bimbinganP2 < 4) {
                    pesan = "Gagal! Log bimbingan P1 kurang dari 9 kali dan log bimbingan P2 kurang dari 4 kali";
                } else if (bimbinganP1 <9){
                    pesan = "Gagal! Log bimbingan P1 belum mencapai 9 kali";
                } else {
                    pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
                }
            } else {
                pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
            }
            
            System.out.println(pesan);
        //fauzi.close();
        }
    }
}
