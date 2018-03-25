import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		
		for(;sc.hasNext();) {
			String s = sc.nextLine();
			if(s.equals("0"))break;
			
			int sum =0;
			for(int i=0;i<s.length();i++) {
				sum += s.charAt(i)-'0';
			}
			
			if(0==sum%9) {
				int times = 1;
				if(9!=sum) {
					for(;;) {
						times++;
						String a = Integer.toString(sum);
						int sum2=0;
						for(int j=0;j<a.length();j++) {
							sum2 += a.charAt(j)-'0';
						}
						if(9==sum2)break;
						else {
							sum = sum2;
						}
					}
				}
				System.out.println(s+" is a multiple of 9 and has 9-degree "+times+".");
			}
			else System.out.println(s+" is not a multiple of 9.");
			
		}
		sc.close();
	}
}