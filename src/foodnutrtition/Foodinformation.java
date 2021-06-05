package foodnutrtition;

public class Foodinformation {
int[] calories;
double[] fat;
int[] carbs;
double[] protein;
boolean[] organic;
public Foodinformation(int[] calories, double[] fat, int[] carbs, 
		double[] protein, boolean[] organic) {
	this.calories = calories;
	this.fat = fat;
	this.carbs = carbs;
	this.protein = protein;
	this.organic = organic;
}
//array methods
public void cal(int cal[]) {
	System.out.println("Here are the calories values ");{
		for(int i=0; i<cal.length;i++)
			System.out.print(cal[i]+" ");
			System.out.println("");
	}
}
public void Fat(double fat[]) {
	System.out.println("Here are the Fat values ");{
		for(int i=0;i<fat.length;i++)
			System.out.print(fat[i]+" ");
			System.out.println("");
	}
}
public void carbo(int carb[]) {
	System.out.println("Here are the carb values ");{
		for(int i=0; i<carb.length;i++)
			System.out.print(carb[i]+" ");
			System.out.println("");
	}
}
public void protein(double protein[]) {
	System.out.println("Here are the protein values ");{
		for(int i=0; i<protein.length;i++)
			System.out.print(protein[i]+"; ");
			System.out.println("");
	}
}
public void organic(boolean organic[]) {
	System.out.println("Here are if its True or false organic ");{
	for(int i=0;i<organic.length;i++)
		System.out.print(organic[i] + " ");
		System.out.println("");
}
}
}