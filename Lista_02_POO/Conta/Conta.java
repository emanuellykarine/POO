public class Conta {
        private String nome;
        private int numeroConta;
        private double saldo;

        public Conta(){
            nome = "";
            numeroConta = 0;
            saldo = 0;
        }

        public void getNome(String n){
            if (n.equals("")) throw new IllegalArgumentException("Nome nao pode ser vazio.");
            else nome = n;
        }

        public void getNumero(int numero){
            if (numero > 0) numeroConta = numero;
            else throw new IllegalArgumentException("numero de conta nao pode ser negativo");
        }

        public void getSaldo(double s){
            if (s > 0) saldo = s;
            else throw new IllegalArgumentException("o saldo nao pode ser negativo");
        }

        public double deposito(double valor){
            return saldo + valor;
        }

        public double saque(double valor){
            if (valor > saldo){
                throw new IllegalArgumentException("O valor ultrapassa saldo da conta.");
            } else {
                return saldo - valor;
            }
            
        }
}
