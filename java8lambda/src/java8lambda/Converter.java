package java8lambda;

public interface Converter<T,R>{
	
	public R convert(T value);

}
