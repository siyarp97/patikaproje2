import java.util.Scanner;
public class Kucukten_Buyuge_Siralama {
    public static void main(String[] args) {
        int a, b, c;
        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci Sayiyi Giriniz : ");
        a = inp.nextInt();

        System.out.print("Ikinci Sayiyi Giriniz : ");
        b= inp.nextInt();

        System.out.print("Ucuncu Sayiyi Giriniz : ");
        c= inp.nextInt();

        if((a<b) && (a<c)){
            if (b<c) {
                System.out.println("a<b<c");
            } else {
                System.out.println("a<c<b");
            }
        } else if ((b<a) && (b<c)) {
            if (a<c){
                System.out.println("b<a<c");
            }
            else {
                System.out.println("b<c<a");
            }
        } else {
            System.out.println("c<b<a");
        }
    }
}
