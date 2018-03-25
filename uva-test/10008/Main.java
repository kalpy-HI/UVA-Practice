import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		//'A'=65; 'Z'=90;
		
		int howmanylines = sc.nextInt();
		String something = sc.nextLine();
		int[] array = new int[26];
		
		for(int i=0;i<26;i++) {
			array[i]=0;
		}
		
		for(int i=0;i<howmanylines;i++) {
			String thenext = sc.nextLine();
			thenext = thenext.toUpperCase();
			for(int j=0;j<thenext.length();j++) {
				int devalue =(int)thenext.charAt(j);
				if(devalue>=65 && devalue<=90) {
					array[devalue-65]++;
				}
			}
		}
		
		for(;;) {
			int whichone=0;
			int max=0;
			for(int i=0; i<26;i++) {
				if(array[i]>max) {
					max = array[i];
					whichone = i;
				}
			}
			if(0==whichone && 0==max)break;
			System.out.printf("%c %d\n",(char)(whichone+65),array[whichone]);
			array[whichone]=0;
		}		
	}
}