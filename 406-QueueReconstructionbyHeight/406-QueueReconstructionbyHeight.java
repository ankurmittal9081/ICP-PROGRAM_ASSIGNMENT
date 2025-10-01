// Last updated: 10/1/2025, 9:49:06 PM
class Solution {
    public int[][] reconstructQueue(int[][] points) {
         int n=points.length;
    Arrays.sort(points, (a, b) -> {
        if (a[0] == b[0]) return Integer.compare(a[1], b[1]);
        return Integer.compare(b[0], a[0]);
    });
        List<int[]> list =new ArrayList<>();
        for (int[] person :points) {
            list.add(person[1], person);
        }

        // Convert back to array
    return list.toArray(new int[points.length][2]);
    
    }

}