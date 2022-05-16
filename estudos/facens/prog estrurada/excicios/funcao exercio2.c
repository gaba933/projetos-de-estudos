#include <stdio.h>
#include <stdlib.h>

void MostrarVetor(int vet[5]);

int main()
{

    int a[5],i;

    for ( i = 0; i < 5; i++)
    {
        printf("digite o valor [%i]: ", i);
        scanf("%i", a[i]);
    }
    


    return 0 ;
}

void MostrarVetor(int vet[5])
{
    int i;

    for ( i = 0; i < 5; i++)
    {
        printf("%i", vet[5]);
    }
    

    return ;
}