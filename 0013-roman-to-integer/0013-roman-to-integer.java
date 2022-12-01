class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> romanList = new HashMap<>();
        romanList.put("I", 1);
        romanList.put("V", 5);
        romanList.put("X", 10);
        romanList.put("L", 50);
        romanList.put("C", 100);
        romanList.put("D", 500);
        romanList.put("M", 1000);

        int intValue = 0;
        intValue += getInt(romanList, s.charAt(s.length()-1));
        int pointer = s.length()-1;

        for (int i = s.length()-2; i > -1; i--) {
            if (getInt(romanList, s.charAt(i)) >= getInt(romanList, s.charAt(pointer))) {
                intValue += getInt(romanList, s.charAt(i));
            } else {
                intValue -= getInt(romanList, s.charAt(i));
            }
            pointer--;
        }
        return intValue;
    }

    public int getInt(HashMap<String, Integer> hashMap, char c) {
        return hashMap.get(String.valueOf(c));
    }
}