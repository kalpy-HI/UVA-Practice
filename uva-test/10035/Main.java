import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		
		for(;sc.hasNext();) {
			String a = sc.next();
			String b = sc.next();
			if(a.equals("0") &&b.equals("0"))break;
			
			int digit =0;
			if(a.length()>=b.length())digit = a.length();
			else digit = b.length();
			int[] Carr = new int[digit];
			
			String reverseA = new StringBuffer(a).reverse().toString();
			String reverseB = new StringBuffer(b).reverse().toString();
			
			int[] Aint = new int[digit];
			int[] Bint = new int[digit];
			for(int i =0 ;i<digit;i++) {
				Aint[i] =0;
				Bint[i] =0;
			}
			for(int i =0;i<reverseA.length();i++) {
				Aint[i]=reverseA.charAt(i)-'0';
			}
			for(int i =0;i<reverseB.length();i++) {
				Bint[i]=reverseB.charAt(i)-'0';
			}
			
			int count=0;
			int carry=0;
			for(int i =0;i<digit;i++) {
				int kk = carry + Aint[i] + Bint[i];
				Carr[i] = kk;
				if(kk>9) {
					carry =1;
					count++;
				}
				else carry =0;
			}
			if(0==count)System.out.println("No carry operation.");
			else if(count>1)System.out.println(count+" carry operations.");
			else System.out.println(count+" carry operation.");
		}
	}
}