#include <math.h>
#include <stdio.h>

int digital_root(int n) {
  if (n < 10){
    return n;
  }
  else{
    int sum = 0;
    while (n>0){
      sum = sum + n%10;
      n = n/10;
    }
    return digital_root(sum);
  }
}