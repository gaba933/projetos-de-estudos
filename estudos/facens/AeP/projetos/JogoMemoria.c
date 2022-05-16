#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <locale.h>
#include <ctype.h>
#include <time.h>
#include <unistd.h>
#include <windows.h>

int main()
{
int num[5],res[5],i;
for (i = 0; i < 5; i++)
{
    srand((unsigned)time(NULL));
    num[i] = rand()% 10;
    printf("\n%i\n", num[i]);
    Sleep(100);
}

 system("pause");
  return 0;

}