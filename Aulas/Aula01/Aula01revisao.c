#include <stdio.h>
#include <stdlib.h>

int main(){
    char nome[100];
    int boulosAlimentar;
    float quantidadeInsulinaMax;
    int carboidrato;

    // 1. Coleta de dados
    printf("Nome: ");
    fgets(nome, 100, stdin);

    printf("Qual o seu Boulus Alimentar (g/u): ");
    scanf("%d", &boulosAlimentar);

    printf("Qual a quantidade de carboidratos ingerida (g): ");
    scanf("%d", &carboidrato);

    printf("Qual sua dose maxima de insulina (u): ");
    scanf("%f", &quantidadeInsulinaMax);

    // 2.Processamento 
    float quantidadeInsulina = (float)carboidrato / boulosAlimentar;
    float quantidadeMaxCarboidrato = boulosAlimentar * quantidadeInsulinaMax;

    // Saída
    printf("\n--- Relatorio para: %s", nome);
    printf("Dose de insulina a aplicar: %.2f unidades\n", quantidadeInsulina);
    printf("Limite maximo de carboidratos para sua dose max: %.2f g\n", quantidadeMaxCarboidrato);

    return 0;
}