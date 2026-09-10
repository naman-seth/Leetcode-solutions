class Solution {
    public boolean isAnagram(String s, String t) {
       int sL = s.length();
       int tL = t.length();
       if(sL!=tL){
        return false;
       }
       char[] sC = s.toCharArray(); 
       char[] tC = t.toCharArray(); 
       Arrays.sort(sC);
       Arrays.sort(tC);
       return Arrays.equals(sC,tC);
    }
}