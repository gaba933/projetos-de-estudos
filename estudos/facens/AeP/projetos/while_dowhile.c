#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <locale.h>
#include <ctype.h>

int main()
{
float n1,n2,res,res2;
char SN='s';
setlocale(LC_ALL, "portuguese");
while (toupper(SN)=='S')
{
  system("cls");  
  printf("\nDigite o lado do quadrado:  ");
  scanf("f", &n1);
  fflush(stdin);
  res=pow(n1,2);
  res2=n1*4;
 printf("\nA Area do quadrado: %.2f\n\nPerimetro : %.2f\n ",res,res2);
 printf("\nDeseja continuar?  Sim ou Nao  ");
 scanf("c", &SN);
 fflush(stdin);
 }//while
 system("pause");
 return 0;
}