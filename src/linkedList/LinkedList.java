package linkedList;

public class LinkedList {
    Node lastNode;

    public Node getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node lastNode) {
        this.lastNode = lastNode;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addElement(10);
        linkedList.addElement(20);

        System.out.println(linkedList.size());
        linkedList.printElements();

    }

    public void addElement(int val) {
        Node node = new Node(val);
        if (getLastNode() == null) {
            setLastNode(node);
            node.setNextNode(null);
            node.setPreviousNode(null);
        } else {
            node.setPreviousNode(lastNode);
            node.setNextNode(null);
            lastNode = node;
        }
    }

    public void printElements(){
        if(getLastNode() == null){
            System.out.println("No elements");
        }
        while(getLastNode() != null){
            System.out.println(lastNode);
            lastNode= lastNode.getPreviousNode();
        }
    }

    public int size() {
        int size = 0;
        if (getLastNode() == null) {
            return 0;
        }
        while (getLastNode() != null) {
            size = size + 1;
            lastNode = lastNode.getPreviousNode();

        }
        return size;
    }


    class Node {

        Integer element;
        Node nextNode;
        Node previousNode;

        Node(int element) {
            this.element = element;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public Node getPreviousNode() {
            return previousNode;
        }

        public void setPreviousNode(Node previousNode) {
            this.previousNode = previousNode;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "element=" + element +
                    '}';
        }
    }
}
