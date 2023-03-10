import java.util.Scanner;

import java.util.Random;
public class ttatt {
	static Scanner sc = new Scanner(System.in);

	// Thuật toán bình phương có lặp
	static int power(int x, int y, int mod) {
		if (y == 0)
			return 1;
		int temp = power(x, y / 2, mod) % mod;
		temp = (temp * temp) % mod;
		if (y % 2 == 1)
			temp = (temp * x) % mod;
		return temp;
	}

	public static int isPrime(int n) {
		if (n <= 1) {
			return 0;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println("Nhập số N :");
		int N = sc.nextInt();
		while (N < 0) {
			System.out.println("Nhập số N>0");
			System.out.println("Nhập lại số N");
			N = sc.nextInt();
		}
		while (N > 1000) {
			System.out.println("Nhập số N<1000");
			System.out.println("Nhập lại số N");
			N = sc.nextInt();
		}
		
		Random random = new Random();
		int p ;
		
		do {
			p= random.nextInt(100);
		}while(isPrime(p)==0);
		System.out.println("p="+p);
		System.out.println("Đáp án : ");
	    for (int a = 0; a < N; a++) {
			if (isPrime(power(a, p, N))== 1) {
				System.out.println("số a = "+ a);
			}
		}
	}
}


