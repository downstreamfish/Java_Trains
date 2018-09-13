import static com.Han.Util.Print.*;

class Art{
	Art(){ println("Art constructor"); }
		
}

class Drowing extends Art{
	Drowing(){ println("Drowing constructor");}
}

public class Cartoon extends Drowing{
	public Cartoon() { println("Cartoon constructor");}
	
	public static void main(String[] args){
		Cartoon x = new Cartoon();
	}
}