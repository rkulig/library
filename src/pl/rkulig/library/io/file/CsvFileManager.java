package pl.rkulig.library.io.file;

import pl.rkulig.library.exception.DataExportException;
import pl.rkulig.library.model.Library;
import pl.rkulig.library.model.Publication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CsvFileManager implements FileManager {
    private static final String FILE_NAME = "Library.csv";

    @Override
    public void exportData(Library library) {
        Publication[] publications = library.getPublications();
        try (FileWriter fileWriter = new FileWriter(FILE_NAME);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (Publication publication : publications) {
                bufferedWriter.write(publication.toCsv());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new DataExportException("Błąd zapisu danych do pliku " + FILE_NAME);
        }
    }

    @Override
    public Library importData() {
        return null;
    }

}