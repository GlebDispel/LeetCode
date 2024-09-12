package easy;

class ListNode {
      int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) {
         this.val = val; }
      ListNode(int val, ListNode next) {
         this.val = val; this.next = next; }

      @Override
      public String toString() {
          return "easy.ListNode{" +
                  "val=" + val +
                  ", next=" + next +
                  '}';
      }
  }





public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 != null && list2 !=null){
        if(list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        }else {
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;
        }

        }
        if (list1 == null)
            return list2;
        return list1;
        }
    }

    class MergeTwoSortedListsTest {
    public ListNode mergeTwoListsTest(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;

        while (l1 !=null && l2 !=null){
            if (l1.val < l2.val){
                current.next = l1;
                l1 = l1.next;
            }else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        current.next = l1 == null ? l2 : l1;

        return head.next;
    }
    }

