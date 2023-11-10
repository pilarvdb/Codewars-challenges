// Given a non-empty array of integers, return the result of multiplying the values together in order. 
// Example:

// [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24

//////////////////////////////////////////////////////////////////////////////////////////////////////
// My solution
/////////////////////////////////////////////////////////////////////////////////////////////////////
#include <stddef.h>

int grow(size_t size, const int arr[size]) {
  int total = 1;
  for (unsigned short i=0; i < size; i++){
    total *= arr[i];
  }
  return total;
}