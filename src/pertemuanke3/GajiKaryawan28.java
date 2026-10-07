package pertemuanke3;

import java.util.Scanner;

public class GajiKaryawan28 {
    
    public static void main(String[] args) {

        try (Scanner fauzi = new Scanner (System.in);) {

            int gajiPokok;
            double bonus, totalGaji;
            double tunjanganTransportasi=600000;
            double tunjanganMakan=400000;

            gajiPokok = fauzi.nextInt();

            bonus = 0.05* gajiPokok;
            totalGaji = (int) gajiPokok + tunjanganTransportasi + tunjanganMakan + bonus - (0.1 * gajiPokok);

            System.out.println("Bonus Bulanan anda adalah Rp. " + bonus);
            System.out.println("Gaji yang diterima adalah Rp. " + totalGaji);

        }
    } 
}
