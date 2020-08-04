package pl.rkulig.library.io.file;

import pl.rkulig.library.model.Library;

public interface FileManager {
    Library importData();
    void exportData(Library library);
}