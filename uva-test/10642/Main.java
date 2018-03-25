import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		
		for(int i=1;i<=cases;i++){
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			//System.out.println(x1+" "+y1+" "+x2+" "+y2);
			
			int count = 0;
			for(;;){
				if(0==y1) {
					y1 = x1 + 1;
					x1 = 0;
					count++;
				}
				else if(x1+y1==x2+y2){
					count = count + (y1-y2);
					x1 = x2;
					y1 = y2;
				}
				else if(0==x1) {
					if(x2+y2>y1) {
						for(int j=y1+1 ; j<=x2+y2 ; j++) {
							count = count + j ;
						}
						y1 = x2+y2;
					}
				}
				else if(x1>0 && (x1+y1)!=(x2+y2)){
						count = count + y1;
						x1 = x1 + y1;
						y1 = 0;
				}
				
				if(x1==x2 && y1==y2)break;
			}
			System.out.println("Case "+i+": "+count);
		}
	}
}