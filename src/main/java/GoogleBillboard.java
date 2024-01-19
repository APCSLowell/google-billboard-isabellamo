public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
public static void setup() {            
    String digits = e.substring(2,12);
    double dNum = Double.parseDouble(digits); 
    
    for (int i = 2; i < e.length() - 10; i++){ // read 10 numbers, up by 1
      digits = e.substring(i, i + 10); // locate current 10 numbers
      dNum = Double.parseDouble(digits); // check if the segment is prime
      
      if (isPrime(dNum) == true){ // true case
        System.out.println(digits);
        break;
      } 
    }
}  

public void draw(){ //not needed for this assignment

}  
//The main() method is Java's version of setup()
public static void main(String[[] args){
    setup();
}

public static boolean isPrime(double num){
  boolean decision = true;
  
  if (num < 2){
    decision = false;
  } else {
    for (double i = 2.0; i <= Math.sqrt(num); i++){
      if ((num % i) == 0){
        decision = false;
      }
    }
  } return decision;
} 
