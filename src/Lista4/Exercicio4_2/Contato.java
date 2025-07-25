package Lista4.Exercicio4_2;

public class Contato {
        private final String nome;
        private final String telefone;
        private final String email;

        public Contato(String nome, String telefone, String email) {
            this.nome = nome;
            this.telefone = telefone;
            this.email = email;
        }

        public String getNome() {
            return nome;
        }

        public String getTelefone() {
            return telefone;
        }

        public String getEmail() {
            return email;
        }

        @Override
        public String toString() {
            return "Nome: " + nome +
                    ", Telefone: " + telefone +
                    ", Email: " + email;
        }
    }


