package easy;




public class RemoveDuplicatesFromSortedList {


    public ListNode deleteDuplicates(ListNode list1) {
       if (list1 == null || list1.next == null) return list1;
       ListNode current = list1;
       while (current != null && current.next != null) {
          if (current.val == current.next.val){
              current.next = current.next.next;
          }else {
              current = current.next;
          }



       }
       return list1;

    }
}
