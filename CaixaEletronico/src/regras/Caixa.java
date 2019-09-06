package regras;

public class Caixa {

    public float qtdDinheiro;
    int nmSaques;
    int nmDepositos;

    public void sacar(float valor) {        
        if (valor > qtdDinheiro) {
            System.out.println("saldo insuficiente");
        } else {
            qtdDinheiro -= valor;
            nmSaques += 1;
            System.out.println("voce sacou " + valor + " R$, o saldo restante é: " + qtdDinheiro);

        }
    }

    public void depositar(float valor) {
        qtdDinheiro += valor;
        nmDepositos += 1;
        System.out.println("voce depositou " + valor + " R$, o salto total é: " + qtdDinheiro);
    }
}
