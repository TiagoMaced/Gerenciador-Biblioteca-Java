package com.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Membro {
    private  String nome;
    private  String idMembro;
    private List<Livro> livrosEmprestados;

public Membro(String nome, String idMembro){
    this.nome = nome;
    this.idMembro = idMembro;
    this.livrosEmprestados = new ArrayList<>();

    }
    // adiciona um livro emprestado
    public void addLivroEmprestado(Livro livro){
        this.livrosEmprestados.add(livro);
    }
    // remove um livro emprestado
    public void removeLivroEmprestado(Livro livro){
        this.livrosEmprestados.remove(livro);
    }
}
