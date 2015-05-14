import java.util.*;

public class Main {
		public static int fibRecursion(int n){
			if (n < 2)
				return n;
			else 
				return fibRecursion(n-1) + fibRecursion(n-2);
		}

		public static void main(String[] args) throws Exception{
			Scanner reader = new Scanner(System.in);
			System.out.print("Enter fibonacci sequence number:\t");
			int fib = reader.nextInt();
			while (fib >= 0){
				System.out.printf("at %d:\t%d\n", fib, fibRecursion(fib));
				fib = fib - 1;
			}
		}
}