package chain;

/**
 * @Auther: fido @Date: 2018/6/30 11:17 @Description:请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 */

public class Soluation1 {
  public void deleteNode(ListNode node) {
    // 删除当前节点->直接用下一节点覆盖当前节点
    node.val = node.next.val;
    node.next = node.next.next;
  }

  public static void main(String[] args) {
    ListNode listNode1 = new ListNode(4);
    ListNode listNode2 = new ListNode(5);
    ListNode listNode3 = new ListNode(1);
    ListNode listNode4 = new ListNode(9);
    listNode1.next = listNode2;
    listNode2.next = listNode3;
    listNode3.next = listNode4;
    Soluation1 soluation1 = new Soluation1();
    soluation1.deleteNode(listNode2);
  }
}
