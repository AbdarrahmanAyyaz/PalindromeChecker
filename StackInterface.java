/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: StackInterface.java
 * Author: Abdarrahman Ayyaz
 * **********************************************
 */



package assignment03PartB;

public interface StackInterface<T>
{
   public void push(T newEntry);
   public T pop();
   public T peek();
   public boolean isEmpty();
   public void clear();
}
