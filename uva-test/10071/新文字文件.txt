import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		
		for(;sc.hasNext();) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = 0;

			sum = 2*a*b;
			System.out.println(sum);
		}
	}
}