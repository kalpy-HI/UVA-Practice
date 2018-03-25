import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		
		for(int i =0;i<cases;i++) {
			int r = sc.nextInt();
			int[] rarray = new int[r];
			int min=30000,max=0;
			
			for(int j=0;j<r;j++) {
				int lol = sc.nextInt();
				rarray[j]=lol;
				if(lol>max)max = lol;
				if(lol<min)min = lol;
			}
			Arrays.sort(rarray);
			int minsum = 0;
			int mightbe = r/2;
			int distance =0;
			for(int j=0;j<r;j++) {
				int kk = rarray[mightbe]-rarray[j];
				if(kk>=0)distance +=kk;
				else distance+=(-kk);
			}
			System.out.println(distance);
		}
	}
}