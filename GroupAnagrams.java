class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     if (strs.length == 0) return new ArrayList();
        Map<String, List> fin = new HashMap<String, List>();
        for(String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if(!fin.containsKey(key)) fin.put(key, new ArrayList());
            fin.get(key).add(s);
        }
        return new ArrayList(fin.values());
    }
}
