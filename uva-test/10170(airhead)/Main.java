import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		Scanner sc = new Scanner(System.in);
		//'A'=65; 'Z'=90;
		
		for(;sc.hasNext();) {
			int initial = sc.nextInt();
			long Dthday = sc.nextLong();
			
			for(;(Dthday-initial)>=0;) {
				Dthday = Dthday - initial;
				if(Dthday!=0) {
					initial++;
				}
			}
			System.out.println(initial);
		}
	}
}