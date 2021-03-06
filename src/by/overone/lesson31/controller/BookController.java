package by.overone.lesson31.controller;

import by.overone.lesson31.entity.Book;
import by.overone.lesson31.exception.BookNotFoundException;
import by.overone.lesson31.service.IBookService;
import by.overone.lesson31.service.impl.BookService;

import java.util.List;
import java.util.Scanner;

public class BookController {

    private static final IBookService bookService = new BookService();

    public void mainMenu() {
        boolean flag = true;

        while (flag) {
            System.out.println("Select one of the following option:\n");
            System.out.println("1. Get all books");
            System.out.println("2. Get book by author");
            System.out.println("3. Add book");
            System.out.println("4. Exit");
            int result = new Scanner(System.in).nextInt();
            switch (result) {
                case 1:
                    readAll();
                    break;
                case 2:
                    readByAuthor();
                    break;
                case 3:
                    addBook();
                    break;
                case 4:
                    System.out.println("Bye-bye my dear friend");
                    flag = false;
                    break;
                default:
                    System.err.println("Something went wrong ..");
            }
        }
    }

    public void readAll() {
        List<Book> books = bookService.readAll();
        viewBooks(books);
        boolean flag = true;
        while (flag) {
            System.out.println("Select one of the following book:");
            int bookId = new Scanner(System.in).nextInt();
            System.out.println("1. Update book");
            System.out.println("2. Delete book");
            System.out.println("3. Exit");
            int action = new Scanner(System.in).nextInt();
            switch (action) {
                case 1:
                    updateBook(bookId);
                    flag = false;
                    break;
                case 2:
                    deleteBook(bookId);
                    flag = false;
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    flag = false;
                    System.err.println("Something went wrong ..");
            }
        }
    }


    public void updateBook(int bookId) {

        System.out.println("Select one of the following columns");
        System.out.println("1.Quantity");
        System.out.println("2.Exit");
        int action1 = new Scanner(System.in).nextInt();
        List<Book> books = bookService.readAll();
        Book oldQuantity = books.get(bookId - 1);
        System.out.println(books.get(bookId-1));
        System.out.println(oldQuantity.getQuantity());
        long quantity = oldQuantity.getQuantity();
        switch (action1) {
            case 1:
                System.out.println("Enter new quantity");
                int scanner = new Scanner(System.in).nextInt();
                if (scanner>=0){
                    quantity=scanner;
                }
                else {
                    System.out.println("Invalid quantity");
                    quantity=oldQuantity.getQuantity();
                }
                break ;
            case 2:
                System.out.println("Exit update");
                break;
            default:
                System.err.println("No such action.");
        }
        try {
            bookService.updateBook(bookId, quantity);
        } catch (BookNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    public void deleteBook(int bookId) {
        try {
            bookService.deleteBook(bookId);
            readAll();

        } catch (BookNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }


    public void addBook() {
        System.out.println("Enter the title of the book");
        String title = new Scanner(System.in).nextLine();
        System.out.println("Enter author");
        String author = new Scanner(System.in).nextLine();
        System.out.println("Enter the number of books");
        Long quantity = new Scanner(System.in).nextLong();
        try {
            bookService.addBook(title, author, quantity);
            readAll();
        } catch (BookNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    public void readByAuthor() {
        System.out.println("Write author: ");
        String authorName = new Scanner(System.in).nextLine();
        List<Book> books = null;
        try {
            books = bookService.readByAuthor(authorName);
        } catch (BookNotFoundException e) {
            System.err.println(e.getMessage());
        }
        viewBooks(books);
    }

    private void viewBooks(List<Book> books) {
        if (books != null) {
            int counter = 1;
            for (Book book : books) {
                System.out.println(counter + ". " + book);
                counter++;
            }
        }
    }
}
