public class Library {

    //Array für alle vorhandenen Bücherobjekte
    private Book[] Bookshelf;
    // Zähler für Anzahl der vorhandenen Bücher
    private int counter = 0;

    //Konstruktor für Büchereiobjekt
    public Library(){
        Bookshelf = new Book[10];
        System.out.println("Hello, I am a library, which can store up to 10 books!");
    }

    //Methode zum Hinzufügen von Büchern
    public void add(Book book) {
        if (counter <= 9){
            Bookshelf[counter] = book;
            counter++;
            System.out.println("I added the book " + book + "!");
        }
        else {
            System.out.println("The library is full!");
        }
    }

    //Methode zum Suchen von Büchern
    Book search(String title){
        Book found = null;
        //for Schleife geht alle Einträge durch und vergleicht sie mit eingegebenen Titel, geht auch mit i < counter
        for (int i = 0; i< counter; i++){
            if (title.equals(Bookshelf[i].toString())){
                found = Bookshelf[i];
                System.out.println("The book with the title " + title + " exists in the library!");
                break;
            }
        }
        if (found == null){
            System.out.println("The book with the title " + title + " does not exist in the library!");
        }
        return found;
    }

    //Methode zum ausleihen von Büchern
    Book loan(String title){
       Book book = search(title);

       if (book == null) {
           return null;
       }

       if("available".equals(book.getState())){
           return book.loan();
       }
       System.out.println("Book " + book + " not available.");
       return null;
    }
}
