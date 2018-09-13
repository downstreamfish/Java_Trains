import java.util.*;

class Apple{
	private static long counter;
	private final long id = counter++;
	public long id(){
		return id;
	}
}

class Orange{}

public class ApplesAndOrangeWithoutGernerics{
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		ArrayList apples = new ArrayList();
		for(int i = 0; i < apples.size(); i++){
			apples.add(new Apple());
			apples.add(new Orange());
		}
		
		for(int i = 0; i < apples.size(); i ++){
			((Apple)apples.get(i)).id();
		}
	}

}
