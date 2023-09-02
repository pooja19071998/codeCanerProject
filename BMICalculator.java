package coderCave;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the weight in kilogram:");
		double weight = sc.nextDouble();
		
		System.out.println("Enter the height in meters:");
		double height = sc.nextDouble();
		
		double BMI = weight / (height * height);
		
		System.out.println("The Body Mass Index (BMI) is "+ BMI +"kg/m2");
		
		if(BMI<18.5) {
			System.out.println("You are in Underweight");
		}
		else if(BMI>18.5 && BMI<24.9){
			System.out.println("you are in Normal weight");
		}
		else if(BMI>25 && BMI<29.9) {
			System.out.println("you are in Overweight");
		}
		else if(BMI>30) {
			System.out.println("you are in Obese");
		}
	}

}
