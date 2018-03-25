import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		int cases = 0;
		for(;sc.hasNext();) {
			int n = sc.nextInt();
			int[] array = new int[n];
			boolean B2 = true;
			int howmany = (n*(n+1))/2;
			int[] sumN = new int[howmany];
			
			for(int i=0;i<n;i++) {
				array[i] = sc.nextInt();
			}
			for(int i=0;i<n-1;i++) {
				if(array[i]>=array[i+1])
					B2 = false;
			}
			if(B2) {
				int count=0;
				for(int i=0;i<n;i++) {
					for(int j=i;j<n;j++) {
						sumN[count] = array[i]+array[j];
						count++;
					}
				}
				
				for(int i=0;i<howmany;i++) {
					for(int j=i+1;j<howmany;j++) {
						if(sumN[i]==sumN[j]) {
							B2 = false;
							break;
						}
						if(!B2)break;
					}
				}
			}

			cases++;
			if(B2)System.out.printf("Case #%d: It is a B2-Sequence.\n\n",cases);
			else System.out.printf("Case #%d: It is not a B2-Sequence.\n\n",cases);
		}
		System.out.print("\n\n");
		sc.close();
	}
}