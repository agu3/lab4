package p2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("dati un nnumar  ");
        int numar = scanner.nextInt();
        int sumanr= sumaNumarului(numar);
        System.out.println("suma numarului " + numar + " este " +sumanr );


    }

    public static int sumaNumarului( int numar){
        int suma=0;
        while(numar >0){
            suma +=numar %10;
            numar/= 10;
        }
        return suma;
    }
}

