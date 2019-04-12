package br.com.edu.ifg.projetoPOO.cadastro;

public class Funcionario extends Pessoa{

    private String setor;

    public Funcionario(String setor) {
        this.setor = setor;
    }
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

}
