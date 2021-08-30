#include <stdio.h>

int main() {
      float fire,cel,res;
      
    printf("\n\nconversor\n");
    printf("----------------");

    printf("\ndigite o valor em Fahrenheit      ");
    scanf("%f", &fire);

    cel = (fire - 32) /1.8;
    if ( cel<15)
    {
      printf("\n esta frio, a temperatura e de %.2f",cel);
    }
    else {
      if ( cel>= 15 && cel<=30)
      {
        printf("\n esta normal, a temperatura e de %.2f",cel);
      }
      else {
      if ( cel>30)
      {
        printf("\n esta quente, a temperatura e de %.2f",cel);
      }
     }
    }
    system("pause");
  return 0;
} 