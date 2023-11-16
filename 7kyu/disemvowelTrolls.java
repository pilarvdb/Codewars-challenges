// Trolls are attacking your comment section!

// A common way to deal with this situation is to remove all of the vowels from the trolls' comments, 
// neutralizing the threat.

// Your task is to write a function that takes a string and return a new string with all vowels removed.

// For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

// Note: for this kata y isn't considered a vowel.

////////////////////////////////////////////////////////////////////////////////////////////////////////////
// My solution
////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Troll {
    public static String disemvowel(String str) {
      while (str.contains("a")){
        str = str.replace("a", "");
      }
      while (str.contains("e")){
          str = str.replace("e", "");
        }
      while (str.contains("i")){
          str = str.replace("i", "");
        }
      while (str.contains("o")){
          str = str.replace("o", "");
        }
      while (str.contains("u")){
          str = str.replace("u", "");
        }
            while (str.contains("A")){
        str = str.replace("A", "");
      }
      while (str.contains("E")){
          str = str.replace("E", "");
        }
      while (str.contains("I")){
          str = str.replace("I", "");
        }
      while (str.contains("O")){
          str = str.replace("O", "");
        }
      while (str.contains("U")){
          str = str.replace("U", "");
        }
      return str;
    }
}