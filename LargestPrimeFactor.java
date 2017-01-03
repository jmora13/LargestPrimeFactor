// What is the largest prime factor of the number 600851475143 ?
public class LargestPrimeFactor {
	public static void main(String[] args){
	long x = 600851475143L;
	int y = 2;
	while( x / y != 1){
		if(x % y == 0){
		x = x/y;
		y = 2;	
	}else{
		y++;	
			}
		}
	System.out.println(x);
	}
}
