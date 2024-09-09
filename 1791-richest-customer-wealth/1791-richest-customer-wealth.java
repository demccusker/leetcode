class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = accounts[0][0];
        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = accounts[i][0];
            for (int j = 1; j < accounts[i].length; j++){
                System.out.println("wealth added: " + accounts[i][j]);
                currentWealth = currentWealth + accounts[i][j];
                System.out.println("current wealth: " + currentWealth);
            }
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }
        return maxWealth;
    }
}