import java.util.ArrayList;

public class Normalize {
    public static ArrayList<String[]> normalize(ArrayList<String[]> value){
        for (int i = 0 ; i < value.size(); i++) {
            for (int j = 0; j < value.get(i).length; j++) {
                value.get(i)[j] = value.get(i)[j].toLowerCase().replaceAll("[^a-zA-Z -]", "");

            }
        }
        return value;
    }
}
