import java.util.Scanner;
//Created by: Kevin Doak
public class QB_Rating {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the amount of passes attempted by the player.");
		double ATT = input.nextInt(); //input for attempts made.
		
		System.out.println("Enter the amount of completed passes made by the player.");
		double COMP = input.nextInt(); //input for completed passes.
		
		System.out.println("Enter the total amount of yards passed by the player.");
		double YDS = input.nextDouble(); //input for passed yards.
		
		System.out.println("Enter the total amount of passes made by the player that ended in a touchdown.");
		double TD = input.nextInt(); //input for touchdowns made from passes.
		
		System.out.println("Enter the interceptions made by the player.");
		double INT = input.nextInt(); //input for interceptions made.
		
		input.close(); //ending scanner function to save memory.
		
		double a = (((COMP/ATT)- 0.3)* 5);   //formula 1/4
		double b = (((YDS/ATT)- 3) * 0.25);   //formula 2/4
		double c = ((TD/ATT) * 20.0);           //formula 3/4
		double d = (2.375 - ((INT/ATT)* 25)); //formula 4/4
		
		//checking all four formulas to make sure they stay within 0 - 2.375.
		if(a >= 2.375){
			a = 2.375;}
		if(a <= 0){
			a = 0;}
		
		if(b >= 2.375){
			b = 2.375;}
		if(b <= 0){
			b = 0;}
		
		if(c >= 2.375){
			c = 2.375;}
		if(c <= 0){
			c = 0;}
		
		if(d >= 2.375){
			d = 2.375;}
		if(d <= 0){
			d = 0;}
	
		double rating = (((a + b + c + d)/ 6)* 100); //final rating calculation.
		//rounding is added in final string statement.
		System.out.printf("The QB rating for your player is: %.1f",rating);
		}
		
	}


