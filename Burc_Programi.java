import java.util.Scanner;
public class Burc_Programi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int month, day;

        System.out.print("Hangi ayda dogdunuz? :");
        month = inp.nextInt();

        System.out.print("Hangi gunde dogdunuz? :");
        day = inp.nextInt();

        if (((month > 12) ||(month < 1)) || ((day < 1)||(day > 31))){
            System.out.println("Bilgiler hatalidir ");
        }


        if (month == 1){
                if (day < 22){
                    System.out.println("Oglak Burcusunuz");}
                else {
                    System.out.println("Kova Burcusunuz.");}

            }


        if (month == 2){
            if (day>28){
                System.out.println("Subat ayinda maksimum 28 gun olabilir");
            }
            if (day < 20){
                System.out.println( "Kova Burcusunuz.");
            }
            else {
                System.out.println("Balik Burcusunuz.");
            }
        }

        if (month == 3){
            if (day < 22){
                System.out.println("Balik Burcusunuz.");}
            else {
                System.out.println("Koc Burcusunuz.");}

        }

        if (month == 4){
            if (day < 21){
                System.out.println("Koc Burcusunuz");}
            else {
                System.out.println("Boga Burcusunuz.");}

        }

        if (month == 5){
            if (day < 22){
                System.out.println("Boga Burcusunuz");}
            else {
                System.out.println("Ikızler Burcusunuz.");}

        }

        if (month == 6){
            if (day < 23){
                System.out.println("Ikızler Burcusunuz");}
            else {
                System.out.println("Yengec Burcusunuz.");}

        }

        if (month == 7){
            if (day < 23){
                System.out.println("Yengec Burcusunuz");}
            else {
                System.out.println("Aslan Burcusunuz.");}

        }

        if (month == 8){
            if (day < 23){
                System.out.println("Aslan Burcusunuz");}
            else {
                System.out.println("Basak Burcusunuz.");}

        }

        if (month == 9){
            if (day < 23){
                System.out.println("Basak Burcusunuz");}
            else {
                System.out.println("Terazi Burcusunuz.");}

        }

        if (month == 10){
            if (day < 23){
                System.out.println("Terazi Burcusunuz");}
            else {
                System.out.println("Akrep Burcusunuz.");}

        }

        if (month == 11){
            if (day < 23){
                System.out.println("Akrep Burcusunuz");}
            else {
                System.out.println("Yay Burcusunuz.");}

        }

        if (month == 12){
            if (day < 22){
                System.out.println("Yay Burcusunuz");}
            else {
                System.out.println("Oglak Burcusunuz.");}

        }

        }
 }

