package datastructure.linked;

//每一个链表实际上就是由多个节点组成的
public class Node {    //定义一个节点
    private String data; //用于保存数据
    private Node next;   //用于保存下一个节点
    //每一个Node类对象都必须保存有响应的数据
    public Node(String data){
        this.data = data ;
    }
    public void setNext(Node next){
        this.next = next ;
    }
    public Node getNext(){
        return this.next ;
    }
    public String getData(){
        return this.data ;
    }
}