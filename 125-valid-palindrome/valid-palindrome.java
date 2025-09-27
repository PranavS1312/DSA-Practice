class Solution {
    public boolean isPalindrome(String s) {

        String a = s.trim().replaceAll("\\s+","").toLowerCase();
        StringBuilder b = new StringBuilder();

        for(int i=0;i<a.length();i++){
            
            if((a.charAt(i)>96 && a.charAt(i)<123) || (a.charAt(i)>47 && a.charAt(i)<58)){
                b.append(a.charAt(i));
            }
        }
       
        StringBuilder rev = new StringBuilder(b).reverse();

        return b.toString().equals(rev.toString());
        
    }
}