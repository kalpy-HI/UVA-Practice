import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		String something1 = sc.nextLine();
		for(int i=0;i<cases;i++) {
			String  str = sc.nextLine();
			String[] parts = str.split(" ");
			int n = Integer.parseInt(parts[2]);
			long[][] array = new long[n][n];
			boolean symmetric = true;
			
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					long kk = sc.nextLong();
					array[j][k]= kk;
					if(kk<0)symmetric = false;
				}
			}
			String something2 = sc.nextLine();
			
			if(symmetric) {	
				for(int j=0;j<n;j++) {
					for(int k=0;k<n-j;k++) {
						if(array[j][k]!=array[n-j-1][n-k-1]) {
							symmetric = false;
							break;
						}
					}
					if(!symmetric)break;
				}
			}
			
			if(symmetric)System.out.println("Test #"+(i+1)+": Symmetric.");
			else System.out.println("Test #"+(i+1)+": Non-symmetric.");
		}
		sc.close();
	}
}