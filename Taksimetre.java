package java101;

import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {
		int km;
		double basKm = 2.0,toplam, beginPrice = 10;
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Gideceğiniz mesafeyi KM olarak yazınız: ");
		km = inp.nextInt();
		
		toplam = (km * basKm);
		toplam += beginPrice;
		
		toplam = (toplam < 20) ? 20 : toplam; 
        System.out.println("Ödenecek Toplam Tutar : " + toplam);
		

	}

}
