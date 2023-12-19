package basic.dev;

import java.util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so chu dien");
		int soCD = sc.nextInt();
		int dongia = 0;
		if (soCD <= 100) {
			dongia = 1800;
		} else if (soCD <= 200) {
			dongia = 2500;
		} else {
			dongia = 3000;
		}
		int soTien = soCD * dongia;
		System.out.println("so tien can tra la:" + soTien + "VND");
	}

}
