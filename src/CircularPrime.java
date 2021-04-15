import java.util.Scanner;

public class CircularPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if (checkCircular(n)) {
			System.out.println("Yes the number is rotational prime");
		} else {
			System.out.println("No the number is not rotational prime");
		}
	}
	

	private static boolean checkCircular(int n) {
		int count = 0, temp = n;
		while (temp > 0) {
			count++;
			temp = temp / 10;
		}
		int num = n;
		while (isPrime(num)) {
			int r = num % 10;
			int d = num / 10;
			num = (int) ((Math.pow(10, count - 1)) * r) + d;
			if (num == n) {
				return true;
			}
		}
		return false;
	}

	private static boolean isPrime(int num) {
		int i, m = 0, f = 0;
		m = num / 2;
		if (num == 0 || num == 1) {
			System.out.println(num + "is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (num % i == 0) {
					System.out.println(num + "is not prime number");
					f = 1;
					break;
				}
			}
			if (f == 0) {
				return true;
			}
		}
		return false;
	}
}
