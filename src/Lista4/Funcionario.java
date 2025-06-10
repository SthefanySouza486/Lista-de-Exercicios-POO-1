package Lista4;

public class Funcionario {
        private final String nome;
        private final int id;
        private final double salario;
        private final String departamento;

        public Funcionario(String nome, int id, double salario, String departamento) {
            this.nome = nome;
            this.id = id;
            this.salario = salario;
            this.departamento = departamento;
        }

        public String getDepartamento() {
            return departamento;
        }

        public double getSalario() {
            return salario;
        }

        @Override
        public String toString() {
            return "ID: " + id +
                    ", Nome: " + nome +
                    ", Salário: R$" + salario +
                    ", Departamento: " + departamento;
        }
    }

