package br.com.dio.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;
    
    public Mentoria () {}
     
    @Override
    public double calcularXp() {
        return XP_PADRAO +20d;
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\n        Mentoria {" + '\n' +
        "            Título= " + getTitulo() + ",\n" +
        "            Descrição= " + getDescricao() + ",\n" +
        "            Data= " + this.data + ",\n" +
        "        }";
    }
    
}
