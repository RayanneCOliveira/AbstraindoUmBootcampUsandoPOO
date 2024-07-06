package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    private int cargaHoraria;

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso {" +
                "título = '" + getTitulo() + '\'' +
                ", descrição = '" + getDescricao() + '\'' +
                ", carga horária = " + cargaHoraria +
                '}';
    }
}
