class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String>  arr = new ArrayList<>();
        arr.add(folder[0]);

        for(int i=1;i<folder.length;i++){
            String last = arr.get(arr.size()-1) + "/";
            if(!folder[i].startsWith(last))
                arr.add(folder[i]);
        }
        return arr;
    }
}