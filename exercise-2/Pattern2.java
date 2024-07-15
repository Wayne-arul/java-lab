import java.util.*;

public class Pattern2
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r =0;
		
		for(int i=0;i<n;i++){
		    for(int j=0;j<i+1;j++){
		        r++;
		        System.out.print(r+ " ");
		    }
		    System.out.println();
		}
	}
}