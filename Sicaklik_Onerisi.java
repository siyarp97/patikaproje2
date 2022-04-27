/*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/
import java.util.Scanner;
public class Sicaklik_Onerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int heat;
        System.out.print("Lutfen Sicakligi Giriniz : ");
        heat = input.nextInt();

        if (heat < 5){
            System.out.println("Kayak Yapilabilir.");
        }
        if(heat > 5 && heat <15){
            System.out.println("Sinemaya Gidilebilir");
        }
        if (heat > 15 && heat < 25){
            System.out.println("Piknige Gidilebilir");
        }
        if (heat > 25){
            System.out.println("Yuzmeye Gidilebilir");
        }
    }
}
