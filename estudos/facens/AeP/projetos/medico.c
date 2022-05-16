#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <locale.h>

int main ()
{
int cod,count=1,aten;
setlocale(LC_ALL, "portuguese");
printf("\nQuantos atendimentos serao feitos");
scanf("%i", &count );
for (aten = 1; aten <= count; aten++)
{
    printf("\n digiti o codigo:   ");
scanf("%i", &cod);
fflush(stdin);
switch (cod)
{
 case 4:
     printf("\n\n Gripe-Vitamina C");
     break;

 case 1:
     printf("\n\n Virose-Descanso");
     break;

 case 2:
     printf("\n\n Virose-Descanso");
     break;

 case 3:
     printf("\n\n Dor de cabeça-Analgésico");
     break;

 case 5:
     printf("\n\n Dor de cabeça-Analgésico");
     break;

 case 6:
     printf("\n\n Não definida-Exames");
     break;

 default:
     printf("\n\n Código Inválido");
     break;
 }
}
  system("pause");
return 0;
}//main