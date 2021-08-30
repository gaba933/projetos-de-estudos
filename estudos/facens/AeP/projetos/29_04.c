#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <locale.h>
#include <ctype.h>
#include <windows.h>


int main()
{
  
int vetor [20] = {1, 5, 6, 0, 98, 55, 12, 34, 67, 89, 32, 2, 3, 55, 72, 68, 55, 21, 28};
int resultado = 0;

int valor = 55;

int i;

for (i=0; i<20; i++)

if (vetor[i] == valor)

resultado += pow(vetor[i],2);

printf("Resultado final: %i", resultado);
	
}
