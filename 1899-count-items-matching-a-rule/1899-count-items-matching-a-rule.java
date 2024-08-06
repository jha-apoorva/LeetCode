class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(List<String> rows : items){
                if(ruleKey.equals("type") && rows.get(0).equals(ruleValue))
                count++;
                else if(ruleKey.equals("color") && rows.get(1).equals(ruleValue))
                count++;
                else if(ruleKey.equals("name") && rows.get(2).equals(ruleValue))
                count++;
        }
    return count;
    }
}