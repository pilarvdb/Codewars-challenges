// Usually when you buy something, you're asked whether your credit card number, phone number or answer 
// to your most secret question is still correct. However, since someone could look over your shoulder, 
// you don't want that shown on your screen. Instead, we mask it.

// Your task is to write a function maskify, which changes all but the last four characters into '#'.

// Examples (input --> output):
// "4556364607935616" --> "############5616"
//      "64607935616" -->      "#######5616"
//                "1" -->                "1"
//                 "" -->                 ""

// // "What was the name of your first pet?"
// "Skippy" --> "##ippy"
// "Nananananananananananananananana Batman!" --> "####################################man!"

//////////////////////////////////////////////////////////////////////////////////////////////////////////
// My solution
//////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Maskify {
    public static String maskify(String str) {
      if (str.length() <= 4){
        return str;
      }
      int numberOfHasht = str.length()-4;
      String res = "#".repeat(numberOfHasht) + str.substring(str.length()-4, str.length());
      return res;
    }
}