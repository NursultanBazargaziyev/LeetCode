class Solution {
    static public int finalValueAfterOperations(String[] operations) {
        int res = 0;

        for (String item: operations){
            for (char ch: item.toCharArray()){
                if(ch=='+'){
                    res++;
                    break;
                }
                else if(ch=='-'){
                    res--;
                    break;
                }
            }
        }
        return res;

    }
}