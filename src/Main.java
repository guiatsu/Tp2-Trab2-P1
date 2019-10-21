import java.util.ArrayList;

public class Main {
    public static void main(String[] argc){
        ArrayList<String[]> aux = new ArrayList();
        aux.add(argc);
        The_One Escanor = new The_One(aux);
        Escanor.bind(Read_File::read_file)
        .bind(Normalize::normalize)
        .bind(Parser::parse)
        .bind(StopWords::stop_words)
        .bind(WordFreq::word_freq)
        .bind(SortFreq::sort_freq)
        .print_me();
    }
}
