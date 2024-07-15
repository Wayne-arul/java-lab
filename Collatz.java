public class Collatz
{
    static int calc(int n){
        if(n>=2) {
            if(n%2==0){
                System.out.print(n + " ");
                return calc(n/2);
            }
            else{
                System.out.print(n + " ");
                return calc(3*n+1);
            }  
        }
        return 1;
    }
    
	public static void main(String[] args) {
		System.out.println(calc(19));
	}
}
