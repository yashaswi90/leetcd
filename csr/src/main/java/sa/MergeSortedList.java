package sa;


public class MergeSortedList {
    public static void main(String[] args) {
//        int[] l1 = {1, 2, 4};

        ListNode l1 = new ListNode(0);
        l1.val = 1;
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(4);


        ListNode l2 = new ListNode(0);
        l2.val = 1;
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(3);
        ListNode x = mergeTwoLists(l1, l2);
        while (x != null) {
            System.out.println(x.val);
            x = x.next;
        }


        double v = Math.pow(2, 31) - 1;
        System.out.println(v);

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode tempNode = new ListNode(0);
        ListNode currNode = tempNode;


        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                currNode.next = l1;
                l1 = l1.next;
            } else {
                currNode.next = l2;
                l2 = l2.next;
            }

            if (l1 != null) {
                currNode.next = l1;
                l1 = l1.next;
            }
            if (l2 != null) {
                currNode.next = l2;
                l2 = l2.next;
            }

        }
        return tempNode.next;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
