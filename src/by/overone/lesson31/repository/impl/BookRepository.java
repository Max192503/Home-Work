package by.overone.lesson31.repository.impl;

import by.overone.lesson31.entity.Book;
import by.overone.lesson31.repository.IBookRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookRepository implements IBookRepository {
    @Override
    public List<Book> readAll() {
        List<Book> books = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/library",
                            "root", "192503");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SElECT * FROM library.library");
            while (resultSet.next()) {
                Long bookId = Long.valueOf(resultSet.getString(1));
                String title = resultSet.getString(2);
                String author = resultSet.getString(3);
                Long quantity = Long.valueOf(resultSet.getString(4));
                books.add(new Book(bookId, title, author, quantity));
            }
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return books;
    }

    @Override
    public List<Book> readByAuthor(String authorName) {
        List<Book> books = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library",
                    "root", "192503");
            PreparedStatement preparedStatement =
                    connection.prepareStatement("SELECT * FROM library.library WHERE author = ?");
            preparedStatement.setString(1, authorName);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Long bookId = Long.valueOf(resultSet.getString(1));
                String title = resultSet.getString(2);
                String author = resultSet.getString(3);
                Long quantity = Long.valueOf(resultSet.getString(4));
                books.add(new Book(bookId, title, author, quantity));
            }
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return books;
    }

    @Override
    public void addBook(String title, String author, Long quantity) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library",
                    "root", "192503");
            PreparedStatement preparedStatement =
                    connection.prepareStatement("INSERT library (title,author,quantity) VALUES (?,?,?)");
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, author);
            preparedStatement.setLong(3, quantity);
            preparedStatement.executeUpdate();
            connection.close();
            System.out.println("Book added.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteBook(int bookId) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library",
                    "root", "192503");
            PreparedStatement preparedStatement =
                    connection.prepareStatement("DELETE FROM library where id=?");
            preparedStatement.setLong(1, bookId);
            preparedStatement.executeUpdate();
            connection.close();
            System.out.println("Book deleted.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateBook(int bookId, long quantity) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library",
                    "root", "192503");
            PreparedStatement preparedStatement =
                    connection.prepareStatement("UPDATE library SET quantity=? Where id=?");
            preparedStatement.setLong(1, quantity);
            preparedStatement.setLong(2, bookId);
            preparedStatement.executeUpdate();
            connection.close();
            System.out.println("Number of copies changed.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
