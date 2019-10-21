import java.util.ArrayList;

public class WordFreq {
    public static ArrayList<String[]> word_freq(ArrayList<String[]> value){
        ArrayList<String> aux = new ArrayList();
        ArrayList<String> aux_val = new ArrayList();
        for (int i = 0 ; i < value.size();i++) {
            for (int j = 0; j < value.get(i).length; j++) {
                if(!(aux.contains(value.get(i)[j]))){
                    aux.add(value.get(i)[j]);
                    aux_val.add("1");
                }
                else{
                    int index = aux.indexOf(value.get(i)[j]);

                    aux_val.set(index, Integer.toString(Integer.parseInt(aux_val.get(index))+1));
                }
            }
        }
        ArrayList<String[]> out = new ArrayList();
        int j = 0;
        for (int i = 0; i < aux.size(); i++) {
            String[] arr_aux = new String[2];
            arr_aux[0] = aux.get(i);
            arr_aux[1] = aux_val.get(i);
            if(!arr_aux[0].isEmpty())
                out.add(arr_aux);
        }
        return out;
    }
}
