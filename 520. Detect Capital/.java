class Solution {
    public boolean detectCapitalUse(String word) {
        int uc = 0;
        for(int i = 0; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i)))
            uc++;
        }

        if(uc==word.length() || uc == 0 || (Character.isUpperCase(word.charAt(0)) && uc == 1))
        return true;
        
        return false;

    }
}
