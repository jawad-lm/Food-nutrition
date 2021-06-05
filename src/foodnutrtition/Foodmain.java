package foodnutrtition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;

public class Foodmain {
//yeet
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[] stringArray = { "calories", "fat", "carbs", "protein", "organic" };
		
		System.out.println("Input in this order ");
		System.out.println("how many product is there ");
		
		int contents = s.nextInt();
		int c[] = new int [contents];
		double f[] = new double[contents];
		int cbs[] = new int[contents];
		double ptn[] = new double[contents];
		boolean org[] =new boolean [contents];
		
		System.out.println("How much calories is in this product?ex:100 ");
		for (int i =0;i<contents;i++) {
			c[i] =s.nextInt();
			System.out.println(c[i]);
								}

						
	System.out.println("How much fat is in this product?ex:12.2 ");
		for (int i =0;i<contents;i++) {
			f[i] =s.nextDouble();
			System.out.println(f[i]);
								}
		System.out.println("How much carbs is in this product?ex:100 ");
		for (int i =0;i<contents;i++) {
			cbs[i] =s.nextInt();
			System.out.println(cbs[i]);
								}
		System.out.println("how much protein is in this product?ex12.5 ");
		for (int i =0;i<contents;i++) {
			ptn[i] =s.nextDouble();
			System.out.println(ptn[i]);
								}
		System.out.println("Is this product organic?(true or false) ");
		for (int i =0;i<contents;i++) {
			org[i] =s.nextBoolean();
			System.out.println(org[i]);
								}
		Foodinformation obj1 = new Foodinformation(c,f,cbs,ptn,org);
		Timer timer = new Timer();
		obj1.cal(c);
		obj1.Fat(f);
		obj1.carbo(cbs);
		obj1.protein(ptn);
		obj1.organic(org);

	
}
}