package p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("introduceti cuvantul: ");
        String nume= in.nextLine();
        System.out.println("caracteru din mijloc este: " +mijloc(nume));
    }
        public static String mijloc(String nume){
            int pozitie;
            int lungime;
            if(nume.length()%2==0){
                pozitie=nume.length()/2-1;
                lungime=2;
                System.out.println();
            }else {
                pozitie=nume.length()/2;
                lungime=1;
                System.out.println("asta inseamna ca are 5 litere ");
            }
            return nume.substring(pozitie, pozitie + lungime);
        }
}

