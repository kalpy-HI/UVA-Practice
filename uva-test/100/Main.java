import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		
		for(;sc.hasNext();) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int n;
			int max =0;
			
			int oi=i,oj=j;
			if(i>j) {
				int temp = j;
				j = i;
				i = temp;
			}
			for(n=i;n<=j;n++) {
				int count = 1;
				for(int k=n;k!=1;) {
					if(k%2==1) {
						k = 3*k +1;
					}
					else k = k/2;
					count++;
				}
				if(count>max) max = count;
			}
			System.out.printf("%d %d %d\n",oi,oj,max);
		}
	}
}