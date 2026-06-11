class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        int[][] anagramsCompute= new int[strs.length][26];
        for(int i=0;i<strs.length;i++){
            for(int j=0;j<strs[i].length();j++){
                anagramsCompute[i][strs[i].charAt(j)-'a']+=1;
            }
        }
        int[] vis = new int[strs.length];
        for(int i=0;i< strs.length;i++){
            if(vis[i]==1)
                continue;
            List<String> list = new ArrayList<>();
            list.add(strs[i]);
            vis[i]=1;
            for(int j=i+1;j<strs.length;j++){
                if(vis[j]==1)
                    continue;
                boolean matched = true;
                for(int k=0;k<26;k++)
                    if(anagramsCompute[i][k]!=anagramsCompute[j][k]) {
                        matched = false;
                        break;
                    }
                if(matched) {
                    list.add(strs[j]);
                    vis[j] = 1;
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
