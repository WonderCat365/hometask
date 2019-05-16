package annotations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortArray {

    public void superSort(){
        String[] array1 = {"мама", "мыла"};
        String[] array2 = {"я", "очень", "люблю", "java"};
        String[] array3 = {"мир", "труд", "май"};

        List<String[]> arrays = new ArrayList<>();
        arrays.add(array1);
        arrays.add(array2);
        arrays.add(array3);

        Comparator<String[]> sortByLength = Comparator.comparingInt(o -> o.length);

        arrays.sort(new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1.length - o2.length;
            }
        });
        arrays.sort(sortByLength);
        System.out.println("");
    }
}
