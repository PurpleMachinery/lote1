package lote_linear;

import java.util.Scanner;

public class Ex_20 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(), b = s.nextInt(), c = s.nextInt(), d;
		double x1, x2;
		d=(b*b)-(4*a*c);
		if(d<0) {
			System.out.println("Delta: "+d);
		}
		else {
			x1=-b+Math.sqrt(d);
			x1/=2*a;
			x2=-b-Math.sqrt(d);
			x2/=2*a;
			System.out.println(x1);
			System.out.println(x2);
		}
	}
}
