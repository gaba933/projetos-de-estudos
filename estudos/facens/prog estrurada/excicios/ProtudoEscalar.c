#include<stdio.h>

//prototipo
void RecebeVetor(int vet[5]);
void MostrarVetor(int vet[5]);
int CalcularProtudo(int vetA[5], int vetB[5]);

int main()
{
    int a[5],b[5],i;

    printf("\nVetor A\n");
    RecebeVetor(a);

    printf("\nVetor B\n");
    RecebeVetor(b);

    printf("\nProduto Escalar = %i",calculaProduto(a,b));
    MostraVetor(a);
    MostraVetor(b);

    return 0;
}

int calculaProduto(int vetA[5], int vetB[5])
{
    int i,resultado=0;
    for(i=0;i<5;i++)
    {
        resultado=resultado+vetA[i]*vetB[i];
    }
    
    return resultado;
}

void RecebeVetor(int vet[5])
{
    int i;
    for(i=0;i<5;i++)
    {
        printf("Digite um valor [%i]: ",i);
        scanf("%i",&vet[i]);
    }
}

void mostraVetor(int vet[5])
{
    int i;
    for(i=0;i<5;i++)
    {
        printf("\n%i",vet[i]);
    }
}