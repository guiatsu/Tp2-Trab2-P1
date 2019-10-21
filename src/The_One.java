import java.util.ArrayList;
import java.util.Arrays;

public class The_One {
    ArrayList<String[]> value = new ArrayList();
    public The_One(ArrayList<String[]> value) {
        this.value = value;
    }

    public The_One bind(Teste func){
        this.value = func.teste(this.value);
        return this;
    }
    public void print_me(){
        for (int i = 0; i < value.size(); i++){
            for(int j = 0; j < value.get(i).length; j++){
                System.out.print(value.get(i)[j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
