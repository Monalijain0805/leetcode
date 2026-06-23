class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for(int i = 0; i < costs.length; i++) {
            if(coins >= costs[i]) {
                coins = coins - costs[i];
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }
}
//isme aisa h ki mtlb jse phle costs ko sort krloo fir jse cojins 7 h or costs 1 h toh age costs choti h coin se toh coin m se cots minus krege
//fir remaing coins ho jaege 6 fir nect costs check krege jse next 1 fir bacha 6 -1 = 5 fir check krege aise hi agr costs coin se bdu nikl gyi tb reak kr dege or count return kr dege