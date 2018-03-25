import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		
		for(;sc.hasNext();) {
			String str = sc.nextLine();
			if(str.equals("0"))break;
			sumF(str);
		}
		sc.close();
	}
	
	public static void sumF(String s) {
		int sum =0;
		for(int i=0;i<s.length();i++) {
				sum += s.charAt(i) - '0';
		}
		if(sum>=10) {
			String ss = Integer.toString(sum);
			sumF(ss);
		}
		else System.out.println(sum);
	}	
}