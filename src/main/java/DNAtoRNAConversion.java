public class DNAtoRNAConversion {
    public static String dnaToRna(String dna) {
        String res = "";
        for (int i = 0; i < dna.length(); i++) {
            char c = dna.charAt(i);
            if (c == 'T') {
                res += "U";
            }
            else if (c == 'U'){
                res += "T";
            }
            else {
                res += c;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(dnaToRna("GCAU"));
    }
}
