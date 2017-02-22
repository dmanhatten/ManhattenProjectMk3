import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int n = 2; n <= 20; n += 2) {
			if(n == 8)
				continue;
			System.out.println(n);
		}		
		System.out.println();
		
		
		int i = 1, sum;
		for(sum = 0; i < 6; ++i) {
			sum += i;
		}
		
		System.out.println(sum);
		
		sum = 0;
		i = 0;
		
		while(i++ < 5) {
			sum += i;
		}
		
		System.out.println(sum);

		
		sum = 0;
		i = 1;
		do {
			sum += i;
		} while(i++ < 5);
		
		System.out.println(sum);
		System.out.println();
		
		i = 0;
		int var = 100;
		if(i != 0) {
			var = 2;
		} else {
			var /= 2;
		}		
		System.out.println(var);
		
		var = 100;
		switch(i) {
		case 0:
			var /= 2;
			break;
		default:
			var = 2;
		}
		
		System.out.println(var);
		System.out.println();
		
		/* int f = 0, erg = 0;
		System.out.println("Bitte geben Sie eine Ganzzahl ein: ");
		f = sc.nextInt();

		if(f == 0) {
			erg = 1;
		} else {
			erg = f;		
			f--;
			while(f > 0) {
				erg  *= f;
				f--;
			}
		}
		
		System.out.println(erg); */
		
		int a = 0, b = 0;
		System.out.println("Geben Sie 2 positive Zahlen ein.");
		a = sc.nextInt();
		b = sc.nextInt();
		while(a >= b) {
			System.out.println("Geben Sie die 2. Zahl erneut ein.");
			b = sc.nextInt();
		}
		
		sc.close();
		
	}

}
