package pl.rkulig.library.io;

import pl.rkulig.library.model.Book;
import pl.rkulig.library.model.LibraryUser;
import pl.rkulig.library.model.Magazine;
import pl.rkulig.library.model.Publication;

import java.util.Collection;

public class ConsolePrinter {
    //zmiana typu parametru
    public void printBooks(Collection<Publication> publications) {
        int counter = 0;
        for (Publication publication : publications) {
            if(publication instanceof Book) {
                printLine(publication.toString());
                counter++;
            }
        }
        if (counter == 0)
            printLine("Brak książek w bibliotece");
    }

    //zmiana typu parametru
    public void printMagazines(Collection<Publication> publications) {
        int counter = 0;
        for (Publication publication : publications) {
            if(publication instanceof Magazine) {
                printLine(publication.toString());
                counter++;
            }
        }
        if (counter == 0)
            printLine("Brak magazynów w bibliotece");
    }
    //dodana metoda
    public void printUsers(Collection<LibraryUser> users) {
        for (LibraryUser user : users) {
            printLine(user.toString());
        }
    }

    public void printLine(String text) {
        System.out.println(text);
    }
}