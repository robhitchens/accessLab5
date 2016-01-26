import java.util.ArrayList;

/**
 * Created by roberthitchens3 on 1/24/16.
 */
public class RotaryArrayList<T> extends ArrayList<T> {

    public static void main(String[] args){
        RotaryArrayList<Integer> rotary = new RotaryArrayList<Integer>();
        for(int i = 0; i< 7; i++){
            rotary.add(i);
        }
        System.out.println("not rotated: " +rotary.toString());
        rotary.rotate(2);

        System.out.println("rotated: "+ rotary.toString());
    }

    public void rotate(int k){
        int rotate = 0;
        while(rotate <k){
            add(remove(0));
            rotate++;
        }
    }

}
