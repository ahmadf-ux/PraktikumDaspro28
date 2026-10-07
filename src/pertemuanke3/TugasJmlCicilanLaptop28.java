package pertemuanke3;

import java.util.Scanner;

public class TugasJmlCicilanLaptop28 {

    public static void main(String[] args) {

        try (Scanner fauzi = new Scanner (System.in);){
            //deklarasi variable input
            int lamaCicilan;
            double harga,uangMuka;
            //deklarasi variable proses dan output
            double bunga = 0.02, sisaHarga, besarBunga, cicilanPokok, jumlahCicilan; 

            System.out.println("Lama cicilan: ");
            lamaCicilan = fauzi.nextInt();
            System.out.println("Harga: ");
            harga = fauzi.nextDouble();
            System.out.println("Uang muka: ");
            uangMuka = fauzi.nextDouble();

            sisaHarga = harga-uangMuka;
            besarBunga =  sisaHarga * bunga;
            cicilanPokok = sisaHarga/lamaCicilan;
            jumlahCicilan = cicilanPokok + besarBunga;

            System.out.println("Jumlah cicilan: " + jumlahCicilan);
            System.out.println("Cicilan pokok: " + cicilanPokok);
            System.out.println("Besar bunga: " + besarBunga);
            System.out.println("Sisa harga: " + sisaHarga);

        }
    }
}
