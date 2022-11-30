package Day41_Java_Practice_1;

import java.util.ArrayList;
import java.util.List;

class Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> rows = new ArrayList<>();
        rows.add(List.of(1));

        for(int i = 1; i < numRows; i++){
            List<Integer> one_row = new ArrayList<>();
            List<Integer> last_row = rows.get(i - 1);

            one_row.add(1);
            for (int j = 1; j < last_row.size(); j++) {
                one_row.add(last_row.get(j - 1) + last_row.get(j));
            }
            one_row.add(1);

            rows.add(one_row);
        }

        return rows;
    }
}
