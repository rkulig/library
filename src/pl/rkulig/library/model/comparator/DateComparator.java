package pl.rkulig.library.model.comparator;

import pl.rkulig.library.model.Publication;

import java.time.Year;
import java.util.Comparator;

public class DateComparator implements Comparator<Publication> {
    @Override
    public int compare(Publication p1, Publication p2) {
        if (p1 == null && p2 == null) {
            return 0;
        }
        if (p1 == null) {
            return 1;
        }
        if (p2 == null) {
            return -1;
        }
        Year i1 = p1.getYear();
        Year i2 = p2.getYear();
        return -i1.compareTo(i2);
    }
}