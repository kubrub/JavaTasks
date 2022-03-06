package ParsingJSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Root;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class GSONparser {
    private Root root;
    private Gson gson;

    public GSONparser(){
        gson = new GsonBuilder().create();
        FileReader reader = null;
        try {
            reader = new FileReader("settings.json");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        root = gson.fromJson(reader, Root.class);
    }


    public Root getRoot(){
        return root;
    }
}
