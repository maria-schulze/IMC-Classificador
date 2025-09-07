import java.util.Scanner;

public class AtividadeIMC {
    public static void main(String[] args) {
        
        Scanner lerTeclado = new Scanner(System.in);

        System.out.printf("Digite seu nome: ");
        String nome = lerTeclado.nextLine();

        System.out.printf("Digite seu gênero (M, F, N): ");
        char genero = lerTeclado.nextLine().charAt(0);

        System.out.printf("Digite sua altura: ");
        double altura = lerTeclado.nextDouble();

        System.out.printf("Digite seu peso: ");
        double peso = lerTeclado.nextDouble();

        double IMC = peso / (Math.pow(altura, 2));
        
        String classificacao = "Gênero não citado corretamente, digite masculino, feminino ou neutro";

        switch (genero) {
            case 'M', 'm':
                if (IMC >= 40)
                    classificacao = "Obesidade Mórbida";
                else if (IMC >= 30)
                    classificacao = "Obesidade Moderada";
                else if (IMC >= 25)
                    classificacao = "Obesidade Leve";
                else if (IMC >= 20)
                    classificacao = "Normal";
                else if (IMC < 20)
                    classificacao = "Abaixo do Normal";

                break;
            
            case 'F', 'f', 'N', 'n': 
                if (IMC >= 39)
                    classificacao = "Obesidade Mórbida";
                else if (IMC >= 29)
                    classificacao = "Obesidade Moderada";
                else if (IMC >= 24)
                    classificacao = "Obesidade Leve";
                else if (IMC >= 19)
                    classificacao = "Normal";
                else if (IMC < 19)
                    classificacao = "Abaixo do Normal";
            
                break;            
        
             default:
                classificacao = "Gênero inválido (digite apenas M, F ou N)";
        }

System.out.println("Nome: " + nome);
System.out.println("Gênero: " + genero);
System.out.printf("IMC: %.1f\n", IMC);
System.out.println("Classificação: " + classificacao);
    }
}