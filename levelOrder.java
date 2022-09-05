//层序遍历——迭代方式
    public void levelOrder(){
        LinkedList<Node> queue = new LinkedList<>();
        //如果树为空
        if (isEmpty()){
            return;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            Node cur = queue.poll();
            System.out.println(cur.e);
            if (cur.left != null){
                queue.offer(cur.right);
            }
            if (cur.right != null){
                queue.offer(cur.left);
            }
        }
    }