import java.util.Scanner;
public class Kodutöö1{
	static double pindala(double raadius){
		return Math.PI*raadius*raadius;
	}

	static double ümbermööt(double raadius){
		return 2*Math.PI*raadius;
	}

	public static void main(String args[]){   
		Scanner s= new Scanner(System.in);
		System.out.println("Sisesta ringi raadius(cm): ");
		double rad= s.nextDouble();      
		double a=pindala(rad);
		System.out.println("Ringi pindala on " + a + "cm²");
		double b=ümbermööt(rad);
		System.out.println("Ringi ümbermööt on " + b + "cm²");
	}
}
