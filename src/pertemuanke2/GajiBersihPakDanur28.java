import java.util.Scanner;

public class GajiBersihPakDanur28 {
    public static void main(String[] args) {

        try (Scanner scn = new Scanner(System.in);){
        int gajiPokok, tunjanganAnak, totalTunjanganAnak, jumlahAnak;
        float persentaseDanaPensiun = 0.1f, gajiBersih, danaPensiun;

        System.out.print("gaji pokok: ");
        gajiPokok = scn.nextInt();
        System.out.print("jumlah anak: ");
        jumlahAnak = scn.nextInt();
        System.out.print("tunjangan anak: ");
        tunjanganAnak = scn.nextInt();
        

        totalTunjanganAnak = jumlahAnak * tunjanganAnak;
        danaPensiun = persentaseDanaPensiun * gajiPokok;
        gajiBersih = gajiPokok + totalTunjanganAnak - danaPensiun;

        System.out.println("total tunjangan anak: " + totalTunjanganAnak);
        System.out.println("dana pensiun: " + danaPensiun);
        System.out.println("gaji bersih: " + gajiBersih);

         }

    }
}
