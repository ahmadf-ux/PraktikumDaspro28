package pertemuanke6;
import java.util.Scanner;

public class diskonTokoBuku28 {
    public static void main(String[] args) {
        try (Scanner fauzi = new Scanner(System.in)) {
            boolean rabu = true;
            String jenisBuku;
            int jmlBuku = 0;
            double dskDasarKamus = 0.11, dskTambahankamus = 0.02, dskDasarNovel = 0.05, dskTambahanNovel1 = 0.02, dskTambahanNovel2 = 0.01, dskBukuLain = 0.03, totalDsk = 0;
            double hargaBuku = 0, totalHarga, nominalDiskon, totalBayar;

     if (rabu) {
                System.out.println("Mendapatkan diskon");
                System.out.print("Masukkan jenis buku: ");
                jenisBuku = fauzi.nextLine();
                System.out.print("Masukkan jumlah buku: ");
                jmlBuku = fauzi.nextInt();
                if (jenisBuku.equalsIgnoreCase("Kamus") && jmlBuku > 2) {
                    System.out.print("Masukkan harga kamus: ");
                    hargaBuku = fauzi.nextDouble();
                    totalDsk = dskDasarKamus + dskTambahankamus;
                    System.out.println("Selamat anda mendapatkan diskon sebesar: " + totalDsk);
                } else if (jenisBuku.equalsIgnoreCase("Kamus") && jmlBuku <= 2) {
                    System.out.print("Masukkan harga kamus: ");
                    hargaBuku = fauzi.nextDouble();
                    totalDsk = dskDasarKamus;
                    System.out.println("Selamat anda mendapatkan diskon sebesar: " + totalDsk);
                } else if (jenisBuku.equalsIgnoreCase("Novel") && jmlBuku >3) {
                    System.out.print("Masukkan harga novel: ");
                    hargaBuku = fauzi.nextDouble();
                    totalDsk = dskDasarNovel + dskTambahanNovel1;
                    System.out.println("Selamat anda mendapatkan diskon sebesar: " + totalDsk);
                } else if (jenisBuku.equalsIgnoreCase("Novel") && jmlBuku <= 3){
                    System.out.print("Masukkan harga novel: ");
                    hargaBuku = fauzi.nextDouble();
                    totalDsk = dskDasarNovel + dskTambahanNovel2;
                    System.out.println("Selamat anda mendapatkan diskon sebesar: " + totalDsk);
                } else if (jmlBuku > 3) {
                    System.out.print("Masukkan harga buku: ");
                    hargaBuku = fauzi.nextDouble();
                    totalDsk = dskBukuLain;
                    System.out.println("Selamat anda mendaparkan diskon sebesar: " + totalDsk);
                } else {
                    System.out.println("Anda tidak mendapatkan diskon untuk pembelian ini.");
                }
     } else {
            System.out.println("Tidak mendapatkan diskon");
     } 
     totalHarga = hargaBuku * jmlBuku;
        nominalDiskon = totalHarga * totalDsk;
      totalBayar = totalHarga - nominalDiskon;

      System.out.println("Jumlah Diskon: " + nominalDiskon);
      System.out.println("Total yang harus dibayar: " + totalBayar);

      //fauzi.close();
            }
    }
}





//System.out.print("Masukkan harga kamus: ");
  //      hargaKamus = fauzi.nextDouble();
    //    System.out.print("Masukkan harga novel: ");
      //  hargaNovel = fauzi.nextDouble();
        //System.out.print("Masukkan harga buku lain: ");
        //hargaBukuLain = fauzi.nextDouble();