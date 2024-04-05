import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Lyan Castanho";
        String tipoConta = "Corrente";
        double saldo = 3052.43;


        System.out.println("****************************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("\n****************************************");


        int opcao = 0;
        String menu = """
                
                **** Digite sua Opção ****
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair
                     
                """;
        Scanner leitura = new Scanner(System.in);
        //cria uma instância da classe Scanner que lê dados da entrada padrão (geralmente o teclado)     não é obrigatório usar os dois juntos, mas geralmente você os usará juntos para ler entrada do usuário.
        while (opcao != 4) {
            System.out.printf(menu);
            opcao = leitura.nextInt();   // é um exemplo de como você pode usar essa instância para ler um número inteiro do usuário. Tem outros metodos tambem nextInt(), nextDouble(), nextLine(), etc.
            if (opcao == 1) {
                System.out.printf("O Saldo é atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.printf("Qual o valor que deseja transferir ");
                double valor = leitura.nextDouble();  //Essa variavel vai receber o que for lido pelo scanner  *a variavel valor tem o que a pessoa digitou
                if (valor > saldo) {                 //comparar para ve se o que ela quer transferir é menor que o saldo, pq se for maior não vai conseguir
                    System.out.printf("Não há saldo para realizar transferencia ");
                } else {
                    saldo = saldo - valor;  //subtrair o valor do saldo
                    System.out.printf("Novo Saldo: " + saldo);
                }

            } else if (opcao == 3) {
                System.out.printf("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo = saldo + valor;
                System.out.printf("Novo Saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.printf("Opção Inválida!");
            }
            ;

        }
        ;
    }

    ;
}








