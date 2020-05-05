import static java.lang.System.exit;

 class StackUsingLinkedlist<E> { 
  
    private class Node<E> {   
        E data;  
        Node<E> next; 
    }     
    Node<E> head;    
    StackUsingLinkedlist() 
    { 
        this.head = null; 
    } 
  
     
    public void push(E x)  
    {          
        Node<E> temp = new Node<>();       
        if (temp == null) { 
            System.out.print("\nStack is full"); 
            return; 
        }         
        temp.data = x;         
        temp.next = head;         
        head = temp; 
    } 
  
     
    public boolean isEmpty() 
    { 
        return head == null; 
    } 
  
   
    public E peek() throws Exception
    {         
        if (!isEmpty()) { 
            return head.data; 
        } 
        else { 
           throw new Exception ("Stack is Empty"); 
           
        } 
    } 
  
    
    public void pop()  
    {          
        if (head == null) { 
            System.out.print("\nStack Underflow"); 
            return; 
        }         
        head = (head).next; 
    } 
  
    public void print() 
    {         
        if (head == null) { 
            System.out.printf("\nStack is empty"); 
            exit(1); 
        } 
        else { 
            Node<E> temp = head; 
            while (temp != null) {                  
                System.out.printf("%d->", temp.data);                  
                temp = temp.next; 
            } 
        } 
    } 
} 
 
public class Solution { 
    public static void main(String[] args) throws Exception 
    { 
         
        StackUsingLinkedlist<Integer> obj = new StackUsingLinkedlist<>(); 
        
        obj.push(11); 
        obj.push(22); 
        obj.push(33); 
        obj.push(44); 
        obj.push(11); 
        obj.push(22); 
        obj.push(33); 
        obj.push(44); 
  
        
        obj.print(); 
  
        
        System.out.printf("\nTop element is %d\n", obj.peek()); 
  
        
        obj.pop(); 
        obj.pop(); 
  
         
        obj.print(); 
  
        
        System.out.printf("\nTop element is %d\n", obj.peek()); 
    } 
} 



