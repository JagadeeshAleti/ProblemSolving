#include<iostream>
using namespace std;
int main()
{
	int sun,mon,tue,wed,thu,fri,sat;
  	int a;
  	cin>>sun>>mon>>tue>>wed>>thu>>fri>>sat;
    if(sun+mon+tue+wed+thu+fri+sat<=40)
    {
      sun=sun*150;
      mon= mon>8 ? (mon-8)*15+ mon*100 : mon*100;
      tue= tue>8 ? (tue-8)*15+ tue*100 : tue*100;
      wed= wed>8 ? (wed-8)*15+ wed*100 : wed*100;
      thu= thu>8 ? (thu-8)*15+ thu*100 : thu*100;
      fri= fri>8 ? (fri-8)*15+ fri*100 : fri*100;
      sat= sat*125;
      cout<<(sun+mon+tue+wed+thu+fri+sat)<<endl; 
    }
    else
    {
      cout<<(sun+mon+tue+wed+thu+fri+sat)*100<<endl; 
    }
  	/*int time = sun+mon+tue+wed+thu+fri+sat;
  	if(time<=40) {
    	if(sun!=0)
          	a = time*100+(sun*50);
      	if(mon>8)
          	a = time*100+(mon*15);
     	if(tue>8)
       	  	 a = time*100+(tue*15);
      	if(wed>8)
         	 a = time*100+(wed*15);
      	if(thu>8)
          	a = time*100+((thu-8)*15);
      	if(fri>8)
          	a = time*100+(fri*15);
      	if(sat!=0)
         	 a = time*100+(sat*25);
    }
  	else {
      	a = time*100+((time-40)*25);
    }*/
    cout<<a;
}