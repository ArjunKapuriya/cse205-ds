class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int arr[] = new int[n];
        int ans[] = new int[n];

        for(int i = 0 ; i<n; i++){
            arr[i] = heights[i];
        }

        Arrays.sort(arr);

        for(int i = 0 ; i<n ;i++){
            ans[i] = heights[i] - arr[i];
        }

        int count = 0;
        for(int i = 0 ; i<n ;i++){
            if(ans[i] != 0){
                count++;
            }
        }

        return count;
    }
}