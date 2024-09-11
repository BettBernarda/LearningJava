public class Droid{
  String name;
  int batteryLevel;
  
  public Droid (String droidName){
    name = droidName; // instance now receive the name value
    batteryLevel = 100;
  }
 

  public String toString(){ //print the name with a phrase
      return "The Droid's name is "+ name + ", what a cute name right?";

    }
  public String performTask( String task){
    batteryLevel -= 10;
    return name + " is performing task: "+ task;
  }


  public static void main(String[] arg){
    Droid Codey = new Droid("Codey");
    System.out.println(Codey.toString());
    System.out.println(Codey.performTask("Training other A.I friends"));


  }

}
