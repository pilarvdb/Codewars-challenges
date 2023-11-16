// Your task is to make a function that can take any non-negative integer as an argument and 
// return it with its digits in descending order. Essentially, rearrange the digits to create the 
// highest possible number.

// Examples:
// Input: 42145 Output: 54421

// Input: 145263 Output: 654321

// Input: 123456789 Output: 987654321

/////////////////////////////////////////////////////////////////////////////////////////////////////////
// My solution
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    String temp = Integer.toString(num);
    Integer[] arrayNum = new Integer[temp.length()];
    for(int i=0; i< temp.length(); i++){
      arrayNum[i] = temp.charAt(i) - '0';
    }
    Arrays.sort(arrayNum, Collections.reverseOrder());
    
    int numberConverted = 0;
    for (Integer x: arrayNum){
      numberConverted = 10*numberConverted + x;
    }
    return numberConverted;
  }
}