#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main()
{
	int i, t=5, aux, x[5] = {2, 3, 5, 4, 3};
	for(i=0;i<t;i++){
        aux = x[i];
        x[i] = x[t-i-1];
        printf("%d\t", x[i]);
	}
	return 0;
}
