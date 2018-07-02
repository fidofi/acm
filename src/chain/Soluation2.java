package chain;

/** @Auther: fido @Date: 2018/6/30 11:58 @Description:给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。 */
public class Soluation2 {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    int start = 0;
    ListNode cur = head;
    ListNode second = head;
    while (start != n) {
      cur = cur.next;
      start++;
    }
    if (cur == null) {
      head = head.next;
      return head;
    }
    while (cur.next != null) {
      cur = cur.next;
      second = second.next;
    }
    second.next = second.next.next;
    return head;
  }
}
