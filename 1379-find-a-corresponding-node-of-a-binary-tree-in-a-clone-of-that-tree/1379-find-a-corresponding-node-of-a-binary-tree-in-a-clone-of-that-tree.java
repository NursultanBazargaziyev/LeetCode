/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        if(original == null) return null;
        
        if(original.val == target.val)
            return cloned;

        TreeNode node1 = getTargetCopy(original.left, cloned.left, target);
        TreeNode node2 = getTargetCopy(original.right, cloned.right, target);

        return node1 == null? node2: node1;
    }
}