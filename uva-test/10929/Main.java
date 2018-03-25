import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		
		for(;sc.hasNext();) {
			String number = sc.nextLine();
			if(number.equals("0"))break;
			int sum =0;
			
			for(int i=0;i<number.length();i++) {
				if(0==i%2)sum = sum + (number.charAt(i) - '0');
				else sum = sum - (number.charAt(i) - '0');	
			}
			
			if(0==sum%11) {
				System.out.println(number +" is a multiple of 11.");
			}
			else System.out.println(number +" is not a multiple of 11."); 
		}
	}
}