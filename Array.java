import java.util.ArrayList;
import java.util.Arrays;

/**
 * Array
 */
public class Array {

    public static void main(String[] args) {

        String[] friendList = new String[4];
        String[] friendList1 = { "hossan", "jahid" };

        System.out.println(friendList1[1]);

        ArrayList<String> friendArrayList = new ArrayList<>(Arrays.asList("jahid", "hossan", "roni"));
        System.out.println(friendArrayList);

        // get one item form array list
        System.out.println(friendArrayList.get(1));

        // add item in the array list
        friendArrayList.add("salim");
        System.out.println(friendArrayList);

        // remove item from arrayList
        friendArrayList.remove(1);
        System.out.println(friendArrayList);

        // replace item in the arrayList
        friendArrayList.set(0, "samin");
        System.out.println(friendArrayList);

        // to know the array length we have to call a method name size()
        System.out.println(friendArrayList.size());
    }
}