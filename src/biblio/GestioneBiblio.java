package biblio;

import java.util.List;

public class GestioneBiblio {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca(3);

        biblioteca.addLibro("1984", "George Orwell", 0, "SC5", 3);
        biblioteca.addLibro("Orgoglio e pregiudizio", "Jane Austen", 1, "SC12", 5);
        biblioteca.addLibro("Il grande Gatsby", "F. Scott Fitzgerald", 2, "SC18", 2);
        biblioteca.addLibro("Il buio oltre la siepe", "Harper Lee", 1, "SC7", 4);
        biblioteca.addLibro("Harry Potter e la pietra filosofale", "J.K. Rowling", 0, "SC14", 1);
        biblioteca.addLibro("Cent'anni di solitudine", "Gabriel García Márquez", 2, "SC9", 5);
        biblioteca.addLibro("Il Signore degli Anelli", "J.R.R. Tolkien", 0, "SC6", 3);
        biblioteca.addLibro("Assassinio sull'Orient Express", "Agatha Christie", 1, "SC22", 2);
        biblioteca.addLibro("Il lupo della steppa", "Hermann Hesse", 2, "SC18", 5);
        biblioteca.addLibro("Il vecchio e il mare", "Ernest Hemingway", 0, "SC29", 1);
        biblioteca.addLibro("Anna Karenina", "Leo Tolstoj", 1, "SC8", 4);
        biblioteca.addLibro("Frankenstein", "Mary Shelley", 2, "SC11", 5);
        biblioteca.addLibro("Delitto e castigo", "Fyodor Dostoevsky", 0, "SC15", 3);
        biblioteca.addLibro("Jane Eyre", "Charlotte Brontë", 1, "SC26", 5);
        biblioteca.addLibro("Le avventure di Tom Sawyer", "Mark Twain", 2, "SC2", 2);
        biblioteca.addLibro("Il Trono di Spade", "George R.R. Martin", 0, "SC25", 5);
        biblioteca.addLibro("I Miserabili", "Victor Hugo", 1, "SC17", 3);
        biblioteca.addLibro("Il mondo nuovo", "Aldous Huxley", 2, "SC4", 4);
        biblioteca.addLibro("Fahrenheit 451", "Ray Bradbury", 0, "SC20", 2);
        biblioteca.addLibro("Sherlock Holmes", "Arthur Conan Doyle", 1, "SC13", 1);




        Libro libroTrovato = biblioteca.cerca("Aldous Huxley", "Il mondo nuovo");
        System.out.println(libroTrovato);
        System.out.println(biblioteca.getLibri(2, "SC2"));
    }
}
