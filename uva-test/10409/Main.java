import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc = new Scanner(System.in);
		
		for(;sc.hasNext();) {
			int steps = sc.nextInt();
			String something = sc.nextLine();
			if(0==steps)break;
			
			String[] arrays = new String[steps];
			String[] dir = {"north","east","south","west"};
			
			int[] die = {1,2,3,4,5,6};
			for(int i=0;i<steps;i++) {
				arrays[i] = sc.nextLine();
				if(arrays[i].equals(dir[0])) {
					int temp = die[0];
					die[0] = die[4];
					die[4] = die[5];
					die[5] = die[1];
					die[1] = temp;
				}
				else if(arrays[i].equals(dir[1])) {
					int temp = die[0];
					die[0] = die[2];
					die[2] = die[5];
					die[5] = die[3];
					die[3] = temp;
				}
				else if(arrays[i].equals(dir[2])) {
					int temp = die[0];
					die[0] = die[1];
					die[1] = die[5];
					die[5] = die[4];
					die[4] = temp;
				}
				else if(arrays[i].equals(dir[3])) {
					int temp = die[0];
					die[0] = die[3];
					die[3] = die[5];
					die[5] = die[2];
					die[2] = temp;
				}
			}
			System.out.println(die[0]);
		}
	}
}