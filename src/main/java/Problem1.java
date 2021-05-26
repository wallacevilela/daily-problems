import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1 {

    public int[] find_continuous_k(int[] list, int k) {
        List<Integer> ret = new ArrayList<>();

        int soma = 0;
        int incremento = 0;
        int posicaoArray = 0;
        int saltoInicial = 0;
        int salto = 1;
        int quantidadeSaltosIniciais = 1;
        int quantidadeSaltosUsados = 0;
        boolean saltoUsado = false;

        while (soma != k) {
            ret.clear();
            soma = 0;
            quantidadeSaltosUsados = 0;
            saltoUsado = false;
            saltoInicial += salto;

            if (posicaoArray + saltoInicial > list.length) {
                saltoInicial = salto;
                posicaoArray += 1;
            }

            if (posicaoArray == list.length) {
                posicaoArray = 0;
                saltoInicial += salto;
                quantidadeSaltosIniciais += 1;
            }

            incremento = posicaoArray;

            while (soma < k && incremento <= list.length - 1) {
                soma += list[incremento];
                ret.add(list[incremento]);
                if (saltoUsado) {
                    incremento += salto;
                } else {
                    incremento += saltoInicial;
                    quantidadeSaltosUsados += 1;
                    if (quantidadeSaltosUsados == quantidadeSaltosIniciais) {
                        saltoUsado = true;
                    }
                }
            }

            ret.stream().forEach(i -> System.out.print(i + ", "));
            System.out.println("Soma: " + soma);
            System.out.println("----------");
        }
        return ret.stream().mapToInt(Integer::valueOf).toArray();
    }

}