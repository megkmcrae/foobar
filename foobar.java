
public class foobar{
  public static void main(String argv[]){
    for (int m = 1; m <= 15; m++){      //cycles through the integers 1 through 15
      if (m%3 == 0 && m%5 != 0) System.out.println("foo");          //checks if the current number is only a multiple of 3
      else if (m%3 != 0 && m%5 == 0) System.out.println("bar");     //checks if the current number is only a multiple of 5
      else if (m%3 == 0 && m%5 == 0) System.out.println("foobar");  //checks if the current number is a multiple of 3 and 5
      else System.out.println(m);       //if the current number not a multiple of 3 or 5, just print the number
    }
  }
}
