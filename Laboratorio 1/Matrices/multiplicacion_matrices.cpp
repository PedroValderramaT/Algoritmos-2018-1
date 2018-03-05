#include <iostream>
#include <time.h>
using namespace std;

int n;

int main() {
  clock_t t;
  cin >> n;
  int matrizA[n][n];
  int matrizB[n][n]; 
  int matrizC[n][n];
  
  for(int i = 0; i < n; ++i){
      for(int j = 0; j < n; ++j){
        matrizA[i][j] = 1;
      }
  }
  
  for(int i = 0; i < n; ++i){
      for(int j = 0; j < n; ++j){
        matrizB[i][j] = 2;
      }
  }
  
  for(int i = 0; i < n; ++i){
      for(int j = 0; j < n; ++j){
        matrizC[i][j] = 0;
      }
  }
  
  t = clock();
  for(int i = 0; i < n; ++i){
      for (int j = 0; j < n; ++j){
        for (int k = 0; k < n; ++k){
          matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
        }
      }
  }
  t = clock() - t;
  printf("el tiempo de ejecucion es: %f",((float)t)/CLOCKS_PER_SEC); 
} 

