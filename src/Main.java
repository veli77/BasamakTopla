import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int toplam=0, sayi, temp;
        float tempfloat;

        System.out.println("Sayıyı giriniz: ");
        sayi = giris.nextInt();

        while (!(sayi==0)) {
            temp = sayi;
            sayi = sayi / 10;
            sayi = sayi * 10;
            toplam += temp - sayi;
            sayi = sayi / 10;
        }
        System.out.println(toplam);




    }
}