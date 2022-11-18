package postdayenam;

import java.util.ArrayList;

public class TambahArrayIndex {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<String>();
        data.add("Volvo");
        data.add("BMW");
        data.add("Ford");
        data.add(0, "Mazda");
        System.out.println(data);
    }
}
