class Solution {
    public boolean isPalindrome(String s) {
      String new1 = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
     // String newStr = new1.replaceAll("[^a-zA-Z0-9]","");  
     // String reverse = new StringBuilder(newStr).reverse().toString();
     String reverse = new StringBuilder(new1).reverse().toString();
      if(reverse.equals(new1)){
        return true;
      }
    return false;

    }
}