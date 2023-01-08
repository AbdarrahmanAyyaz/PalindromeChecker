/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: OurStack.java
 * Author: Abdarrahman Ayyaz
 * **********************************************
 */

package assignment03PartB;

import java.util.EmptyStackException;

public class OurStack<T> implements StackInterface<T> {
    private Node topNode;

    public OurStack()
    {
        topNode = null;
    }

    @Override
    public void push(T newEntry)
    {
        topNode = new Node(newEntry, topNode);
        // After incrementing, taking new entry and then pushing to the stack
    }

    @Override
    public T peek() {
        if (isEmpty())
        {
             throw new EmptyStackException();
             } else
             {
                return topNode.getData();
             }
        //returning the top item by the location of the index through the variable numOfEntries
    }

    @Override
    public T pop() {
        T top = peek(); // Might throw EmptyStackException
         assert (topNode != null);
         topNode = topNode.getNextNode();
         return top;
        //After removing the top then returning top
    }

    @Override
    public boolean isEmpty()
    {
        return topNode == null;
    }

    @Override
    public void clear()
    {
        topNode = null;

    }

    private class Node {
        private T data; // Entry in stack
        private Node next; // Link to next node

        private Node(T dataPortion) {
            this(dataPortion, null);
        } // end constructor

        private Node(T dataPortion, Node linkPortion) {
            data = dataPortion;
            next = linkPortion;
        } // end constructor

        private T getData() {
            return data;
        } // end getData

        private void setData(T newData) {
            data = newData;
        } // end setData

        private Node getNextNode() {
            return next;
        } // end getNextNode

        private void setNextNode(Node nextNode) {
            next = nextNode;
        } // end setNextNode
    } // end Node
}
