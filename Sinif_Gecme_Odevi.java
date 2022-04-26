import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Sinif_Gecme_Odevi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mat, fizik, turkce, muzik, kimya;

        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = input.nextInt();


        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();

        System.out.print("Turkce Notunuzu Giriniz : ");
        turkce = input.nextInt();

        System.out.print("Muzik Notunuzu Giriniz : ");
        muzik = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();

        double ortalama, ortalama1;
        ortalama= (mat + fizik + turkce + kimya + muzik) / 5;

        if (mat > 100) {
            ortalama = ((fizik + turkce + muzik + kimya) / 4);
            System.out.println("Matematik Notu 100'den buyuk oldugu icin ortalamaya eklenmedi!");
        } else if (mat < 0) {
            ortalama = ((fizik + turkce + muzik + kimya) / 4);
            System.out.println("Matematik Notu 0'dan kucuk oldugu icin ortalamaya eklenmedi!");
        }

        if (fizik > 100) {
            ortalama = ((mat + turkce + muzik + kimya) / 4);
            System.out.println("Fizik Notu 100'den buyuk oldugu icin ortalamaya eklenmedi!");
        } else if (fizik < 0) {
            ortalama = ((mat + turkce + muzik + kimya) / 4);
            System.out.println("Fizik Notu 0'dan kucuk oldugu icin ortalamaya eklenmedi!");
        }

        if (turkce > 100) {
            ortalama = ((fizik + mat + muzik + kimya) / 4);
            System.out.println("Turkce Notu 100'den buyuk oldugu icin ortalamaya eklenmedi!");
        } else if (turkce < 0) {
            ortalama = ((fizik + mat + muzik + kimya) / 4);
            System.out.println("Turkce Notu 0'dan kucuk oldugu icin ortalamaya eklenmedi!");
        }

        if (kimya > 100) {
            ortalama = ((fizik + turkce + muzik + mat) / 4);
            System.out.println("Kimya Notu 100'den buyuk oldugu icin ortalamaya eklenmedi!");
        } else if (kimya < 0) {
            ortalama = ((fizik + turkce + muzik + mat) / 4);
            System.out.println("Kimya Notu 0'dan kucuk oldugu icin ortalamaya eklenmedi!");
        }

        if (muzik > 100) {
            ortalama = ((fizik + turkce + mat + kimya) / 4);
            System.out.println("Muzik Notu 100'den buyuk oldugu icin ortalamaya eklenmedi!");
        } else if (muzik < 0) {
            ortalama = ((fizik + turkce + mat + kimya) / 4);
            System.out.println("Muzik Notu 0'dan kucuk oldugu icin ortalamaya eklenmedi!");
        }
        else {
            System.out.println("Ortalamaniz : " + ortalama);
        }

        if (ortalama >= 55 ) {
            System.out.println("Sonuc : Gectiniz");
        }
        else {
            System.out.println("Sonuc : Kaldiniz");
        }
    }
}