package w3;
import java.util.Scanner;

public class Soal3 {
	public static void main(String[] args) {
		int angka1;
		int angka2;
		char operator;
		Scanner sc = new Scanner(System.in);
		angka1 = sc.nextInt();
		operator = sc.next().charAt(0);
		angka2 = sc.nextInt();
		sc.close();

		int result = 0;

		switch (operator) {
		case '+':
			result = angka1 + angka2;
			break;
		case '-':
			result = angka1 - angka2;
			break;
		case '*':
			result = angka1 * angka2;
			break;
		case '/':
			result = angka1 / angka2;
		default:
			System.out.println("illegal operand");
		}
		System.out.println("Result: " + result);
	}
}