package chain;

/** @Auther: fido @Date: 2018/7/2 09:52 @Description: 反转一个单链表 */
public class Soluation3 {
  public ListNode reverseList(ListNode head) {
    ListNode cur = head;
    ListNode previous = null;
    ListNode headNode = null;
    while (cur != null) {
      ListNode nn = cur.next;
      if (nn == null) {
        headNode = cur;
      }
      cur.next = previous;
      previous = cur;
      cur = nn;
    }
    return headNode;
  }

  public static void main(String[] args) {
    ListNode listNode1 = new ListNode(1);
    ListNode listNode2 = new ListNode(2);
    ListNode listNode3 = new ListNode(3);
    ListNode listNode4 = new ListNode(4);
    listNode1.next = listNode2;
    listNode2.next = listNode3;
    listNode3.next = listNode4;
    Soluation3 soluation3 = new Soluation3();
    soluation3.reverseList(listNode1);
    System.out.println(listNode1);
  }
}
