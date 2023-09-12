package CalculadorDeFrete;

public class PorDimensoes implements TipoDeEnvio{
    @Override
    public double calcular(Produto produto) {
        return produto.getAltura() * produto.getLargura();
    }
}
