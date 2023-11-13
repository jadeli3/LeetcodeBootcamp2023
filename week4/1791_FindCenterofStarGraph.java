package week4;

class Solution {
    public int findCenter(int[][] edges) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<edges.length; i++){
            for(int j=0; j<2; j++){
                int temp = edges[i][j];
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        }
        for(int i: map.keySet()){
            if(map.get(i) == edges.length){
                result = i;
            }
        }
        return result;
    }
}