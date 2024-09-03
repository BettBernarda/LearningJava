public class  CompoundOperator{
	public static void main(String[] args) {   
		int numCookies = 17;

  //A customer comes and buys 3 cookies. Use the appropriate compound assignment operator to reflect this change.
    numCookies-=3;
    
    System.out.println(numCookies);
  //Another customer buys half of the remaining cookies.
    numCookies/=2;

    System.out.println(numCookies);
	}
}