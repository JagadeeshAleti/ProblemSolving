#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int no_chalk;
  cin>>no_chalk;
  float sqrt_val = sqrt(no_chalk);
  int total=no_chalk;
  float extra_chalk=no_chalk;

  float x=no_chalk,y=0;

  while(x>=1)
  {
    float temp = x/sqrt_val + y;
    total+=int(temp);
    y=temp-int(temp);
    x=int(temp);
  }
  cout<<total<<endl;
}