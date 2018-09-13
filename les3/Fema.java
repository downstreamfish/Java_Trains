
/**
 * this program check fema.
 */
public class Fema
{
	public static void checkFermat(int a, int b, int c, int n){
        if(n >= 2){
			if((Math.pow(a, n) + Math.pow(b, n)) == Math.pow(c, n)){
				System.out.println("Holy smokes, Fermat was wrong!");
			}else{
				System.out.println("No, that doesn't work!");
			}
		}
	}
	public static void main(String[] args){
		checkFermat(3, 4, 5, 2);
		checkFermat(1, 2, 3, 3);
	}

}
