package w3;
import java.util.Scanner;

public class Soal1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukan string: ");
		var str = sc.nextLine();	
		sc.close();
		
		String[] arrOfStr = str.split("[!,?._'@ ]");
		System.out.println(arrOfStr.length);
		for(String a : arrOfStr) {
			System.out.println(a);
		}
	}
}
