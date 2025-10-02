package whileprimer2;

import java.util.Scanner;

public class WhilePrimer2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int broj;
        
        System.out.print("Unesite bilo koji broj (0 za kraj): ");
        broj = s.nextInt();
                
        
        while(broj != 0){
            System.out.println("Uneli ste broj " + broj);
            System.out.print("Unesite bilo koji broj (0 za kraj): ");
            broj = s.nextInt();
        }
        
        System.out.println("");
        System.out.println("Program je zavrsen! (uneli ste broj 0)");
        
    }
    
}
