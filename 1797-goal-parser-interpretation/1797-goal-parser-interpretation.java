class Solution {
    public String interpret(String command) {
        String interpret="";
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='(' && command.charAt(i+1)==')')
            interpret += 'o';
            else if(command.charAt(i)=='(' && command.charAt(i+1)=='a'){
                interpret += 'a';
                interpret += 'l';
            }
            else if(command.charAt(i)=='G')
            interpret += 'G';
        }
    return interpret;
    }
}