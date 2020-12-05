package pt.ipg.seminarios;

public class Orador {
    private int id;
    private String nome;

    public Orador(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Orador(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
