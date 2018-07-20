class Node {
    
    // keep these​​​​​​​‌​‌‌‌‌​‌‌‌​‌‌​​‌‌​‌‌‌‌‌‌ fields
    Node left, right =null;
        int value;
    
    public Node find(int v){
       Node node=this;
       while(node!=null){
           if(node.value==v)
               return node;
           else if(node.value<v)
               node=node.right;
           else
               node=node.left;
        }
        return null;
    }
}

