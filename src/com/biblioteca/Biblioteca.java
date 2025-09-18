package com.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private   List<Livro> livrosList;//Cria lista de livros
    private List<Membro>membroList;//cria lista de menbros.

public Biblioteca(){
    this.livrosList = new ArrayList<>();
    this.membroList = new ArrayList<>();

    }

    public void adicionarLivro(Livro livro) {
        livrosList.add(livro);
    }
    public void adicionarMembros(Membro membro){
        membroList.add(membro);
    }
    public void listarTodosOsLivros(){
        System.out.println("---Livros na Biblioteca ---");
        for (Livro livro : livrosList){ //Cria um laco que percorre toda a lista de livros
            System.out.println("Titulo: "+ livro.getTitulo());//recebe o titulo do livro
            System.out.println("Autor: "+ livro.getAutor());// recebe o autor do livro
            System.out.println("----------------");
        }

    }
    public void listarMembros(){
        System.out.println("---- Membros da Biblioteca ----");
        for (Membro membro : membroList){
            System.out.println("Nome: "+ membro.getNome());
            System.out.println("Id: "+ membro.getIdMembro());
        }
    }
    public void emprestarLivro(){

    }
}
