class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> matchList = new ArrayList<List<Integer>>();
        List<Integer> noLosses = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();
        Map<Integer,Integer> losersCount = new HashMap<>();
        Set<Integer> players = new HashSet<>();
        for (int i = 0; i < matches.length; i++){
            players.add(matches[i][1]);
            players.add(matches[i][0]);
                losersCount.put(matches[i][1],losersCount.getOrDefault(matches[i][1],0)+1);
                    }
       
        
        for (int key : players){
            
            if (!losersCount.containsKey(key)){
                noLosses.add(key);
            }
            else if (losersCount.get(key) == 1){
                oneLoss.add(key);
            }
            
            
        }
        Collections.sort(oneLoss);
        Collections.sort(noLosses);
        
        matchList.add(noLosses);
        matchList.add(oneLoss);
        return matchList;
    }
}