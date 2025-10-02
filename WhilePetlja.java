package whilepetlja;

import java.util.Scanner;

public class WhilePetlja {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in); 
        
        String ime = "";
        
        while(ime.isEmpty()){
            System.out.print("Unesi svoje ime: ");
            ime = s.nextLine();
        }
        
        System.out.println("Ti si " + ime + " drago mi je sto smo se upoznali :D");
        
        s.close();
    }
    
}
