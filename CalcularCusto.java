package CalculadorDeFrete;

public class CalcularCusto{
    public double calcular(TipoDeEnvio tipo, Produto produto){
        return tipo.calcular(produto);
    }
}
