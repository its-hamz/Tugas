import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.println("Masukkan crlcius");
        double C = X.nextDouble();

        System.out.println("Pilih opsi");
        System.out.println("1. Farenheit");
        System.out.println("2. Kelvin");
        System.out.println("3. Reamur");

        int opsi= X.nextInt();


        if (opsi == 1){
            double F = (C * 9/5 )+32;
            System.out.println(C+" Fareheit adalah: " +F);
        }
        else if (opsi == 2){
            double R = (C * 4/5);
            System.out.println(C+" Reamur adalah: "+R);
        }
        else if (opsi == 2){
            double K = (C*273);
            System.out.println(C+" Kelvin adalah: "+K);
        }
        else{
            System.out.println("Opsi tidak valid");
        } 



    }
}