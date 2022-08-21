import java.util.Scanner;

public class Main {

    static void power() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Taban degerini giriniz: ");
        int a=inp.nextInt();
        System.out.println("Us degerini giriniz: ");
        int b=inp.nextInt();
        int result=1;
        for (int i=1;i<=b;i++){
            result*=a;
        }

        System.out.println("Sonuc: "+result);

    }


    public static void main(String[] args) {

            power();



        }
}
