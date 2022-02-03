public class BirthYear {

  public static void main(String[] args) {
    int year; //declare a variable named year of type int
    year = yearCalculate(30); //assign the value returned by the yearCalculate(int x) method to the defined variable
    System.out.println("I was born in: " + year); //print "I was born in" followed by the calculated year
  }

  //A method to calculate and return the birth year
  public static int yearCalculate(int x) {
    int ans = x + 220;
    //System.out.println("Your birth year is:" + ans);
    return "your birht year is " + ans;

  }

}
