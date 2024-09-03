public class GreaterLessThan {
	public static void main(String[] args) {   
		double creditsEarned = 176.5;
        double creditsOfSeminar = 8;
        double creditsToGraduate = 180;

        //Print the expression that checks if the amount of credits you have earned, creditsEarned, is greater than the number of credits you need to graduate, creditsToGraduate.
        System.out.println(creditsEarned > creditsToGraduate);

        //Create a variable called creditsAfterSeminar
        double creditsAfterSeminar = creditsEarned+creditsOfSeminar;

        //Print out whether creditsToGraduate is less than creditsAfterSeminar.

        System.out.println(creditsAfterSeminar>creditsToGraduate);
	}
}