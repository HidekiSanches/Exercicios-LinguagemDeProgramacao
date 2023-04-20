package com.sptech.projeto.lista.desafio;

import java.util.ArrayList;
import java.util.List;

public class ListaUtil {

    private List<Integer> inteiros;

    public ListaUtil() {
        inteiros = new ArrayList();
    }

    public Integer count() {
        return inteiros.size();
    }

    public void add(Integer valor) {
        if (valor != null) {
            inteiros.add(valor);
        }
    }

    public void remove(Integer valor) {
        if (valor != null) {
            inteiros.remove(valor);
        }
    }

    public Integer countPares() {
        int axCont = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.get(i) % 2 == 0) {
                axCont++;
            }
        }
        return axCont;
    }

    public Integer countImpares() {
        int axCont = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.get(i) % 2 == 1) {
                axCont++;
            }
        }
        return axCont;
    }

    public Integer somar() {
        Integer numero = 0;
        for (Integer num : inteiros) {
            numero += num;
        }
        return numero;
    }

    public Integer getMaior() {
        Integer maior = null;
        if (inteiros.isEmpty()) {
            return 0;
        } else {
            for (Integer num : inteiros) {
                if (maior == null) {
                    maior = num;
                } else if (maior < num) {
                    maior = num;
                }
            }
        }
        return maior;
    }

    public Integer getMenor() {
        Integer menor = null;
        if (inteiros.isEmpty()) {
            return 0;
        } else {
            for (Integer num : inteiros) {
                if (menor == null) {
                    menor = num;
                } else if (menor > num) {
                    menor = num;
                }
            }
        }
        return menor;
    }

    public Boolean hasDuplicidade() {
        Boolean tem = false;
        for (int i = 0; i < inteiros.size(); i++){
            for (int y = i + 1; y < inteiros.size(); y++){
                if (inteiros.get(i).equals(inteiros.get(y))){
                    tem = true;
                }
            }
        }
        return tem;
    }
}
