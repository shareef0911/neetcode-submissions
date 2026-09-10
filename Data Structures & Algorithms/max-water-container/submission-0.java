class Solution {
    public int maxArea(int[] heights) {

        int maxStore =0;

        int right=0;
        int left =heights.length-1;

        while (right<left){
            if(heights[right]>heights[left]){
                int min =heights[left];
                int store = (left-right)*min;
                maxStore = (maxStore>store)?maxStore:store;
                left--;
            }else{
                int min =heights[right];
                int store = (left-right)*min;
                maxStore = (maxStore>store)?maxStore:store;
                right++;
            }
        
        }
        return maxStore;

        
    }
}
