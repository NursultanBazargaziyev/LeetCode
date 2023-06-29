/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
   ListNode* deleteDuplicates(ListNode* head) {
    if(head == nullptr) return head;
    int prevValue = head->val;

    ListNode* current;
    ListNode* prev = head;
    while (prev->next != nullptr) {
        {
            current = prev->next;
            if (prevValue == current->val) {
                prev->next = current->next;
                delete current;
                continue;
            }
            prev = prev->next;
            prevValue = prev->val;
        }
    }
    return head;
}
};