#include<iostream>
#include <iomanip>
#include <math.h>  
using namespace std;
int main() {

	int totalBalls,totalRuns,runsScored,ballsCompleted;
  	cin>>totalBalls;
  	cin>>totalRuns;
  	cin>>runsScored;
  	cin>>ballsCompleted;
	float overs,oversFinished,currenrtRunRate,totalRunRate;
	overs = totalBalls/6;
	oversFinished = (ballsCompleted/6)+((ballsCompleted%6)*0.1);
	currenrtRunRate = runsScored/oversFinished;
  	totalRunRate = totalRuns/overs;

  	cout<<overs<<endl;
  	cout<<oversFinished<<endl;
  	cout<<round(currenrtRunRate*10)/10.0<<endl;
  	cout<<round(totalRunRate*10)/10.0<<endl;
  	totalRunRate<currenrtRunRate?cout<<"Eligible to Win"<<endl:cout<<"Not Eligible to Win"<<endl;
}