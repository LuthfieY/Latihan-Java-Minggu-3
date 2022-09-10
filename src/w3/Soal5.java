package w3;

import java.util.Scanner;

public class Soal5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String car1,car2,car3,car4;
        String cat_car = null;
        car1 = sc.next();
        car2 = sc.next();
        car3 = sc.next();
        car4 = sc.next();
        cat_car = car1+car2+car3+car4;
        sc.close();
        if((Double.parseDouble(cat_car) - 999999) % 5 == 0){
            System.out.println("Jalan");
        } else {
            System.out.println("Berhenti");
        }
	}
}

	