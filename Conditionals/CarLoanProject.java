public class CarLoanProject {
  
  int carLoan;
  int loanLengthYear;
  float interestRate;
  int  downPayment;

  public CarLoan( int amountToPay , int amountPayed,  int periodOfPayment , float interest) {
    
      downPayment = amountPayed;
      carLoan = amountToPay;
      loanLengthYear = periodOfPayment;
      interestRate = interest;
   
      if (amountToPay<1){
        System.out.println("Error! You must take out a valid car loan.");

       }else if (amountToPay<amountPayed){
        System.out.println("The car can be paid in full.");
        
       }else{
        System.out.println("Sua divida mensal será de aproximadamente: " + String.format("%.2f", operations()));
       }

    }
    
    public float operations(){
      
      int remainingBalance = carLoan - downPayment;
      int months = loanLengthYear * 12;
      float interestCost = remainingBalance * (interestRate / 100);
      float monthlyPayment = (remainingBalance+interestCost) / months;
      
      return monthlyPayment;

    }
    public static void main (String[] arg){
      //normal
      CarLoan newCar = new CarLoan(10000, 2000, 3, 5);
      //error 1
      CarLoan errorCar = new CarLoan(10, 2000, 3, 5);
      //error 2
      CarLoan errorCar2 = new CarLoan(0, 2000, 3, 5);
    }
  }

	


