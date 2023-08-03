package Aula_0308;

import java.time.LocalDate;

public class Cliente {

//      get (obter) e set (inserir) ENCAPSULAMENTO
        private String nome;
        private Integer idade;
        private Double altura;
        private String cpf;
        private String email;
        private LocalDate dataNascimento;

        // Construtor -> Método Especial (ele TEM que ser público, para ser acessado por outras classes.)
        // this -> Palavra Chave -> que é um Objeto
        public Cliente(String nome, Integer idade, Double altura) {
            cpf = "000.000.000-00";
            this.nome = nome;
            //setNome(nome);
            this.idade = idade;
            //setIdade(idade);
            this.altura = altura;
            //setAltura(altura);


            /*  Outra maneira de fazer:
            setNome(nome);
            setIdade(idade);
            setAltura(altura);*/
        }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean validarCpf() {
                return cpf.contains(".");
        }

        public static boolean validarEmail(String email) {
                 return email.contains("@");
        }

}
