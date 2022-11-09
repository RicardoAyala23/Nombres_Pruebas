package principal;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("juan");
        listaNombres.add("pedro");
        listaNombres.add("jose");
        listaNombres.add("maria");
        listaNombres.add("sofia");

        for (int i = 0; i < listaNombres.size(); i++) {
            System.out.println(listaNombres.get(i).toUpperCase().charAt(0)
                    + listaNombres.get(i).substring(1, listaNombres.get(i).length()));
        }
    //mi token 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
    //segundo cambio 
    }
}
