import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Read_File {
    public static ArrayList<String[]> read_file(ArrayList<String[]> path) {
        try {
            ArrayList<String[]> aux = new ArrayList();
            aux.add(Files.readString(Paths.get(path.get(0)[0])).split("\n"));
            return aux;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }
}
