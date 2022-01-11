// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	
	char sym;
	cout<<"Pick a symbol";
	cin>>sym;
	
	for(int y=1; y<6; y++){
	gotoxy(12,6+y);
	cout<<sym;
	sleep(1);
	cout<<endl;
	gotoxy(12,6+y);
	cout<<"  ";
	
	}
	
}



		
	

