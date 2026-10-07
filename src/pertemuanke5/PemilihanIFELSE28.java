package pertemuanke5;
import java.util.Scanner;
public class PemilihanIFELSE28 {
    public static void main(String[] args) {
       try (Scanner fauzi = new Scanner(System.in);) {

        System.out.println("--- Cetak KRS SIAKAD---");
        System.out.print("Masukkan smester saat ini: ");
        int smester = fauzi.nextInt();

           switch (smester) {
               case 1 -> System.out.println("KRS Semester 1 ditampilkan");
               case 2 -> System.out.println("KRS Semester 2 ditampilkan");
               case 3 -> System.out.println("KRS Semester 3 ditampilkan");
               case 4 -> System.out.println("KRS Semester 4 ditampilkan");
               case 5 -> System.out.println("KRS Semester 5 ditampilkan");
               case 6 -> System.out.println("KRS Semester 6 ditampilkan");
               case 7 -> System.out.println("KRS Semester 7 ditampilkan");
               case 8 -> System.out.println("KRS Semester 8 ditampilkan");
               default -> System.out.println("Smester tidak valid");
           }
           //if (smester == 1) {
           // System.out.println("KRS Semester 1 ditampilkan");
        //} else if( smester ==2 ){
          //  System.out.println("KRS Semester 2 ditampilkan");
         //} else if( smester ==3 ){
          //  System.out.println("KRS Semester 3 ditampilkan");
        //} else if( smester ==4 ){
           // System.out.println("KRS Semester 4 ditampilkan");
        // } else if( smester ==5 ){
            //System.out.println("KRS Semester 5 ditampilkan");
        // } else if( smester ==6 ){
          //  System.out.println("KRS Semester 6 ditampilkan");
        // } else if( smester ==7 ){
       //     System.out.println("KRS Semester 7 ditampilkan");
       //  } else if( smester ==8 ){
       //     System.out.println("KRS Semester 8 ditampilkan");
       //  } else {
       //     System.out.println("Smester tidak valid");
        // }
       }
    }
}
