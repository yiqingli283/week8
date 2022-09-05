//中序遍历    向外界提供调用中序遍历的的方法
    public void inOrder(){
        inOrder(root);
 
    }
    //中序遍历-递归的方式  以node为根结点开始中序遍历（LDR）
    private void inOrder(Node node){
        //如果结点为空就停止递归
        if (node == null){
            return;
        }
        //如果不为空，先以node的左结点为根结点去中序递归左子树
        inOrder(node.left);
        //输出当前结点的值
        System.out.println(node.e);
        //左结点递归完了，然后递归当前结点的右子结点
        inOrder(node.right);
    }