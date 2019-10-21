import java.util.ArrayList;

public class Parser {
    public static ArrayList<String[]> parse(ArrayList<String[]> value){
        ArrayList<String[]> aux = (ArrayList<String[]>) value.clone();
        value.set(0, aux.get(0)[0].split(" "));
        for(int i = 1; i < aux.get(0).length ; i++){
            value.add(aux.get(0)[i].split(" "));
        }
        return value;
    }
}
