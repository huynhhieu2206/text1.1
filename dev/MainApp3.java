package basic.dev;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class MainApp3 {

	public static void main(String[] args) {
		int a, b, c;
		float p, S, C;
		Scanner Nhap = new Scanner(System.in);
		System.out.print("Nhap canh thu nhat: ");
		a = Nhap.nextInt();
		System.out.print("Nhap canh thu hai: ");
		b = Nhap.nextInt();
		System.out.print("Nhap canh thu ba: ");
		c = Nhap.nextInt();
		do { 
			System.out.println("nhap sai hay nhap lai");
		}while (a < 0 && b < 0 && c <0);
			if (a + b > c && a + c > b && b + c > a) {
				p = (a + b + c) / 2;
				S = (float) sqrt(p * (p - a) * (p - b) * (p - c));
				System.out.println("Dien tich cua tam giac la: " + S);
				C = ( a + b + c );
				System.out.println("Chu vi cua tam giac la: " + C);
		}

	}
}
