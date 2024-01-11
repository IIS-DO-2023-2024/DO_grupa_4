package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestStreams {

	public static void main(String[] args) {
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie("Titanik", 10));
		movies.add(new Movie("Star Wars", 20));
		movies.add(new Movie("The Godfather", 30));
		
		//Imperativno programiranje
		int count = 0;
		for(var movie : movies)
			if(movie.getLikes() > 10)
				count++;
		
		//Deklarativno programiranje
		var count2 = movies.stream();
		count2.filter(movie -> movie.getLikes() > 10)
			  .count();
		
		// ZADATAK 1 ---------------------------------
		int[] numbers = {1, 2, 3};
		Arrays.stream(numbers)
		.forEach(n -> System.out.println("Broj 1.zadatka: " + n));

		// ZADATAK 2 ---------------------------------
		var stream2 = Stream.generate(() -> Math.random());
		stream2.limit(5)
		.forEach(n -> System.out.println("Broj 2.zdataka: " + n));
		
		// ZADATAK 3 ---------------------------------
		System.out.println("--- Ispis naziva filmova: ---");
		movies.stream()
		.map(movie -> movie.getTitle())
		.forEach(name -> System.out.println(name));
		
		// Streams listi
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(111);
		list2.add(222);
		list2.add(333);
		
		System.out.println("--- Ispis listi pomoću strem-a: ---");
		var stream_liste = Stream.of(list1, list2);
		stream_liste.forEach(list -> System.out.println(list));
		
		System.out.println("--- Ispis elemenata svake pomoću strem-a: ---");
		var stream_elemenata = Stream.of(list1, list2);
		stream_elemenata
		.flatMap(element -> element.stream())
		.forEach(element -> System.out.println(element));
		
		// ZADATAK 4 - Filtriranje ---------------------------------
		System.out.println("--- Prvi način: ---");
		movies.stream()
		.filter(m -> m.getLikes() > 10)
		.forEach(m -> System.out.println(m.getTitle()));
		
		System.out.println("--- Drugi način: ---");
		// Izvlačenje filtera van stream-a
		Predicate<Movie> isPopular = m -> m.getLikes() > 20;
		movies.stream()
		.filter(isPopular)
		.forEach(m -> System.out.println(m.getTitle()));
		
		// ZADATAK 5 - Izdvajanje (slicing) elemenata  ---------------------------------
		System.out.println("--- Slicing: ---");
		movies.stream()
		.skip(2)
		.forEach(m -> System.out.println(m.getTitle()));
		
		// ZADATAK 6 - Sortiranje ---------------------------------
		movies.add(new Movie("Home alone", 15));
		movies.add(new Movie("Forrest Gump", 10));
		
		System.out.println("--- Sortiranje po nazivu rastuće: ---");
		movies.stream()
		.sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
		.forEach(m -> System.out.println(m.getTitle()));
		
		System.out.println("--- Sortiranje po nazivu opadajuće: ---");
		movies.stream()
		.sorted(Comparator.comparing(Movie::getTitle).reversed())
		.forEach(m -> System.out.println(m.getTitle()));
		
		// ZADATAK 7 - Jedinstvene vrednosti --------------------------
		System.out.println("--- Prikaz vrednosti obeležja likes: ---");
		movies.stream()
		.map(Movie::getLikes)
		.distinct()
		.forEach(System.out::println);
	}

}
