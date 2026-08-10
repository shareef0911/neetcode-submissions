class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(int i =0;i<strs.length;i++){
            String[] arr = strs[i].split("");
            Arrays.sort(arr);
            String str = String.join("", arr);
            if(!map.containsKey(str)){
                map.put(str,new ArrayList<>());
            }
            map.get(str).add(strs[i]);
        }
       return new ArrayList<>(map.values());
    }
}
