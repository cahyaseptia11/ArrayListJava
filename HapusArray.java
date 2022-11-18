package postdayenam;

import java.util.ArrayList;

public class HapusArray {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<String>();
        data.add("hanip");
        data.add("ganteng");
        data.add("banget");
        data.remove(2);
        System.out.println(data);
    }
}
