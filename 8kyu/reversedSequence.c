// Build a function that returns an array of integers from n to 1 where n>0.

// Example : n=5 --> [5,4,3,2,1]

///////////////////////////////////////////////////////////////////////////////////////////////////////
// My solution
//////////////////////////////////////////////////////////////////////////////////////////////////////

#include <stdlib.h>
#include <stdio.h>

unsigned short *reverse_seq(unsigned short num)
{
  static unsigned short *list;
  list = malloc(num * sizeof(unsigned short));
  if (!list) return NULL;
  
  for (int i=num; i>0; i--){
    list[num-i] = i;
  }
  
  return list; 
}