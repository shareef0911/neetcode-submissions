class Solution {
    public boolean isAnagram(String s, String t) {
        boolean status = true;
        if(s.length()==t.length()){
            String[] arr = s.split("");
            String[] arr1 = t.split("");
            Arrays.sort(arr);
            Arrays.sort(arr1);
            for(int i =0;i<arr.length;i++){
                if(arr[i].equals(arr1[i])){
                    continue;
                }else{
                    status = false;
                    break;
                }
            }
        }else{
            status = false;
        }
        return status;
    }
}
