package chain;

/**
 * @Auther: fido
 * @Date: 2018/6/30 12:20
 * @Description:
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "ListNode{" + "val=" + val + ", next=" + next + '}';
    }
}
