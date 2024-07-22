import java.util.Collections;
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
      Integer[] indices = new Integer[names.length];
        for (int i = 0; i < names.length; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return Integer.compare(heights[b], heights[a]);
            }
        });
        String[] sortedNames = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            sortedNames[i] = names[indices[i]];
        }

        return sortedNames;
    }}