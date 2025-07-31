package calculadora.controller;

import calculadora.enums.EnumOperacao;

public class CalculadoraController {
    private Double total;
    
    public Double realizarOperacao(EnumOperacao operacao, Double valor){
        if (operacao.equals(EnumOperacao.SOMA)){
            total += valor;
        }else if (operacao.equals(EnumOperacao.SUBTRACAO)){
            total -= valor;
        }else if (operacao.equals(EnumOperacao.DIVISAO)){
            total /= valor;
        }else if (operacao.equals(EnumOperacao.MULTIPLICACAO)){
            total *= valor;
        }
        return total;
    }
    
    public Double getTotal(){
        return this.total;
    }
    
    public void zerar(){
        total = 0.0;
    }
}

    