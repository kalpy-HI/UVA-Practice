import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		
		for(;sc.hasNext();) {
			String deline = sc.nextLine();
			int[] array = new int[128];			
			
			for(int i=0;i<128;i++) {
				array[i]=0;
			}
			
			for(int i=0;i<deline.length();i++) {
				array[(int)deline.charAt(i)]++;
			}
			
			for(;;) {	
				int min=1000;
				int which=0;
				for(int i=127;i>=0;i--) {
					if(min>array[i] && array[i]>0) {
						min = array[i];
						which = i;
					}
				}
				if(1000==min && 0==which)break;
				System.out.printf("%d %d\n",which,min);
				array[which] = 0;
			}
			
			if(sc.hasNext()) {
				System.out.println();
			}
		}
	}
}