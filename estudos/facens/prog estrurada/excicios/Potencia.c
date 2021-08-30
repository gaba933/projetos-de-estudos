#include <stdio.h>
#include <stdlib.h>

float Potencia(float base, float expoente);

int main()
{

    float n1, n2, res;

    printf("digite a Base ");
    scanf("%f", &n1);

    printf("digite o expoente ");
    scanf("%f", &n2);

    res = Potencia(n1,n2);

    printf("o resultado %.2f", res);

    return 0;
}

float Potencia(float base, float expoente)
{
    int i; 
    float resutado = 1;

    for ( i = 1 ; i <=expoente; i++)
    {
        
        resutado *= base;

    }
    
    return resutado;
}
