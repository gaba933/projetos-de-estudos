#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio.h>
#include <time.h>

int main()
{
    int i,j;
    float num [5][2];\
     for (i=0; i<6; i++)
     {
     for (j=0; j<3; j++)
     {
        
        scanf("%f", &num[j][i]);
     }
     }
    system("pause");
    
   return 0;
}
