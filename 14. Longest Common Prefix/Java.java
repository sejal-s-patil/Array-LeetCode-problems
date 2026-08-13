class Solution {
    public String longestCommonPrefix(String[] strs) {

        String shortest = strs[0];

        for(int i = 0; i<strs.length; i++){
            if(strs[i].length() < shortest.length())
            shortest = strs[i];
        }

           String com = "";
        for(int i=0; i<shortest.length(); i++){
        for(int j=0; j<strs.length; j++){
            if(strs[0].charAt(i) != strs[j].charAt(i))
                return com;
                
    }
               com += strs[0].charAt(i);
}
    
    return com;
    }
}
