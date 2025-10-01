class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;   
        int empty = numBottles; 

        while (empty >= numExchange) {
            int newBottles = empty / numExchange;   // exchange for new bottles
            ans += newBottles;                      // drink them
            empty = newBottles + (empty % numExchange); // new empty + leftover
        }

        return ans;
    }
}
