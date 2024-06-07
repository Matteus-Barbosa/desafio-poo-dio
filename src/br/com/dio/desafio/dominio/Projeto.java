package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Objects;

public class Projeto extends Conteudo {
    private LocalDate dataEntrega;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 30d;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dataEntrega=" + dataEntrega +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Projeto projeto = (Projeto) o;
        return Objects.equals(dataEntrega, projeto.dataEntrega);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataEntrega);
    }
}
