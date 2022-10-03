import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		
		double numero1;
		double numero2;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
		
		numero1 = sc.nextDouble();
		
        System.out.println("Informe o segundo numero: ");
		
		numero2 = sc.nextDouble();
		
		sc.close();
		
		double soma = numero1+numero2;
		
		System.out.println("O resultado da soma é : " + soma);
		
		

	}

}
