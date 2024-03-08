/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package createlist;

import java.util.Scanner;

/**
 *
 * @author ozzgu
 */
public class CreateList {
        
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public Node head = null;
    public Node tail = null;
    
    public void add(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    public void display(){
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
        }
        else{
            System.out.println("Nodes of the circular linked list: ");
            do{
                System.out.println("  "+ current.data);
                current = current.next;
            }while(current != head);
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
       CreateList c1 = new CreateList();
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you do data entry? (Yes-No)");
        String answer = scan.nextLine().toLowerCase();
        if (answer.equalsIgnoreCase("Yes")) {
            System.out.println("How many data entries will you make?");
            int count = scan.nextInt();
            if (count == 0) {
                System.out.println("List is empty");
            }
            else
            {
                System.out.println("Enter " + count + " data:");
                for (int i = 0; i < count; i++) {
                int dataEntry = scan.nextInt();
                c1.add(dataEntry);
                }
                c1.display();
            }
            
        } else {
            System.out.println("No data entry performed.");
        }
    }
    
}
