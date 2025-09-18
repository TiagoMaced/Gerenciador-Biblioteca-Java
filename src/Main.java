import com.biblioteca.Biblioteca;
import com.biblioteca.Livro;
import com.biblioteca.Membro;

public class Main {
    public static void main(String[] args) {

        Biblioteca minhaBiblioteca = new Biblioteca();

        Livro livro1 = new Livro("Prevençao e tratamento de feridas","Sanar saude","1234567891234");
        Livro livro2 = new Livro("O codificador Limpo","Robert c.Martin","9876543219874");
        Livro livro3 = new Livro("Domain-Driven Design","Eric Evans","4561239876542");

        minhaBiblioteca.adicionarLivro(livro1);
        minhaBiblioteca.adicionarLivro(livro2);
        minhaBiblioteca.adicionarLivro(livro3);

        minhaBiblioteca.listarTodosOsLivros();

        Membro membro1 = new Membro("Tiago","001");
        Membro membro2 = new Membro("Felipe","002");
        Membro membro3 = new Membro("André","003");
        Membro membro4 = new Membro("Perreps","004");

        minhaBiblioteca.adicionarMembros(membro1);
        minhaBiblioteca.adicionarMembros(membro2);
        minhaBiblioteca.adicionarMembros(membro3);
        minhaBiblioteca.adicionarMembros(membro4);

        minhaBiblioteca.listarMembros();

        }
}
