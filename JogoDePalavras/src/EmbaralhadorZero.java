import java.util.ArrayList;
import java.util.Collections;

public class EmbaralhadorZero implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {

		ArrayList<String> lista = new ArrayList<String>();
	    Collections.shuffle(lista);
	    StringBuilder t = new StringBuilder(palavra.length());
	    for (String k : lista) {
	        t.append(k);
	    }
	    return t.toString();
	}

}
