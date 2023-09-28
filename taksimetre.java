package taksimetre;

import java.util.Scanner;

public class taksimetre {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Gidilen km: ");
		int km = scan.nextInt();

		double kmbasina = 2.20, toplam, acilis = 10;

		toplam = (kmbasina * km) + acilis;

		toplam = (toplam < 20) ? 20 : toplam;

		System.out.print("Toplam ücret: " + toplam);

	}

}
