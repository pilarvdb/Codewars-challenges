// Write a function that, given a string of text (possibly with punctuation and line-breaks), 
// returns an array of the top-3 most occurring words, in descending order of the number of occurrences.

// Assumptions:
// A word is a string of letters (A to Z) optionally containing one or more apostrophes (') in ASCII.
// Apostrophes can appear at the start, middle or end of a word ('abc, abc', 'abc', ab'c are all valid)
// Any other characters (e.g. #, \, / , . ...) are not part of a word and should be treated as whitespace.
// Matches should be case-insensitive, and the words in the result should be lowercased.
// Ties may be broken arbitrarily.
// If a text contains fewer than three unique words, then either the top-2 or top-1 words should be returned, 
// or an empty array if a text contains no words.

// Examples:
// top_3_words("In a village of La Mancha, the name of which I have no desire to call to
// mind, there lived not long since one of those gentlemen that keep a lance
// in the lance-rack, an old buckler, a lean hack, and a greyhound for
// coursing. An olla of rather more beef than mutton, a salad on most
// nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra
// on Sundays, made away with three-quarters of his income.")
// # => ["a", "of", "on"]

// top_3_words("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e")
// # => ["e", "ddd", "aa"]

// top_3_words("  //wont won't won't")
// # => ["won't", "wont"]
// For java users, the calls will actually be in the form: TopWords.top3(String s), 
// expecting you to return a List<String>.

// Bonus points (not really, but just for fun):
// Avoid creating an array whose memory footprint is roughly as big as the input text.
// Avoid sorting the entire array of unique words.

/////////////////////////////////////////////////////////////////////////////////////////////////////////
// My solution
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

public class TopWords {
  private static String removeNonAlpanumeric(String str){
    str = str.replaceAll("[^a-zA-Z'\s]", " ");
    str = str.replaceAll("\s+'+\s+('*\s+)*", " ");
    return str;
  }
  
  private static List<String> topFromHashMap(HashMap<String, Integer> hm){
      List<String> mostOccur = new ArrayList<String>();
      
      if (hm.size() == 0){
        return mostOccur;
      }
      
      if (hm.size() == 1){
        for (HashMap.Entry<String, Integer> entry : hm.entrySet()){
          mostOccur.add(entry.getKey());
          }
      return mostOccur;
      }
      
      
      if (hm.size() == 2){
        int max1 = 0;
        int max2 = 0;
        mostOccur.add("1");
        mostOccur.add("2");
        for (HashMap.Entry<String, Integer> entry : hm.entrySet()){
          Integer val = entry.getValue();
          if (val > max1){
            max2 = max1;
            mostOccur.set(1,mostOccur.get(0));
            max1 = val;
            mostOccur.set(0,entry.getKey());
          }
          else if (val > max2){
            max2 = val;
            mostOccur.set(1, entry.getKey());
          }
        }
        return mostOccur;
      }
      
      int max1 = 0;
      int max2 = 0;
      int max3 = 0;
      mostOccur.add("1");
      mostOccur.add("2");
      mostOccur.add("3");
      for (HashMap.Entry<String, Integer> entry : hm.entrySet()){
        Integer val = entry.getValue();
        if (val > max1){
          max3 = max2;
          mostOccur.set(2,mostOccur.get(1));
          max2 = max1;
          mostOccur.set(1,mostOccur.get(0));
          max1 = val;
          mostOccur.set(0,entry.getKey());
        }
        else if (val > max2){
          max3 = max2;
          mostOccur.set(2,mostOccur.get(1));
          max2 = val;
          mostOccur.set(1, entry.getKey());
        }
        else if (val > max3){
          max3 = val;
          mostOccur.set(2, entry.getKey());
        }
      }
    return mostOccur;
  }
    
    public static List<String> top3(String s) {
      System.out.println(s);
      s = s.toLowerCase();
      s = removeNonAlpanumeric(s);
      List<String> listOfStrings = new ArrayList<String>(Arrays.asList(s.split(" "))); 
      listOfStrings.removeAll(Arrays.asList("", null));
      
      HashMap<String, Integer> hm = new HashMap<String, Integer>();
      int value;
      for (int i=0; i<listOfStrings.size(); i++){
        String key = new String(listOfStrings.get(i));
        if (hm.containsKey(key)){
          value = hm.get(key);
          hm.put(key, value+1);
        } else {
          hm.put(key,1);
        }
      }
      
      return topFromHashMap(hm);
    }
}