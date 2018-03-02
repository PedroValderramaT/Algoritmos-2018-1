#include <iostream>

using namespace std;

short auxiliar;
short primero = 0;
short segundo = 1;
short i = 2;


int main() {
  cout << "0" << " " << 0 << endl;
  cout << "1" << " " << 1 << endl;
 
  while(segundo > 0){
        auxiliar = segundo;
        segundo += primero;
        primero = auxiliar;
        cout << i << " " << segundo << endl;
        i += 1;
       
  }
  cout << "Para una variable de tipo Short se produce un overflow para n = " << i - 1 << endl;
}
