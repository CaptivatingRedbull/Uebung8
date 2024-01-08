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
    Object [] array;

    private int top = 0;

    public Stack(int nr) {
        array = new Object[nr];
    }

    public void push(Book element) {
        array[top++] = element;
    }

    public Book pop() {
        return (Book) array[--top];
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