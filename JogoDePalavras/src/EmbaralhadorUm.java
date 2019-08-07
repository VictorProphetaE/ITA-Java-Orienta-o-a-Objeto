import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class EmbaralhadorUm implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {

		 ArrayList<Character> letters = (ArrayList<Character>) palavra.chars().boxed().map(c -> (char) c.intValue()).collect(Collectors.toList());
		 Collections.shuffle(letters);
		 StringBuilder t = new StringBuilder(palavra.length());
		 letters.forEach(t::append);
		 return t.toString();
		
	}

}
