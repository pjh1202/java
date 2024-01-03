package HomeWordEx1;

import java.util.ArrayList;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;

//단어, 뜻, 품사
@Data
public class Vocabulary {
	
	String word, partOfSpeach;
	ArrayList<String> mean = new ArrayList<String>();
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vocabulary other = (Vocabulary) obj;
		return Objects.equals(word, other.word);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(word);
	}

	public Vocabulary(String word, String partOfSpeach, ArrayList<String> mean) {
		this.word = word;
		this.partOfSpeach = partOfSpeach;
		this.mean = mean;
	}
	
	public Vocabulary(String word) {
		this.word = word;
	}
}
