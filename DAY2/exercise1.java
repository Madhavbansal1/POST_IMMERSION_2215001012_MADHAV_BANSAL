public class Main
{
	public static void main(String[] args) {
		System.out.println(func(3));
		System.out.println(func(4));
		System.out.println(func(5));
		System.out.println(func(6));
	}
	
	public static int func(int n){
	    if( n <= 1) return n;
	    
	    if(n%2 == 0) return n+func(n/2);
	    
	    return func((n+1)/2) + func((n-1)/2);
	}
}
