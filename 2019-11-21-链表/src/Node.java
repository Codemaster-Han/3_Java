public class Node {
        int val;
        Node next;

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        Node(int val) {
            this(val, null);
        }

        Node() {
            this(7, null);
        }

        @Override
        public String toString() {
            return String.format("Node{%d}", val);
        }
}
