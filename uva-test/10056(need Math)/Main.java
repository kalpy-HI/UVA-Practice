import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int i=0;i<cases;i++) {
			int n = sc.nextInt();
			double p = sc.nextDouble();
			int thp = sc.nextInt();
			double d = 1-p;
			double answer =0;
			
			if(0==p) {
				System.out.printf("%.4f\n",answer);
				continue;
			}
			else answer = (p*Math.pow(d, (double)thp-1)) / (1 - Math.pow(d,(double)n));
			System.out.printf("%.4f\n",answer);
		}
		sc.close();
	}
}