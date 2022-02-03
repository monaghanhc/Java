public class Accumulation {

  public static void main(String[] args) {

    System.out.println("-------Test sumM---------");
    System.out.println(sumN(0)); //0
    System.out.println(sumN(1)); //1
    System.out.println(sumN(2)); //3
    System.out.println(sumN(4)); //10
    System.out.println(sumN(5)); //15

    System.out.println("-------Test multN---------");
    System.out.println(multN(1)); //1
    System.out.println(multN(2)); //2
    System.out.println(multN(3)); //6
    System.out.println(multN(4)); //24
    System.out.println(multN(5)); //120

    System.out.println("--- Test sumMult5 ---"); // how do we choose good test cases? Think about edge cases
    System.out.println(sumMult5(0)); //0
    System.out.println(sumMult5(3)); //0
    System.out.println(sumMult5(5)); //5
    System.out.println(sumMult5(12)); //15
    System.out.println(sumMult5(15)); //30
    System.out.println(sumMult5(16)); //30
    //
    // System.out.println("--- Test multiplyString ---");
    // System.out.println(multiplyString("hey", 3)); // "heyheyhey"
    // System.out.println(multiplyString("hey", 0)); //""
    // System.out.println(multiplyString("hey", 1));
    // System.out.println(multiplyString("", 100)); //""
    // System.out.println(multiplyString("h", 5));

  }







  // Sum all the positive integers between 1 and n (included)
   public static int sumN (int m){
    int result = 0;
    for (int i=1; i<=m; i++){
      // result = result +i;
      result += i;
    }
    return result;
   }








  // Multiply all the positive integers between 1 and n (included)
   public static int multN(int n) {
     int result = 1;
     for (int i=1; i<=n; i++){
       // result = result * i;
       result *= i;
     }
     return result;
   }










  // Sum all the positive integers multiple of 5 up to n (included)
   public static int sumMult5 (int n){
    int result = 0;
    for (int i =5; i<=n; i+=5){ //i+=5 is equal to i = i+5
      result +=i;
    }
    return result;
   }













  // What is the common structure in those examples?
  // Accumulation strategy:
  // 1) Initialize a variable that will contain the result
  // 2) Update the result inside a loop
  // 3) After the loop, finalize (if needed) and return the result


  // Multiply a given string n times
  // example:
  //   multiplyString("hey", 3) returns "heyheyhey"
  // public static String multiplyString(String s, int n){
  //   //TODO
  // }


}
