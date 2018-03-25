import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		
		for(;sc.hasNext();) {
			int n = sc.nextInt();
			int sum=n;
			int borrows=0;
			
			for(;;) {
				if(1==n || 0==n)break;
				else if(n%3!=0) {
					int a = n/3;
					int k = 3*(a+1);
					if(borrows+k-n<=k/3) {
						borrows+=k-n;
						n = k;
					}
					else break;
				}
				else {
					sum+=n/3;
					n/=3;
				}
			}
			
			System.out.println(sum);
		}
		sc.close();
	}
}