/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    // Map<RandomListNode, RandomListNode> visited = new HashMap<>();
    // public RandomListNode copyRandomList1(RandomListNode head) {
    //     if(head==null) return null;
    //     RandomListNode res = new RandomListNode(head.label);
    //     if(visited.containsKey(head)) return visited.get(head);
    //     else{
    //         visited.put(head, res);
    //         if(head.next!=null) res.next = copyRandomList(head.next);
    //         if(head.random!=null) res.random = copyRandomList(head.random);
    //     }
    //     return res;
    // }
    
        public RandomListNode copyRandomList(RandomListNode head) {
        if(head==null) return null;
            Map<RandomListNode, RandomListNode> visited = new HashMap<>();
            RandomListNode node = head;
            while(node!=null){
                visited.put(node, new RandomListNode(node.label));
                node=node.next;
            }
            
            node = head;
            while(node!=null){
                visited.get(node).next = visited.get(node.next);
                visited.get(node).random = visited.get(node.random);
                node=node.next;
            }
            return visited.get(head);
    }
}
