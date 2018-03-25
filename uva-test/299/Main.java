import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		for(int i=0;i<cases;i++){
			int trainL = sc.nextInt();
			int[] a = new int[trainL];
			int count=0;
			
			for(int m=0;m<trainL;m++) {
				int kk = sc.nextInt();
				a[m]=kk;
			}
			
			for(int j=0;j<trainL;j++) {	
				int min=51;
				int minAt=0;
				for(int k=j;k<trainL;k++) {
					int kk = a[k];
					if(min>kk) {
						min = kk;
						minAt = k;
					}
				}
				
				for(int l=minAt;l>j;l--) {
					int temp = a[l];
					a[l] = a[l-1];
					a[l-1] = temp;
					count++;
				}
			}
			System.out.println("Optimal train swapping takes "+count+" swaps.");
		}
		sc.close();
	}
}