import com.biblioteca.Biblioteca;
import com.biblioteca.Livro;

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

        }
}
