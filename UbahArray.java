package postdayenam;

import java.util.ArrayList;

public class UbahArray {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<String>();
        data.add("hanip");
        data.add("cakep");

        System.out.println("Ini adalah output pertama : " + data);
        data.set(0, "saya");
        System.out.println("Ini adalah output kedua : " + data);
    }
}
