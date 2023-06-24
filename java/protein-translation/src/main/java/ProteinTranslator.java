import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class ProteinTranslator {

	List<String> translate(String rnaSequence) {
		return IntStream.range(0, rnaSequence.length() / 3)
				.map(n -> n * 3)
				.mapToObj(x -> rnaSequence.substring(x, x + 3))
				.map(ProteinTranslator::codonToProtein)
				.collect(Collectors.toList());
	}

	private static String codonToProtein(String codon) {
		return switch (codon) {
		case "AUG" -> "Methionine";
		case "UUU", "UUC" -> "Phenylalanine";
		case "UUA", "UUG" -> "Leucine";
		case "UCU", "UCC", "UCA", "UCG" -> "Serine";
		case "UAU", "UAC" -> "Tyrosine";
		case "UGU", "UGC" -> "Cysteine";
		case "UGG" -> "Tryptophan";
		case "UAA", "UAG", "UGA" -> "STOP";
		default -> throw new IllegalArgumentException("Unexpected value: " + codon);
		};
	}
}
