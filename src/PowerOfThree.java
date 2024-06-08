
public class PowerOfThree {

	public boolean isPowerOfThree(int n) {
        if(n<=0){
        	System.out.println(n + " is not in Power of Three");
            return false;
        }
        int x=n;
        while(x%3==0){
            x=x/3;
        }
        if(x==1){
        	System.out.println(n + " is in Power of Three");
            return true;
        }else{
        	System.out.println(n + " is not in Power of Three");
            return false;
        }
    }
	
	public static void main(String[] args) {
		
		PowerOfThree powerOfThree = new PowerOfThree();
		powerOfThree.isPowerOfThree(27);
	}

}
