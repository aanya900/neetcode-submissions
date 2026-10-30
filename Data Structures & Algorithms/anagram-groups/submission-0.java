class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> h = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            h.putIfAbsent(key, new ArrayList<>());
            h.get(key).add(s);
        }
        return new ArrayList<>(h.values());
    }
}
