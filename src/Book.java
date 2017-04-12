public class Book {

    private String title;
    private String state;

    //Konstuktor für Buch
    public Book(String title){
        this.title = title;
        state = "available";
        System.out.println("Book " + title + " created.");
    }

    //Überschreibt toString() für Ausgabe des Buchtitels
    public String toString() {
        return title;
    }

    Book loan(){
        state = "lent";
        return this;
    }

    Book bringBack(){
        state = "available";
        return this;
    }

    String getState(){
        return state;
    }

}
