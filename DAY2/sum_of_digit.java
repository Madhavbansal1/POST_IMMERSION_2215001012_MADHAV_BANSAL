public class Main
{
	public static void main(String[] args) {
		System.out.println(func(11));
	}
	
	public static int func(int n){
	    int sum = 0;
	    
	    while(n > 0){
	        sum += n%10;
	        n /= 10;
	    }
	    
	    return sum;
	}
}
