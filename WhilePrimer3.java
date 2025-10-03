package whileprimer3;

import java.util.Scanner;

public class WhilePrimer3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Unesite od kog broja zelite da zapocnete sabiranje do " + "(i): ");
        int i = s.nextInt();
        
        System.out.print("Broj od kog pocinje sabiranje je " + i + " \nUnesite broj do kog zelite da se vrsi sabiranje (n): ");
        int n = s.nextInt();
        
        System.out.println("Uneli ste broj " + n + ".\n");
        
        
        int iStart = i;
        int zbir = 0;
        
        
        System.out.println("\n\tPocetna vrednost za zbir je " + zbir + ".\n");
        String matematickiIzraz = "";
        
        
        if(i > n) {
            System.out.println("Greska!");
            return;
        }
        
        
        while(i <= n){
                System.out.println("Dodaje se " + i + " u zbir, trenutni zbir je " + (zbir + i) + ".");
                zbir += i;
                matematickiIzraz += i + (i < n ? " + " : " = ");
                ++i;
            }
               
        System.out.println("\nZbir brojeva od " + iStart + " do " + n + " je " + zbir + ".");
        System.out.println("Izraz " + matematickiIzraz + zbir);
    
    }
}
