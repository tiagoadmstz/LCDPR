/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.lcdpr.enumerated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Tipo de Lançamento;
 * 1 - Receita da Atividade Rural
 * 2 - Despesas de custeio e investimentos
 * 3 - Receita de produtos entregues no ano referente a adiantamento de recursos financeiros
 *
 * @author Tiago
 */
public enum TIPO_LANCAMENTO {

    RECEITA_ATIVIDADE_RURAL(1),
    DESPESAS_CUSTEIO_INVESTIMENTOS(2),
    RECEITA_PRODUTOS_ENTREGUES(3);

    private final int valor;

    TIPO_LANCAMENTO(int valor) {
        this.valor = valor;
    }

    @JsonValue
    public int getValor() {
        return valor;
    }

    @JsonCreator
    public static TIPO_LANCAMENTO getEnum(int valor) {
        switch (valor) {
            default:
            case 1:
                return RECEITA_ATIVIDADE_RURAL;
            case 2:
                return DESPESAS_CUSTEIO_INVESTIMENTOS;
            case 3:
                return RECEITA_PRODUTOS_ENTREGUES;
        }
    }

    public static TIPO_LANCAMENTO getEnum(String valor) {
        if (valor != null) {
            return getEnum(Integer.parseInt(valor));
        }
        return RECEITA_ATIVIDADE_RURAL;
    }

    public static String getDescription(int valor) {
        switch (valor) {
            default:
            case 1:
                return "Receita de Atividade Rural";
            case 2:
                return "Despesas de Custeio de Investimentos";
            case 3:
                return "Receita de Produtos Entregues";
        }
    }

}
