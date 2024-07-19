import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

class Collection {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("chanchal");
        names.add("sakshi");
        names.add("priya");
        names.add("ravina");
        names.add("aarti");

        // System.out.println("Array Element:" + names);
        for (String str : names) {
            System.out.println(str);
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
            // br.append(0);
        }
        System.out.println("-------------------------------------------------");
        LinkedList list = new LinkedList<>();
        list.add("Deeksha");
        list.add("Rekha");
        list.add("khushu");
        System.out.println("List" + list);
        System.out.println("-------------------------------------------------");
        HashSet<Double> nms = new HashSet<>();
        nms.add(23.45);
        nms.add(85.36);
        nms.add(658.45);
        nms.add(new Double(263.12));
        System.out.println("nms" + nms);
        System.out.println("------------------------------------------");
        TreeSet<Double> test = new TreeSet<>();
        test.addAll(nms);
        System.out.println("nms1" + nms);
        System.out.println("--------------------------------------------");
        TreeSet<String> set = new TreeSet<>();
        set.addAll(names);
        set.forEach(e -> {
            System.out.println("treeset" + e);
        });

    }
}