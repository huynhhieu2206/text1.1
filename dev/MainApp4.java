package basic.dev;

import java.util.Scanner;

public class MainApp4 {

	
		public static void main(String[] args) {
		    int n;
		    int soLuongSoNguyenLe = 0, soLuongSoNguyenChan = 0;
		    Scanner scanner = new Scanner(System.in);
		         
		    do {
		        System.out.println("nhap vao so phan tu cua mang: ");
		        n = scanner.nextInt();
		    } while (n <= 0);
		         
		    int A[] = new int[n];
		         
		    System.out.println("nhap cac phan tu cho mang: ");
		    // A.length: trả về độ dài của mảng
		    for (int i = 0; i < n; i++) {
		        System.out.print("nhap phan tu thu " + i + ": ");
		        A[i] = scanner.nextInt();
		    }
		         
		    // tính số lượng số nguyên lẻ, chẵn trong mảng
		    for (int i = 0; i < n; i++) {
		        if (A[i] % 2 == 0) {
		            soLuongSoNguyenChan++;
		        } else {
		            soLuongSoNguyenLe++;
		        }
		    }
		         
		    System.out.println("so luong so nguyen chan trong mang = " + soLuongSoNguyenChan);
		    System.out.println(" so luong so nguyen le trong mang = " + soLuongSoNguyenLe);
		}}
	