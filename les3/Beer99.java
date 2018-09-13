public class Beer99
{
    public static void main(String [] args){
        BottlesOfBeer(3);
    }

    public static void BottlesOfBeer(int number){
        if(number == 0){
            System.out.printf("No bottles of beer on the wall,\n" + 
                                "no bottles os beer,\n" + 
                                "ya' can't take one down, ya' can't pass it around,\n" +
                                "cause there are no more bottles of beer on the wall!");
        }else{
            System.out.printf("%d bottles of beer on the wall,\n%d bottles of beer,\nya' take one downm, ya' pass it around,\n%d bottles of beer on the wall.\n", number, number, number - 1);
            BottlesOfBeer(number - 1);
        }
    }
}