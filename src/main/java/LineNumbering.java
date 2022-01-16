import java.util.ArrayList;
import java.util.List;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        List<String> result = new ArrayList<String>();
        for ( int i=1; i<lines.size()+1; i++ ) {
            result.add( String.valueOf(i)+": "+lines.get(i-1) );
        }
        return  result;
    }
}
