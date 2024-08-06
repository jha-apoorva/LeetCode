class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(List<String> rows : items){
            //System.out.println(rows);
            //System.out.println(rows.get(1));
            //for(int i=0;i<rows.size();i++){
                //System.out.println(rows.get(i));
                if(ruleKey.equals("type") && rows.get(0).equals(ruleValue))
                count++;
                else if(ruleKey.equals("color") && rows.get(1).equals(ruleValue))
                count++;
                else if(ruleKey.equals("name") && rows.get(2).equals(ruleValue))
                count++;
            //}
        }
    return count;
    }
}