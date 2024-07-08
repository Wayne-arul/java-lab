import java.util.*;

public class CheckPositive{
	public static void main(String[] args){
		int a;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		String ans;
		if(a>0)
			ans="Positive";
		else if(a==0)
			ans="Zero";
		else
			ans="Negative";

		System.out.println(ans);
		
	}
}