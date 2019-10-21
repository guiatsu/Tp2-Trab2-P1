import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class StopWords {
    public static ArrayList<String[]> stop_words(ArrayList<String[]> value){
        try {
            ArrayList<String[]> aux = new ArrayList();
            aux.add(Files.readString(Paths.get("StopWord2.txt")).split("\n"));
            for (int i = 0; i < value.size(); i++){
                ArrayList<String> aux_arr = new ArrayList(Arrays.asList(value.get(i)));
                ArrayList<String> verif = new ArrayList(Arrays.asList(aux.get(0)));
                for(int j = 0; j < value.get(i).length; j++) {
                    for (int k = 0; k < value.get(i).length; k++) {
                        if (verif.contains(value.get(i)[k]+"\r")) {
                            aux_arr.remove(k);
                            String[] out = new String[aux_arr.size()];
                            out = aux_arr.toArray(out);
                            if(out == null || aux_arr.isEmpty()){
                                value.remove(i);
                            }
                            else {
                                value.set(i, out);
                            }
                        }

                    }
                }
            }
            return value;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }
}
