package CalculadorDeFrete;

public class PorPeso implements TipoDeEnvio{
    @Override
    public double calcular(Produto produto) {
        return produto.getPeso() * 2;
    }
}
