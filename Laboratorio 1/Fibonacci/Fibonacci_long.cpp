#include <iostream>

using namespace std;

long auxiliar;
long primero = 0;
long segundo = 1;
long i = 2;


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
  cout << "Para una variable de tipo Long se produce un overflow para n = " << i - 1 << endl;
}
