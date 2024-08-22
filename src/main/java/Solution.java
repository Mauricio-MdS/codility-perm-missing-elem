class Solution {
    public int solution(int[] A) {
        int n = A.length + 1;
        long sumOfNNumbers = (long) (1 + n) * (n) / 2;
        long arraySum  = 0;
        for (int x : A) {
            arraySum += x;
        }
        return (int)(sumOfNNumbers - arraySum);
    }
}