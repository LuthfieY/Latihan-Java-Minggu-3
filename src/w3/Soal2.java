package w3;

import java.util.Scanner;

public class Soal2 {
	public static void main(String[] args) {
		int[] num = new int[3];
		String[] str = new String[3];
		Scanner sc = new Scanner(System.in);
		
        for(int i=0; i<3; i++)
        {
            str[i] = sc.next();
            num[i] = sc.nextInt();
        }
        
        System.out.println("================================");
        for(int i=0; i<3; i++)
        {
            System.out.printf( "%-15s%03d %n", str[i], num[i]);
        }
        System.out.println("================================");
        sc.close();
	}
}
