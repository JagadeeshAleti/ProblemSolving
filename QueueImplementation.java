import java.util.Scanner;

class Queue {
	int rear = 0,front = 0;
	int maxSize = 10;
	int[] queue = new int[maxSize];
	Scanner sc = new Scanner(System.in);

	Queue() {
		rear = -1;
		front = 0;
	}

	void insertionElement() {
		if(rear == maxSize-1)
			System.out.println("Queue is overflow!!!!!!!!");
		else {
			System.out.print("Enter Element to insert into queue : ");
			int element = sc.nextInt();
			queue[++rear] = element;
			System.out.println(element+" is inserted into queue ");
		}
	}

	void deletionElement() {
		if(front == -1 || front>rear)
			System.out.println("Queue is underflow!!!!!!!!");
		else
			System.out.println("Deleted Element from Queue is "+queue[front++]);
	}

	void displayElements() {
		if(front == - 1)
			System.out.println("Queue is empty!!!!!!!!");
	
		else {
			System.out.print("Queue Elements are : ");
			for(int i=front; i < rear; i++)
				System.out.print(queue[i]+"==>");
			System.out.print(queue[rear]);
		}
	}
}

class QueueImplementation {
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Queue  q = new Queue();
			int choice;

			do{
				System.out.println("\n\n******************* Queue Menu **********************");
				System.out.println("1.Insertion \t 2.Deletion \t 3.Display \t 4.Exit");
				System.out.print("Enter what you are to do with queue : ");
				choice = sc.nextInt();

				switch(choice) {
					case 1 : q.insertionElement();
						 break;
					case 2 : q.deletionElement();
							 break;
					case 3 : q.displayElements();
							 break;
					case 4 : System.out.println("Exiting!!!!!!!!!");
							 System.exit(0);
					default : System.out.println("Wrong choice!!!!!");
				}
			} while(choice<=4);
	}
}
