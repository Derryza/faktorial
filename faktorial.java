package jurnal;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import;
import java.util.Scanner;

/**
 *
 * @author Praktikum
 */
public class faktorial {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan angka: ");
        int baris=input.nextInt();;
        for (int i = 0; i < baris; i++) {
            
            for (int j = baris; j > i; j--) {
                System.out.print("0");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = baris; j > i; j--) {
                System.out.print("0");
            }
            System.out.println("");
        }
        for (int i = 0; i < baris; i++) {
            
            for (int j = 0; j <= i; j++) {
                System.out.print("0");
            }
            for (int j = baris; j > i; j--) {
                System.out.print("*");
            }
            for (int j = baris; j > i; j--) {
                System.out.print("*");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("0");
            }
            System.out.println("");
            
            
        }
        
    }
    
}
