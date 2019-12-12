package binarytree;

public class BasicBinaryTree {

    public static void main(String[] args) {
        BasicBinaryTree basicBinaryTree = new BasicBinaryTree();
        basicBinaryTree.add(1);
        basicBinaryTree.add(10);
        basicBinaryTree.add(5);
        basicBinaryTree.add(7);
        if(basicBinaryTree.getNode(7) != null){
            System.out.println("Number exists");
        }else{
            System.out.println("Number dont exists");
        }
    }


    private Node root;
    private int size;

    public int getSize() {
        return size;
    }

    public boolean contains(int num) {
        Node node = new Node(num);
        if (root != null) {
            searchChildren(root, node);
        } else {
            return false;
        }
        return false;
    }

    public Node getNode(int num) {
        Node currentNode = this.root;

        while (currentNode != null) {
            if (currentNode.getItem() < num) {
                currentNode = currentNode.getLeft();
            } else if (currentNode.getItem() > num) {
                currentNode = currentNode.getRight();
            } else {
                return currentNode;
            }
        }
        return null;


    }

    public boolean searchChildren(Node parent, Node node) {
        if (node.getItem() == parent.getItem()) {
            return true;
        } else if (node.getItem() < parent.getItem()) {
            parent = parent.getLeft();
            searchChildren(parent, node);
        } else {
            parent = parent.getRight();
            searchChildren(parent, node);
        }

        return false;

    }

    public void add(int item) {
        Node node = new Node(item);
        if (root == null) {
            this.root = node;
            this.size++;
        } else {
            insert(root, node);
        }
    }

    public void insert(Node parent, Node child) {
        if (child.getItem() < parent.getItem()) {
            if (parent.getLeft() == null) {
                parent.setLeft(child);
                this.size++;
            } else {
                insert(parent.getLeft(), child);
            }
        } else if (child.getItem() > parent.getItem()) {
            if (parent.getRight() == null) {
                parent.setRight(child);
                this.size++;
            } else {
                insert(parent.getRight(), child);
            }
        }
    }


    private class Node {
        Node left;
        Node right;
        Node parent;
        int item;

        public Node(int item) {
            this.item = item;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public int getItem() {
            return item;
        }

        public void setItem(int item) {
            this.item = item;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "left=" + left +
                    ", right=" + right +
                    ", parent=" + parent +
                    ", item=" + item +
                    '}';
        }
    }
}
