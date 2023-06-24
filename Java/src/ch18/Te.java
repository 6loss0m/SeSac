package ch18;

interface Function<T,R> {
public abstract R apply (T t);
}

public class Te {

	public static void main(String[] args) {
		Function<String, Integer> f1;
		f1 = str->str.length();
		System.out.println(f1.apply("¾È³ç")); //2
	}
}