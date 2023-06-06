package model;

public class Turma {
    private int id;
    private String apelido;
    private int capacidade;
    private int ucs_iducs;

    
    
    public Turma(int id, String apelido, int capacidade, int ucs_iducs) {
        this.id = id;
        this.apelido = apelido;
        this.capacidade = capacidade;
        this.ucs_iducs = ucs_iducs;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public int getUcs_iducs() {
        return ucs_iducs;
    }
    public void setUcs_iducs(int ucs_iducs) {
        this.ucs_iducs = ucs_iducs;
    }

    
    
}
