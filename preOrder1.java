public void preOrder(){
        preOrder(root);
    }
    //前序遍历-递归思想    以node为根结点开始前序遍历（DLR）
    private void preOrder(Node node){
        //如果当前元素为空，直接返回空
        if (node == null){
            return;
        }
        //输出根结点的值
        System.out.println(node.e);
        //向左走
        preOrder(node.left);
        //向右走
        preOrder(node.right);
    }