package praktikum.pkg1;
     
import java.util.Scanner;

public class konversisuhu {
    
    public static void main(String[] args){
        // Deklarasi
        Double fahrenheit, celcius;
        
        
        // Membuat scanner baru
        Scanner baca = new Scanner(System.in);
        
        // Input
        System.out.println("Suhu Celcius ke Fahrenheit");
        System.out.print("Celcius: ");
        celcius = baca.nextDouble();
        
        // Proses
        fahrenheit =((celcius * 9 / 5) + 32);
        
        // Output
        System.out.println("Fahrenheit: " + fahrenheit);
    }
    
}

    

