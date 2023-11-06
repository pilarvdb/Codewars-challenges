// Create a function that takes an integer as an argument and returns "Even" for even numbers or 
// "Odd" for odd numbers.

//////////////////////////////////////////////////////////////////////////////////////////////////
// My solution
/////////////////////////////////////////////////////////////////////////////////////////////////

// return a statically allocated string,
// for example a string literal
const char* even_or_odd(int number)
{
  char *even = "Even";
  char *odd = "Odd";
  
  if (number % 2 == 0) 
    return even;
  else
    return odd;
}