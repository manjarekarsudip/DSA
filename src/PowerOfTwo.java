
public class PowerOfTwo {

	public boolean isPowerOfTwo(int n) {
        if(n<1){
        	System.out.println(n + " is not in Power of Two");
            return false;
        }
        if(n==1){
        	System.out.println(n + " is in Power of Two");
            return true;
        }
        int x=n;
        while(x%2==0){
            x=x/2;
        }
        if(x==1){
        	System.out.println(n + " is in Power of Two");
            return true;
        }else{
        	System.out.println(n + " is not in Power of Two");
            return false;
        }
    }
	
	public static void main(String[] args) {

		PowerOfTwo powerOfTwo = new PowerOfTwo();
		powerOfTwo.isPowerOfTwo(16);
	}

}
