#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void MostrarInvertido(char s[80], char aux[80]);
int main()
{
    char texto[80], auxiliar[80];

    printf("string: ");
    gets(texto);
    //chamada
    
    MostrarInvertido(texto , auxiliar);


    return 0;
}

void MostrarInvertido(char s[80], char aux[80])
{

    int i, j, tam=strlen(s);//retorna da strlen

    //01234
    //teste

    for (i=tam-1; i >= 0; i--, j++)
    {
        aux[j]=s[i];
    }
    aux[j]='\0';

}