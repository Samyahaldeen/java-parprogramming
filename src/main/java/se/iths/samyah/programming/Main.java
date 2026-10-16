package se.iths.samyah.programming;

public class Main {

    static void main() {
        IO.println("Hello world");

String libraryName = "Stockholms University library";
int bookCount = 12;
boolean isOpen = false;
        IO.println(libraryName);
        IO.println(bookCount);
        IO.println(isOpen);

        int borrowedBookCount = 8;
        int availableBookCount = bookCount - borrowedBookCount;
        IO.println(availableBookCount);

        String firstName = "Jane";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        IO.println("Välkommen till " + libraryName + ", " + fullName + "!");

        if (isOpen){
            IO.println("Välkommen In");
        }else{
            IO.println("Tyvärr är bibiolteket stängt nu");
        }

    }
}