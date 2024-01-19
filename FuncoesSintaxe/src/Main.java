import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter three numbers: \n"); // programa para retornar o maior.
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();

	}
	
	public static int max(int x, int y, int z) { //criando uma função
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) { // criando uma função (void pq não é necessario retornar nada).
		System.out.println("Higher = " + value);
	}

}
