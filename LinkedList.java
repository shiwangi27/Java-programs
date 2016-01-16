// Linked List data structure 

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Node
{
    Object data;
    Node next;
    
    Node(Object data)
    {
        this.data=data;
    }
    
    Node(Object data,Node next)
    {
        this.data=data;
        this.next=next;
    }
    
    Object getData()
    {
        return data;
    }
    
    void setData(Object data)
    {
        this.data = data;
    }
    
    Node getNext()
    {
        return next;
    }
    
    void setNext(Node next)
    {
        this.next=next;
    }
    
}

//-----------------------------------------------------------------------------------------------

class Linkedlist
{
    
    private Node head;
    public static int counter=0;
    void addNode(Object data)
    {
        if(head==null)
        {
            head = new Node(data);
            return;
        }
        Node current=head;
        
        Node newNode = new Node(data); 
        
        if(current!=null)
        {
            while(current.getNext()!=null)
            {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        counter++;
    }
    
    Object deleteAtFront()
    {
        if(head == null)
        {
            return false;
        }
    
        Node current = head;

        if(head!=null)
        {
        
            //current=current.getNext();
            current.setNext(current.getNext().getNext());
            return current.getData();
        }
    return false;
    }

    Object deleteAtIndex(int index)
    {
        if(index < 0)
        return false;
        
        Node current= head;
        
        if(head!=null)
        {
            for(int i=0 ; i < index; i++)
            {
               // if(current.getNext() == null)
                 //   return false;
             current = current.getNext();
            }
            
            current.setNext(current.getNext().getNext());
            return current.getData();

        }
          return false;
    }
    
    
    Object deleteData(Object d)
    {
        Node current = head;
        
        if(head==null)
            return false;
            
        if(head.getData() == d)
        {
            return head.getData();
        }  
        if(head!=null)
        {
            while(current.getNext()!=null)
            {
                if(current.getNext().getData()==d)
                {
                    current.setNext(current.getNext().getNext());
                    return current.getData();
                }
            current = current.getNext();

            } 
        
        }
        return false;
        
    }
    
    void printlist()
    {
        Node current = head;
        while(current!=null)
        {
            System.out.println(current.getData());
            current = current.getNext();

        }
    }
    
    
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Linkedlist ll = new Linkedlist();
        ll.addNode(2);
        ll.addNode(5);
        ll.addNode(7);
        ll.addNode(78);
        ll.addNode(23);

        
        //System.out.println(ll.deleteAtIndex(4));
        
        //System.out.println(ll.deleteAtFront());
        //      System.out.println(ll.deleteAtFront());
        System.out.println(ll.deleteData(5));
        System.out.println("Print list");
            ll.printlist();

        
        //ll.deleteAtFront();
    }
}
