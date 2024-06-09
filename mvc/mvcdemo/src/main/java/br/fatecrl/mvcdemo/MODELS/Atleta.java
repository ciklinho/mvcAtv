package br.fatecrl.mvcdemo.MODELS;

public class Atleta {
    private String esporte;
    private String nome;
    private float s1;
    private float s2;

    public Atleta(String esporte, String nome, float s1, float s2) {
        this.esporte = esporte;
        this.nome = nome;
        this.s1 = s1;
        this.s2 = s2;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getS1() {
        return s1;
    }

    public void setS1(float s1) {
        this.s1 = s1;
    }

    public float getS2() {
        return s2;
    }

    public void setS2(float s2) {
        this.s2 = s2;
    }
}
