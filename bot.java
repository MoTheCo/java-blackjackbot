package blackjack;

import java.util.Scanner;

public class programm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("herzlich willkommen bei Adams blackjack bot");
		int counter =0;
		while (counter <= 100) {
			System.out.println("");
			
			
			System.out.println("");
		System.out.println("gib deine erste nummer ein");
int j1 = in.nextInt();
System.out.println("");
System.out.println("gib deine zweite nummer ein");
int j2 = in.nextInt();
System.out.println("");
System.out.println("gib deine dritte nummer ein");
int j3= in.nextInt();

int result = j1 + j2 + j3;
System.out.println("");

System.out.println("dein ergebnis ist " +result);
	int ideal=0;
System.out.println("");
if (result == ideal) {
	System.out.println("du hast eine neutrale karte");
	}
if (result < ideal) {
	System.out.println("du hast eine niedrige karte");
	}
if (result > ideal) {
	System.out.println("du hast eine hohe karte");
	}
}
}

}

	
