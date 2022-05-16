#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <locale.h>
#include <ctype.h>

int main()
{
  int  n1=7,n2=17,n3=284,cont=0;

for (cont = n2; cont >= n1; cont--)
{
   if (cont * 2 == n1)
   {
     cont = n3;
   }
   else
   {
     n2 = n1;
   }
}
n2 = (cont+1) + n1 ;

printf("\nvalor de n2 - %i",n2);

}