class Solution {
public:
   int climbStairs(int n) {
       if (n == 0) return n;
	if (n == 1) return n;
	if (n == 2) return n;
	int one = 1, two = 1;
	int res = 0;
	for (int i = n - 2; i >= 0; --i)
	{
		res = one + two;
		std::swap(one, two);
		one = res;
	}
	return res;
}
};