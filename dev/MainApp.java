package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a");
		int a = sc.nextInt();
		System.out.println("b");
		int b = sc.nextInt();
		System.out.println("c");
		int c = sc.nextInt();
	if (a + b > c && b + c > a && a + c > b ) {
		System.out.println(" la 3 canh tam giac " );
	}else {
		System.out.println(" kong phai la 3 canh tam giac");
	}
		
	}

}
