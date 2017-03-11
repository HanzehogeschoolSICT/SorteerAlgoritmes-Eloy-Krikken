
/**
 * Created by Eloy on 6-3-2017.
 */
public class Model {
    private static int i = 0;
    private static Boolean done = false;
    private static int noSwap = 0;
    private static int[] array;

    public int[] createArray(int n){
        //System.out.println(" "+n);

        int[] array;
        array = new int[n];

        for(int i=0; i<n; i++){
            int randnum = (int)(Math.random() * (n-1) + 1);
            array[i] = randnum;
        }
        //System.out.println(Arrays.toString(Narray));

        return array;
    }

    public int[] doBubbleSort(int[] array){
        //System.out.println(Arrays.toString(array));
        try {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
            else{
                noSwap++;
            }
            i++;

        }
        catch (Exception e){
            i = 0;
            noSwap = 0;
        }
        //System.out.println(noSwap);
        if(noSwap==array.length - 1){
            //System.out.println(done);
            done = true;
        }


        //System.out.println(i);
        //System.out.println(Arrays.toString(array));
        return array;

    }

    public Boolean isDone(){
        return done;
    }


}
