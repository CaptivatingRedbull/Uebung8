package Aufgabe2;

/* StackTest.java */
class Book {
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void print() {
        System.out.println(title + " von " + author);
    }
}

class Stack {
    Book x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12,x13,x14,x15,x16;
    Book [] array;

    private int top = 0;

    public Stack(int nr) {
        array = new Book[nr];
    }

    public void push(Book element) {
        array[top++] = element;
    }

    public Book pop() {
        return array[--top];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == array.length;
    }
}

public class StackTest {
    public static void main(String[] args) {
        Stack myList = new Stack(5);
        if (!myList.isFull()) {
            myList.push(new Book("Harry Potter", "Rowling"));
        }
        if (!myList.isFull()) {
            myList.push(new Book("Der Schwarm", "Schaetzing"));
        }
        if (!myList.isEmpty()) {
            Book element = myList.pop();
            System.out.print("Jetzt lese ich: ");
            element.print();
        }
    }

}