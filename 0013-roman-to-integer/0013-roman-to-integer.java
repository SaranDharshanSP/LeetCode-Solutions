class Solution {
    public int romanToInt(String s) {
        Map<String , Integer> result = new HashMap<String, Integer>();
        result.put("I",1);
        result.put("V",5);
        result.put("X",10);
        result.put("L",50);
        result.put("C",100);
        result.put("D",500);
        result.put("M",1000);

       int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = result.get(String.valueOf(s.charAt(i)));

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            prevValue = currentValue;
        }

        return total;
    }
}