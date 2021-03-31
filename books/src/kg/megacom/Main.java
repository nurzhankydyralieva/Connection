package kg.megacom;


public class Main {

    public static void main(String[] args) {
        Books book = new Books();
        book.insertBook("Jeck Vorobeu");
        book.insertBook("Belyii porohod");
        book.insertBook("Kogda padaut gory");
        Authors author = new Authors();
        author.insert("Markiss", 1);
        author.insert("Aitmatov",2);
        author.insert("Aitmatov",3);


    }
}
