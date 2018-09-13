public class DisplayBinary
{
    public static void main(String[] args){
        displayBinary(15);
    }

    public static void displayBinary(int value){
        if(value > 0){
            displayBinary(value / 2);
            System.out.print(value % 2);
        }
    }

}