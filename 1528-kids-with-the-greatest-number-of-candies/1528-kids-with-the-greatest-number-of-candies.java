class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            candies[i]+= extraCandies;
            if (Arrays.stream(candies).max().getAsInt()==candies[i]){
                result.add(true);
            }else result.add(false);
            candies[i] -= extraCandies;
        }
    return result;
    }
}