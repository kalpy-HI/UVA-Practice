import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		Scanner sc = new Scanner(System.in);
		
		for(;sc.hasNext();) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			if(a>b) {
				System.out.println(a-b);
			}
			else System.out.println(b-a);
		}
	}
}