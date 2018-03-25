import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		for(;sc.hasNext();) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(0==a && 0==b)break;
			
			int upper = (int)Math.sqrt(b);
			int lower = (int)Math.ceil(Math.sqrt(a));
		
			System.out.println(upper-lower+1);
		}
		sc.close();
	}
}