import java.util.Scanner;

public class TempConverter {
	
	private double degree;
	private double fahr;
	Scanner sc = new Scanner(System.in);
	public double convertToCelsius() {
		System.out.println("Enter number to convert to celsius: ");
		fahr = sc.nextInt();
		fahr = (fahr - 32)*0.5556;
		System.out.println(fahr);
		return fahr;
	}
	public double convertToFarhenheit() {
		System.out.println("Enter number to convert to fahrenheit: ");
		degree = sc.nextInt();
		degree = (degree*1.8)+32;
		System.out.println(degree);
		return degree;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the temp converter");
		System.out.println("Enter 1 to convert to celsius and 2 to convert to farhenheit!");
		Scanner p = new Scanner(System.in);
		int number= p.nextInt();
		TempConverter celsius = new TempConverter();
		do {
			switch(number) {
			case 1:
				celsius.convertToCelsius();
				break;
			case 2:
				celsius.convertToFarhenheit();
				break;
			}
			
		}while(number == 1 || number == 2);
	}
}
