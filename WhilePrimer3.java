package whileprimer3;

import java.util.Scanner;

public class WhilePrimer3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj n: ");
        int n = s.nextInt();
        
        System.out.println("Uneli ste broj " + n);
        
        int i = 1;
        int zbir = 0;
        
        System.out.println("\n\tPocetna vrednost za zbir je " + zbir + ".\n");
        
        while(i <= n){
            System.out.println("Dodaje se " + i + " u zbir, trenutni zbir je " + (zbir + i) + ".");
            zbir += i;
            ++i;
        }
        
        System.out.println("\nZbir brojeva od 1 do " + n + " je " + zbir + ".");
    
    }
}
