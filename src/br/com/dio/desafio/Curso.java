package br.com.dio.desafio;

public class Curso {
    private String titulo;
    private int cargaHoraria;
    private String descricao;

    public Curso() {

    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso {" + '\n' +
                "    Título= " + this.titulo + ",\n" +
                "    Descrição= " + this.descricao + ",\n" +
                "    Carga horaria= " + this.cargaHoraria + ",\n" +
                '}';
    }
}
