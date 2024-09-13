public class ReservationUnary {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;
  
  public Reservation(int count, int capacity, boolean open) {
    if (count < 1 || count > 8) {
      System.out.println("Invalid reservation!");
    }
    guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
  }  
  
  public void confirmReservation() {
    if (restaurantCapacity >= guestCount && isRestaurantOpen) {
      System.out.println("Reservation confirmed");
      isConfirmed = true;
    } else {
      System.out.println("Reservation denied");
			isConfirmed = false;
    }
  }
  //Used the unary here!!
  public void informUser() {
    if (!isConfirmed){
      System.out.println("Unable to confirm reservation, please contact restaurant.");
    }else{
      System.out.println("Please enjoy your meal!");
    }
  }
// also made a method to separate informtion on terminal. ( I know, it's silly :) )
  public void separate(){
    System.out.println("/".repeat(20));
  }
  
  public static void main(String[] args) {
    Reservation partyOfThree = new Reservation(3, 12, true);
    Reservation partyOfFour = new Reservation(4, 3, true);
    partyOfThree.confirmReservation();
    partyOfThree.informUser();
    partyOfThree.separate();
    partyOfFour.confirmReservation();
    partyOfFour.informUser();
    partyOfFour.separate();
  }
}
