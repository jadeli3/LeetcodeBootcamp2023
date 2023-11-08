class Solution {
    public String minWindow(String s, String t) {
    int[] count = new int[100]; 
    int lengthS = s.length();
    int lengthT = t.length();
    for(int i=0;i<lengthT;i++){
        count[t.charAt(i)-'A']++;
    }
    int left=0, right=0;
    int minLength=Integer.MAX_VALUE;
    String res="";
    int countAll=0;
    int[] count2 = new int[100];
    while(right<lengthS){
        int c = s.charAt(right)-'A';
        if(count[c]>0){
            if(++count2[c]<=count[c]){
                countAll++;
            }
        }
        while(countAll==lengthT){
            if(right-left+1<minLength){
                minLength = right-left+1;
                res=s.substring(left, right+1);
            }
            int cl=s.charAt(left)-'A';
            if(count[cl]>0){
                if(--count2[cl]<count[cl]){
                    countAll--;
                }
            }
            left++;
        }
        right++;
    }
    return res;
}
}