public void postOrder() {
        postOrder(root);
    }
    //后序遍历-递归方式 以node为根节点 后序遍历LRD
    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e);
    }