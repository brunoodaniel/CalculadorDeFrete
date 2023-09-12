package CalculadorDeFrete;

public class Main {
    public static void main(String[] args) {
        CalcularCusto calc = new CalcularCusto();
        PorPreco porPreco = new PorPreco();
        PorDimensoes porDimensoes = new PorDimensoes();
        PorPeso porPeso = new PorPeso();
        double valorFrete = 0;

        Produto produto1 = new Produto(20, 10, 10, 10);


        valorFrete = calc.calcular(porPeso, produto1);
        valorFrete = calc.calcular(porDimensoes, produto1);
        valorFrete = calc.calcular(porPreco, produto1);



        System.out.println("O valor do frete é: " + valorFrete + "$");
    }
}
