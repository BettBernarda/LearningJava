public class GreaterThanEqualTo {
    public static void main(String[] args){
        double recommendedWaterIntake = 8;
        double daysInChallenge = 30;
        double yourWaterIntake = 235.5;

        //Create a double variable  and set it to the product of the recommended water intake (recommendedWaterIntake) and the amount of days in the challenge (daysInChallenge).

        double totalRecommendedAmount = recommendedWaterIntake*daysInChallenge;

        boolean isChallengeComplete = yourWaterIntake>=totalRecommendedAmount;
        System.out.println(isChallengeComplete);

    }

}