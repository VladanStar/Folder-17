
package javamthanojskekule;

import java.util.Scanner;


public class JavaMTHanojskeKule {

    public static void main(String[] args) {
       int n; // broj diskova
       Scanner input = new Scanner(System.in);
        System.out.println("Unesite broj diskova Hanojskih kula: ");
        n = input.nextInt();
        System.out.println("\n Resenje igre za " + n + " diskova je: ");
        
        premestiDiskove(n, 'A','B','C');
               
    }

    private static void premestiDiskove(int n, char a, char b, char c) {
        
        if(n== 1){
        premestiDisk(a,c);
        
        }
        else{
        premestiDiskove(n-1, a, c, b);
        premestiDisk(a,c);
        premestiDiskove(n-1,b, a ,c);
        }
      
    }
    static void premestiDisk(char x, char y){
        System.out.println("Disk na vrhu zida je "+ x);
        System.out.println("Premestiti na vrh stuba " + y );
    
    }
    
}
