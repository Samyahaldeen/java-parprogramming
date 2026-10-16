package se.iths.samyah.programming;

public class Main {

    static void main() {
        IO.println("Hello world");

String libraryName = "Stockholms University library";
int bookCount = 12;
boolean isOpen = true;
        IO.println(libraryName);
        IO.println(bookCount);
        IO.println(isOpen);

        int borrowedBookCount = 12;
        int availableBookCount = bookCount - borrowedBookCount;
        IO.println(availableBookCount);

        String firstName = "Jane";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        IO.println("Välkommen till " + libraryName + ", " + fullName + "!");

        if (isOpen){
            IO.println("Välkommen In");
        }else{
            IO.println("Tyvärr är biblioteket stängt just nu.");
        }

        if(availableBookCount == 0) {
            IO.println("Inga böcker kvar att låna, tyvärr. ");
        } else if (availableBookCount <=3){
            IO.println("Nästan slut på böcker. Skynda dig.");
        } else{
            IO.println("Det finns många böcker kvar.");
        }
    }
}