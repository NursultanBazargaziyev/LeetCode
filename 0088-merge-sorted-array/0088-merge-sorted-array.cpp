class Solution {
public:
int partition(vector<int>& arr, int l, int r) {
	int pivot = arr[r];
	
	int i = l, j = l - 1;
	while (i < r) {
		if (arr[i] < pivot) {
			j++;
			std::swap(arr[i], arr[j]);
		}
		i++;
	}
	std::swap(arr[j + 1], arr[r]);
	return ++j;
}
    
void quickSort(vector<int>& arr, int l, int r) {
	if (l < r) {
		int pi = partition(arr, l, r);

		quickSort(arr, l, pi - 1);
		quickSort(arr, pi + 1, r);
	}
}
    
    
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
	    for (int i = m, j = 0; i < m+n; ++i, ++j)
		    nums1[i] = nums2[j];
        quickSort(nums1, 0, nums1.size() - 1);
    }
    
};