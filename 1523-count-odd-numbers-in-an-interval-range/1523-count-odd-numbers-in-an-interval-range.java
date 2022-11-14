class Solution {
    public int countOdds(int low, int high) {
        // count odd numbers from 1 to low, and 1 to high and then subtract high odds from low odds
        int lowOdds = (low)/2;
        int highOdds = (high + 1) /2;
        
        return highOdds - lowOdds;
    }
}