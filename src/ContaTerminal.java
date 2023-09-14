
/*Crie um projeto ContaBanco que recebera dados via terminal,
 contendo as caracterisiticas de conta em banco conforme atributos abaixo :
 Dentro do projeto crie a classe ContaTerminal.java para realizar toda a certificação do nosso programa.

Atributo     Tipo    Exemplo
Numero	     int     1021
Agencia      texto    067-8
NomeCliente  texto    237.48

Permita que os dados seja inseridos via terminal sendo que o usario recebera a mensagem de qual
informação  sera solicitada

 programa "Por Favor digite o numero da agencia";
Usuario 1021 (depois digite o enter)

depois de todas as informações terem sidos inserios o sistema dvera exibir a sguinte mensagem :

"Ola [Nome Cliente], obrigado por criar uma conta em nosso banco , sua agencia é [Agencia,]
 conta [Conta] e seu saldo [Saldo], ja sta disponivel para saque.

*/

import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {


//Atributos

        int NumeroDaConta = 10557;
        int agencia=0;
        String nomeCliente ="Jose " ;
        double saldo = 237.00;

        Scanner inp =new Scanner(System.in);

        System.out.println("Por favor digite o numero de sua agência  : " + agencia);
        agencia = inp.nextInt();


        System.out.println("Ola " + nomeCliente );


        System.out.println("Obrigado por criar uma conta em nosso banco");
        System.out.println("Sua agência é : " + agencia);
        System.out.println("Sua conta é : " + NumeroDaConta);
        System.out.println("Seu saldo é de R$: " + saldo + " Seu saldo ja  esta disponivel para o saque");



    }
}
