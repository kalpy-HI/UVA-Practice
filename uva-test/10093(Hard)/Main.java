import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		//'A'=65; 'Z'=90;
		
		for(;sc.hasNext();) {
			String a = sc.nextLine();
			int max = 1;
			int sum = 0;
			
			//below is get sum and
			for(int i=0;i<a.length();i++) {
				char kk = a.charAt(i);
				
				if(kk>='0' && kk<='9') { 
					int temp = (int)(kk-'0');
					if(max<temp) {
						max = temp;
					}
					sum += temp;
				}
				else if(kk>='A' && kk<='Z') { 
					int temp = (int)(kk-'A')+10;
					if(max<temp) {
						max = temp;
					}
					sum += temp;
				}
				else if(kk>='a' && kk<='z') { 
					int temp = (int)(kk-'a')+36;
					if(max<temp) {
						max = temp;
					}
					sum += temp;
				}	
			}
			
			for(int i=max;i<62;i++) {
				if((sum%i)==0) {
					System.out.printf("%d\n",i+1);
					break;
				}
				if(62==i+1)
					System.out.println("such number is impossible!");
			}
		}
	}
}