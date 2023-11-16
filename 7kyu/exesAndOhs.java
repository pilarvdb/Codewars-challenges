// Check to see if a string has the same amount of 'x's and 'o's. The method must 
// return a boolean and be case insensitive. The string can contain any char.

// Examples input/output:

// XO("ooxx") => true
// XO("xooxx") => false
// XO("ooxXm") => true
// XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
// XO("zzoo") => false

///////////////////////////////////////////////////////////////////////////////////////////////////////////
// My solution
///////////////////////////////////////////////////////////////////////////////////////////////////////////

public class XO {
  
  public static boolean getXO (String str) {
    int numOfO = 0;
    int numOfX = 0;
    for (int i=0; i<str.length(); i++){
      if (str.charAt(i) == 'o' || str.charAt(i) == 'O'){
        numOfO++;
      }
      if (str.charAt(i) == 'x' || str.charAt(i) == 'X'){
        numOfX++;
      }
    }
    return numOfO == numOfX;
  }
}