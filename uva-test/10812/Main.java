import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		
		int counts = sc.nextInt();
		for(int i=0;i<counts;i++) {
			int s = sc.nextInt();
			int d = sc.nextInt();
			int x = (s+d)/2;
			int y = s - x;
			
			if(x<0||y<0 || d!=x-y) {
				System.out.println("impossible");
			}
			else System.out.println(x+" "+y);
		}
	}
}