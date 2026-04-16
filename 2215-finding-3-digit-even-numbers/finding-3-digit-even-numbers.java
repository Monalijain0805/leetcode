class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : digits){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele, freq + 1);
            }
            else {
                map.put(ele, 1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int j = 100; j < 1000; j++){
            if(j % 2 != 0) continue; // even number check
            int x = j;
            int c = x % 10;
            x = x / 10;
            int b = x % 10;
            x = x / 10;
            int a = x;
            if(map.containsKey(a)){
                int aFreq = map.get(a);
                map.put(a, aFreq - 1);
                if(aFreq == 1) map.remove(a);
                if(map.containsKey(b)){
                    int bFreq = map.get(b);
                    map.put(b, bFreq - 1);
                    if(bFreq == 1) map.remove(b);
                    if(map.containsKey(c)){
                        ans.add(j);
                    }
                    // restore b
                    map.put(b, bFreq);
                }
                // restore a
                map.put(a, aFreq);
            }
        }
        int[] result = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}