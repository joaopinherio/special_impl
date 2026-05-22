package exercicio;
public class Pessoa {
    private String nome;
    private Nascimento nascimento;

    public Pessoa(String nome, Nascimento nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static class Nascimento{
        public int dia;
        public int mes;
        public int ano;

        public Nascimento(int dia, int mes, int ano){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }

        public int getDia(){
            return this.dia;
        }

        public void setDia(int dia){
            this.dia = dia;
        }

        public int getMes(){
            return this.mes;
        }

        public void setMes(int mes){
            this.mes = mes;
        }
        public int getAno(){
            return this.ano;
        }

        public void setAno(int ano){
            this.ano = ano;
        }
    }

}
