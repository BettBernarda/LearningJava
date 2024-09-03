public class MultAndDivide {
	public static void main(String[] args) {   
		double subtotal = 30;
    double tax = 0.0875;

    //Create a double variable, total, that holds subtotal plus the product of subtotal and tax.

    double total = subtotal+(subtotal*tax);

    //Create a double variable called perPerson that holds total divided by 4.

    double perPearson = total/4;

    System.out.println("Per pearson: "+perPearson);
    System.out.println("Total: "+total);

	}
}