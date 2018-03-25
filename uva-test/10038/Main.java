import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		
		for(;sc.hasNext();) {
			int count = sc.nextInt();
			int[] arr = new int[count];
			int[] check = new int[count];
			boolean torf = true;
			
			for(int i=0;i<count;i++) {
				check[i] = 0;
			}
			for(int i=0;i<count;i++) {
				arr[i]= sc.nextInt();
			}
			
			for(int i=0;i<count-1;i++) {
				int ab = Math.abs(arr[i]-arr[i+1]);
				if((ab>=1 && ab<count))
						check[ab] = 1;
			}
			for(int i=1;i<count;i++) {
				if(0==check[i])
					torf = false;
			}
			
			if(torf) 
				System.out.println("Jolly");
			else System.out.println("Not jolly");
		}
		sc.close();
	}
}