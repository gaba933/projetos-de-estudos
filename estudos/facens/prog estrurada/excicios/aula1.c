#include <stdio.h>
#include <stdlib.h>

//prototipo da funcao
float CalConsumo(float km, float l);

int main()
{

    float distacia, volume, consumo;

    printf("digite a distacia e o volume ");
    scanf("%f %f",&distacia,&volume);

    consumo=CalConsumo(distacia,volume);

    printf("o consumo e %.2f ", consumo);

    return 0;
}

//definicao da funcao
float CalConsumo(float km, float l)
{
    return(km/l) ;
}
