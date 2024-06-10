class Solution {
    public int heightChecker(int[] heights) {
        int l = heights.length;
        int[] arr = Arrays.copyOf(heights, l);
        Arrays.sort(arr);
        int c = 0;
        for (int i = 0; i < l; i++) {
            if (heights[i] != arr[i]) {
                c++;
            }
        }
        return c;
    }
}

