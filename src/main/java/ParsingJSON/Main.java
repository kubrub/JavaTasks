package ParsingJSON;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Root;

public class Main {
    public static void main(String[] args){
        GSONparser parser = new GSONparser();
        Root root = parser.getRoot();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String settings = gson.toJson(root);
        System.out.println(settings);
    }

}
