public class Calculator{

// this project aim to present how to use methods, at this case it would be easier to use "if" statments instead.
  public Calculator(){

  }
  public int add(int value1, int value2 ){
    int sum = value1+value2;
    return sum;
  }
  public int subtract(int value1, int value2){
    int sub = value1-value2;
    return sub;
  }
  public int multiply (int value1, int value2){
    int mult = value1*value2;
    return mult;

  }
  public int divide (int value1, int value2){
    int div = value1/value2;
    return div;
  }
  public int modulo (int value1, int value2){
    int mod = value1%value2;
    return mod;
}

  public static void main(String[] arg){
    Calculator myCalculator = new Calculator();
    System.out.println("sum: " + myCalculator.add(5,7));
    System.out.print("subtract: " + myCalculator.subtract(11,45));


  }

}
