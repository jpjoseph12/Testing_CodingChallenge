import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //making an array for the numbers to be stored in and specifying 10 slots for the array
        int[] a = new int[10];
        //integrating the randomizer and importing the function and assigning it to the object
        Random random=new Random();
        //for loop random number up to number 100 if the array matches it will print 0 then iterate the println
        for (int i = 0; i<a.length; i++){
            a[i]=random.nextInt(101);
            for (int j =0; j < i; j++){
                if(a[i]==a[j]){
                    a[i] = 30;
                    break;
                }

        }for (i = 0; i < a.length; i++){
                System.out.println(a[i]);
            }
    }
    }
}