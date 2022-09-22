import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);


        System.out.println(" escolha uma operacao :");
        String operacaoEscolhida = calculadora.next();
        System.out.println(" digite um valor ");
        Integer primeiroValor = calculadora.nextInt();
        System.out.println(" digite um segundoValor");
        Integer segundoValor = calculadora.nextInt();

        String soma =" + ";
        String variavel02 = " - ";
        String variavel03 = " / ";
        String variavel4 = " * ";



        if(operacaoEscolhida.equals(soma)){
            Integer resultado = primeiroValor + segundoValor;
            System.out.println(" se o resultado for " + resultado );
        }else if (operacaoEscolhida.equals(variavel02)){
            Integer resultado02 = primeiroValor - segundoValor;
            System.out.println("se a operacao for :" + resultado02);

        }else if (operacaoEscolhida.equals(variavel03)){
            Integer resultado03 = primeiroValor / segundoValor;
            System.out.println("se o resultado for :" + resultado03);

        }else if (operacaoEscolhida.equals(variavel4)){
            Integer resultado04 = primeiroValor * segundoValor;
            System.out.println("se o resultado for :" + resultado04);
        }
    }
}
