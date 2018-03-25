import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		String something = sc.nextLine();
		String[] lines = new String[cases*2];
		
		for(int i=0;i<cases*2;i++) {
			lines[i] = sc.nextLine();
		}
		
		for(int i=0;i<cases*2;i=i+2) {
			int frint = Integer.parseInt(lines[i],2);
			int seint = Integer.parseInt(lines[i+1],2);
			
			for(int n=0;seint!=0;) {
				n = frint % seint;
				frint = seint;
				seint = n;
			}
			if(1!=frint) {
				System.out.printf("Pair #%d: All you need is love!\n",i/2+1);
			}
			else System.out.printf("Pair #%d: Love is not all you need!\n",i/2+1);
		}
	}
}