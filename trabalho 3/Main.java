public class Main {

    static class Conta {
        private String numero;
        private String titular;
        private double saldo;

        public Conta(String numero, String titular) {
            this.numero = numero;
            this.titular = titular;
            this.saldo = 0;
        }

        public String getNumero() { return numero; }
        public String getTitular() { return titular; }
        public double getSaldo() { return saldo; }
        public void setTitular(String titular) { this.titular = titular; }

        public void depositar(double valor) {
            saldo += valor;
        }

        public void sacar(double valor) {
            if (valor <= saldo) {
                saldo -= valor;
            }
        }

        public void transferir(Conta destino, double valor) {
            if (valor <= saldo) {
                saldo -= valor;
                destino.depositar(valor);
            }
        }

        public void exibir() {
            System.out.println("Conta " + numero + " | Titular: " + titular + " | Saldo: " + saldo);
        }
    }

    static class ContaCorrente extends Conta {
        public ContaCorrente(String numero, String titular) {
            super(numero, titular);
        }

        @Override
        public void sacar(double valor) {
            double total = valor + 2;
            if (total <= getSaldo()) {
                super.sacar(valor + 2);
            }
        }

        public void mensalidade(double valor) {
            super.sacar(valor);
        }
    }

    static class ContaPoupanca extends Conta {
        public ContaPoupanca(String numero, String titular) {
            super(numero, titular);
        }

        @Override
        public void sacar(double valor) {
            if (getSaldo() - valor >= 50) {
                super.sacar(valor);
            }
        }

        public void juros(double porcentagem) {
            double ganho = getSaldo() * (porcentagem / 100);
            depositar(ganho);
        }
    }

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("001", "Magnum");
        ContaPoupanca cp = new ContaPoupanca("002", "Johanson");

        cc.depositar(500);
        cp.depositar(300);

        cc.sacar(100);
        cp.sacar(200);

        cc.mensalidade(20);
        cp.juros(2);

        cc.transferir(cp, 50);

        cc.exibir();
        cp.exibir();
    }
}
