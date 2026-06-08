class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
            return false;
        Map<Character,Integer> sChars= new HashMap<>();
        Map<Character,Integer> tChars= new HashMap<>();

        for(int i=0;i<t.length();i++)
        {
            sChars.put(s.charAt(i),sChars.getOrDefault(s.charAt(i), 0)+1);
            tChars.put(t.charAt(i),tChars.getOrDefault(t.charAt(i), 0)+1);
        }
        return tChars.equals(sChars);
    }
}
