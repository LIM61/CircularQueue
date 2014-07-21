import java.util.Scanner;

public class CircularQueue {

private int head, tail;
private String [ ] q = new String [ 10 ];
private String name;
int Size;
Scanner input = new Scanner (System.in); // standard input 

public CircularQueue () { // construction initialize variable
    head = -1;
    tail = -1;
} // end construction

public void insertQueue () {
    if (isQueueFull () )
        System.out.println ("Overflow");
    else {
        name = getName ();
        if (isQueueEmpty () ) /** tail is done by algorithm. */
            head = +1; // head = head + 1
        if (tail==Size-1) /** Wrap */
            tail=-1; // tail = tail - 1
        q [++ tail] = name;
    } // end else
} // end insertQueue
public void deleteQueue() {
    String x; // print output person
    if ( isQueueEmpty () ) // service head
        System.out.println("Underflow");
    else {
        x=q[head];
        System.out.println ("Servicing " + x);
        if (head==tail) { // just emptied queue
            head=-1;
            tail=-1;
        } // end -1
        else { // rest of delete queue
            head ++; // head = head +1
            if (head==Size) // wrap around
                head=0;
        } // end inner else
    } // end outer else
} // end deleteQueue
public void setSize(int i)
{
    Size=i;
}
private String getName () {
    System.out.println("Enter name");
    return input.nextLine ();
} // end getName
public boolean isQueueEmpty () { // check empty, check head
    return (head==-1);
} // end isQueueEmpty
public boolean isQueueFull () {
    return ((tail-head+1==0) || (tail-head+1==Size));
} // end isQueueFull
public void printQueueLogical () {
    int next;
    if (isQueueEmpty())
        System.out.println ("Empty");
    else {
        next=head;
        System.out.println (" q [" + next + "] = " +q[next]);
        while (next != tail) { // while next is not equal to the tail
            next ++; // next = next + 1
            if (next==Size)
                next=0; // if next is equal to the Size, next = 0
            System.out.println (" q [" + next + "] = " +q[next]);
        } // end else
    } // end while
} // end printQueueLogical
public void printQueuePhysical () {
    for (int J = 0; J < Size; J++)
        System.out.println (" q [" + J + "]= " + q [J]);
} // end printQueuePhysical

} // end class CircularQueue
