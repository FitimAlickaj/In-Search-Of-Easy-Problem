import java.util.Scanner;
public class A{
	public static void main (String [] args){
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(),hard=0;
		
		for(int i = 1; i<=n;i++){
			
			int p = input.nextInt();
			if (p == 1) hard++;
			
		}
		if(hard == 0) System.out.println("EASY");
		else System.out.println("HARD");
	}
 
}
