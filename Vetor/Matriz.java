package Vetor;

import java.awt.*;
import java.util.ArrayList;

public class Matriz {
    public static void main(String[] args) {

           // vetor
        Integer [] listaDeInformacoesDeNumerosInteiros = new Integer[6];
        listaDeInformacoesDeNumerosInteiros[0] = 0;
        listaDeInformacoesDeNumerosInteiros[1] = 1;
        listaDeInformacoesDeNumerosInteiros[2] = 2;
        listaDeInformacoesDeNumerosInteiros[3] = 3;
        listaDeInformacoesDeNumerosInteiros[4] = 4;
        listaDeInformacoesDeNumerosInteiros[5] = 5;
        System.out.println(listaDeInformacoesDeNumerosInteiros[5]);




            //Matriz
        List<String> listaDeInformacoes = new ArrayList<>();
          listaDeInformacoes.add("carteira");
          listaDeInformacoes.add("bone");
          listaDeInformacoes.add("lapis");
          listaDeInformacoes.add("mause");
          listaDeInformacoes.add("Oculos");
          listaDeInformacoes.add("lentes");

          System.out.println(listaDeInformacoes);
    }
}
