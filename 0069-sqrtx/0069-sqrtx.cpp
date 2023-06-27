class Solution {
public:
    
    int mySqrt(int x) {
    if (x == 0) return 0;
    int r = x;
    int l = 1;
    int res = 0;

        
    while(l <= r){
        int mid = l + ((r - l) / 2);
        if (mid > x / mid) {
            r = mid - 1;
        }
        else if(mid < x / mid) {
            l = mid + 1;
            res = mid;
        }
        else {
            return mid;
        }
    }
    return res;
}
};