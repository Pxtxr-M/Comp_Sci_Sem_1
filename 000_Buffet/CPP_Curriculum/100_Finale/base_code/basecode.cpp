// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
char sym;
cout<<"To rain enter |, to snow enter *";
cout<<endl;
	cin>>sym;

for(int y=2; y<=6; y++){
	for(int x=2; x<=6; x++){
		gotoxy(10,y+4);
		cout<<sym;
		sleep(1);
		cout<<endl;
		gotoxy(10,y+4);
		cout<<"  ";
		
	

		}
	}
		if(sym=='|')
		{
		cout<<"its raining! :("<<endl;
		}
		else
		{
			cout<<"its snowing! :)"<<endl;
		}
}




