class Solution {
    public int secondHighest(String s) {
        int large=-1;
        int secLarge=-1;
        for(char ch:s.toCharArray()){
            if(ch>='0' && ch<='9'){
                int dig=ch-'0';
                if(dig>large){
                    secLarge=large;
                    large=dig;
                }else if(dig>secLarge && dig<large){
                    secLarge=dig;
                }
            }
        }
        return secLarge;
    }
}