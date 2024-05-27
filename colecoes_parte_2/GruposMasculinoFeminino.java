package colecoes_parte_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GruposMasculinoFeminino {

    public static void main(String[] args) {
        //faça um programa que leia um nome e sexo
        //separar as pessoas por grupos, masculino e feminino

        exampleChamarTipoDePessoaPorSexo();

    }

    private static void exampleChamarTipoDePessoaPorSexo() {

        List<PessoasModel> listaPessoas = new ArrayList<PessoasModel>();

        PessoasModel a = new PessoasModel("Jaqueline", "Feminino");
        PessoasModel b = new PessoasModel("João", "Masculino");
        PessoasModel c = new PessoasModel("Joana", "Feminino");
        PessoasModel d = new PessoasModel("Manoel", "Masculino");

        listaPessoas.add(a);
        listaPessoas.add(b);
        listaPessoas.add(c);
        listaPessoas.add(d);

        //vou adicionar eles em listas diferentes, assim cada um fica armazenado já em seu respectivo grupo
        List<PessoasModel> listaMasculina = listaPessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equals("Masculino"))
                .collect(Collectors.toList());

        List<PessoasModel> listaFeminina = listaPessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equals("Feminino"))
                .collect(Collectors.toList());

        System.out.println("Candidatos Masculinos: ");
        listaMasculina.forEach(pessoa -> System.out.println(pessoa.getNome()));

        //outra maneira de mostrar a lista
        System.out.println("Candidatos Femininos: "+ listaFeminina);
    }

}
