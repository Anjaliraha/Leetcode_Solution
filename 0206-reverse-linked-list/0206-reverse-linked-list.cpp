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
    private:
    //recursive way
    ListNode* reverse1(ListNode* head)
    {
        if(head==NULL || head->next==NULL){
            return head;
        }
        ListNode* smallhead=reverse1(head->next);
        head->next->next=head;
        head->next=NULL;
        return smallhead;
    }
    void reverse(ListNode* &head,ListNode* curr,ListNode* prev){
        if(curr==NULL){
            head=prev;
            return;
        }
        ListNode* forward=curr->next;
        reverse(head,forward,curr);
        curr->next=prev;
    }
public:
    
    ListNode* reverseList(ListNode* head) {
        // ListNode* curr=head;
        // ListNode* prev=NULL;
        // reverse(head,curr,prev);
        return reverse1(head);
    }
};