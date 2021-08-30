#include<stdio.h>

//Calcular  o  consumo  médio  de  gasolina  de  um  tanque  de  automóvel.
// Pedir  para  o  usuário  entrar com a distância (km) e volume (litros).
// Cm = d (km) / v (litros)
//Protótipo
float calculaConsumo(float km, float l);
int main()
{
    float distancia, volume, consumo;

    printf("Digite a distancia (km) e o volume do combustivel (litros): ");
    scanf("%f %f",&distancia,&volume);

    //Chamada
    consumo=calculaConsumo(distancia,volume);
    printf("\nConsumo medio = %.2f",consumo);

    return 0;
}
//Definição
float calculaConsumo(float km, float l)
{
    return (km/l) ;
}