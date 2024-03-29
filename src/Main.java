import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas.toString());

        System.out.println("posição da nota 5.0: "+ notas.indexOf(5.0));

        notas.add(4, 8.0);
        System.out.println(notas.toString());

        notas.set(notas.indexOf(5.0),6.0);
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5 está na lista: "+ notas.contains(5.0));

       /* for (double nota: notas)
            System.out.println(nota);*/

        System.out.println("exiba a terceira nota adicionada: "+notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exibir a menor nota: "+ Collections.min(notas));

        System.out.println("Exibir a maior nota: "+ Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exibir a soma das notas: "+ soma);

        System.out.println("Exiba a média das notas: "+ (soma/notas.size()));

        System.out.println("remova a nota 0: "+ notas.remove(0d));
        System.out.println(notas.toString());

        System.out.println("remova a nota do indice 0: "+ notas.remove(0));
        System.out.println(notas.toString());

        System.out.println("remova todas as notas menores que 7 da lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas.toString());

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("A lista está vazia? "+ notas.isEmpty());


    }
}