import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] argc){
		Scanner sc = new Scanner(System.in);
		
		int count=0;
		for(;;){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0&&b==0)break;
			count++;
			if(count>1)System.out.println();
			String something = sc.nextLine();
			String[] array = new String[a];
			int[][] answer = new int[a][b];
			
			for(int i=0;i<a;i++){
				array[i] = sc.nextLine();
			}
			
			for(int i =0;i<a;i++){
				for(int j =0;j<b;j++){
					if('*'==array[i].charAt(j)){
						answer[i][j]= -1;
					}
					else answer[i][j]= 0;
				}
			}
			
			for(int i =0;i<a;i++){
				for(int j =0;j<b;j++){
					if(-1==answer[i][j]){
						for(int k=i-1;k<=i+1;k++){
							if(k<0 || k>=a)continue;
							for(int l=j-1;l<=j+1;l++){
								if(l<0 || l>=b)continue;
								   if(answer[k][l]!=-1){
								      answer[k][l]++;
								   }
							}
						}
					}
				}
			}
			
			System.out.println("Field #"+count+":");
			
			for(int i =0 ;i<a;i++) {
				for(int j=0;j<b;j++) {
					if(-1==answer[i][j]) {
						System.out.print("*");
					}
					else System.out.printf("%d",answer[i][j]);
				}
				System.out.println();
			}
		}
	}
}