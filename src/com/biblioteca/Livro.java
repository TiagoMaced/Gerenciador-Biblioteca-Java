package com.biblioteca;

public class Livro {
        private String titulo;
        private String autor;
        private String isbn;
        private boolean disponivel;

public Livro(String titulo, String autor, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel=true ;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}
