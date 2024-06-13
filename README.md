CreateList Project
Overview
The CreateList project is a Java program designed to create and manage a circular linked list. The user can add integer data to the list and display the list's contents through an interactive console interface.

Key Components
Node Class
Purpose: Represents an individual element within the circular linked list.
Attributes:
data: Stores the integer value of the node.
next: A reference to the next node in the list.
CreateList Class
Attributes:
head: Points to the first node in the list.
tail: Points to the last node in the list.
Methods:
add(int data): Adds a new node with the specified data to the list. If the list is empty, it initializes the head and tail to the new node, creating a self-referential link. If the list already has elements, it appends the new node to the end of the list and updates the tail to maintain the circular structure.
display(): Prints the data of all nodes in the list. It handles the case where the list is empty by outputting a corresponding message. For a non-empty list, it iterates through the nodes starting from the head and continues until it circles back to the head.
Main Method
Functionality:
Interacts with the user via the console.
Prompts the user to decide if they want to perform data entry.
If the user opts for data entry, it asks for the number of entries and then accepts the specified number of integer inputs.
Calls the add method to insert each input into the circular linked list.
After all entries are added, it calls the display method to print the list's contents.
If the user chooses not to perform data entry, it outputs a message indicating no data was entered.
Usage
Run the program.
Respond to the initial prompt to indicate whether you will enter data (Yes or No).
If Yes, specify the number of data entries you want to make.
Enter the integer values for the specified number of entries.
The program will display the nodes in the circular linked list.
Example Interaction
User is asked if they want to perform data entry.
If the user answers Yes, they are prompted to enter the number of data items.
User inputs the number of items and then provides the actual integer values.
The program adds these values to the circular linked list and displays the entire list.
This explanation covers the main functionalities and workflow of your Java program, providing a clear understanding of how the program operates.
