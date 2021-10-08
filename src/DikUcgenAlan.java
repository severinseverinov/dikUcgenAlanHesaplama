import java.util.Scanner;

public class DikUcgenAlan {
    public static void main(String[] args) {
        int a,b;
        double c,cevre,alan;

        Scanner giris=new Scanner(System.in);

        System.out.print("Dik üçgenin 1. kenarını giriniz : ");
        a=giris.nextInt();

        System.out.print("Dik üçgenin 2. kenarını giriniz : ");
        b=giris.nextInt();

        c=Math.sqrt((a*a)+(b*b));

        cevre=(a+b+c)/2;
        alan=Math.sqrt(cevre*(cevre-a)*(cevre-b)*(cevre-c));

        System.out.println("Girilen değerlere göre hipotenüs = "+c+" dir.");
        System.out.println("Girilen değerlere göre çevre = "+cevre+" dir.");
        System.out.println("Girilen değerlere göre alan = "+alan+" dir.");
    }
}
