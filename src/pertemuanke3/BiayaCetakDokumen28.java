package pertemuanke3;

import java.util.Scanner;

public class BiayaCetakDokumen28 {

    public static void main(String[] args) {

        try (Scanner fauzi = new Scanner (System.in);){
            //deklarasi variable input
            int lembarDokumen;
            double biayaCetak = 500, biayaPenjilidan = 5000;
            //deklarasi variable proses dan output
            double totalBiaya;

            System.out.println("Lembar dokumen: ");
            lembarDokumen = fauzi.nextInt();

            totalBiaya = lembarDokumen * biayaCetak + biayaPenjilidan;
            System.out.println("Total biaya: " + totalBiaya);

        }
    }
}
