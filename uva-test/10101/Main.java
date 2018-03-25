import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		
		int count =0;
		for(;sc.hasNext();) {
			String s = sc.nextLine();
			count++;
			StringBuffer sb = new StringBuffer(s);
			int digits =0;
			for(int i=s.length()-1;i>=0;i--) {
				digits++;
				if(3==digits)sb.insert(i+1," shata ");
				else if(4==digits)sb.insert(i+1," hajar ");
				else if(6==digits)sb.insert(i+1," lakh ");
				else if(8==digits) {
					sb.insert(i+1," kuti ");
					digits =1;
				}
			}
			System.out.println(count+". "+sb);
		}
	}
}