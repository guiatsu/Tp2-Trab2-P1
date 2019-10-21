import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortFreq {
    public static ArrayList<String[]> sort_freq(ArrayList<String[]> value){

        Collections.sort(value, new Comparator<String[]>() {

            public int compare(String[] val1, String[] val2) {
                return Integer.compare(Integer.parseInt(val2[1]), Integer.parseInt(val1[1]));
            }

        });

        return value;
    }
}
