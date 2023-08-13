class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder out = new StringBuilder("");
        String[] result = s.trim().split(" ");
        for(int i=0; i<k; i++){
            if(i==k-1) out.append(result[i]);
            else out.append(result[i]+" ");
        }
        return out.toString();
    }
}