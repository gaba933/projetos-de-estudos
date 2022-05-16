 #include <stdio.h>
    #include <stdlib.h>
    int main ()
    {
      
      int a, b, soma;
      
      printf("Digite um numero inteiro: ");
      scanf("%d", &a); 
      
      printf("Digite um numero inteiro: ");
      scanf("%d", &b);
      soma = a + b;
     
      
      printf("O valor da soma = %d\n", soma);
      
      system ("pause");
      return(0);
    }