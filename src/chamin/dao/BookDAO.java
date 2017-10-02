/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chamin.dao;

import chamin.data.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Chamin
 */
public class BookDAO {

    private final Connection myConn;

    public BookDAO(Connection myConn) {
        this.myConn = myConn;
    }

    public List<Book> getAllbook() throws SQLException {

        List<Book> list = new ArrayList<Book>();
        Statement myStmnt = null;
        ResultSet myRslt = null;

        try {
            myStmnt = myConn.createStatement();
            myRslt = myStmnt.executeQuery("select * from book");

            // load each club object to the club List
            while (myRslt.next()) {
                Book tempBook = convertRawToBook(myRslt);
                list.add(tempBook);
            }
            return list;
        } finally {
            close(myStmnt, myRslt);
        }
    }
    
  // add a new book
    public void addBook(Book book) throws SQLException {
        PreparedStatement myStmnt = null;

        try {
            String query = "INSERT INTO book (bookId,keeperId,title,authorName,ISBN,Subject,language) values (?,?,?,?,?,?,?)";
            myStmnt = myConn.prepareStatement(query);
            System.out.println("create my stmnt");
            //set parameters

            myStmnt.setString(1, book.getBooId());
            myStmnt.setString(2, book.getKeeperId());
            myStmnt.setString(3, book.getTitle());
            myStmnt.setString(4, book.getAuthorName());
            myStmnt.setString(5, book.getISBN());
            myStmnt.setString(6, book.getsubject());
            myStmnt.setString(7, book.getLanguage());
            

            myStmnt.executeUpdate();
            System.out.println(" book Successfully added");

        } finally {
            close(myStmnt);

        }

    } 
    
    
    
// search books  by keyword
    public Book searchBook(String keyWord) throws SQLException {

        PreparedStatement myStmnt = null;
        ResultSet myRslt = null;
        String query = null;
        try {

            query = "SELECT * from book where bookId = ? ";
            myStmnt = myConn.prepareStatement(query);
            myStmnt.setString(1, keyWord);

            myRslt = myStmnt.executeQuery();
            System.out.println("in search book ");
            myRslt.next();

            Book tempBook = convertRawToBook(myRslt);

            return tempBook;
        } finally {
            close(myStmnt, myRslt);
        }

    }
    
    public void updateKeeper(Book recievingBook){
        
        
    }
    
    public void updateBook(Book book,String preiviousId) throws SQLException{
        PreparedStatement myStmnt = null;
        try {
            //prepare the statement
            String query = "UPDATE book set bookId=?, keeperId=?, title=?, authorName=?, ISBN=?, Subject=?, language=? WHERE bookId =?";
            myStmnt = myConn.prepareStatement(query);
            // set params
             myStmnt.setString(1, book.getBooId());
            myStmnt.setString(2, book.getKeeperId());
            myStmnt.setString(3, book.getTitle());
            myStmnt.setString(4, book.getAuthorName());
            myStmnt.setString(5, book.getISBN());
            myStmnt.setString(6, book.getsubject());
            myStmnt.setString(7, book.getLanguage());
            myStmnt.setString(8, preiviousId);

            //execute statement
            myStmnt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Book updated succesfully", "Update", JOptionPane.INFORMATION_MESSAGE);

        } finally {
            close(myStmnt);
        }
        
        
    }
    private Book convertRawToBook(ResultSet myRslt) throws SQLException {

        String bookId = myRslt.getString(1);
        
        String keeperId = myRslt.getString(2);
        
        String title = myRslt.getString(3);
        String authorName = myRslt.getString(4);
        String ISBN = myRslt.getString(5);
        String subject = myRslt.getString(6);
        String language = myRslt.getString(7);

        Book tempBook = new Book(bookId, keeperId, title, authorName, ISBN, subject, language);
        return tempBook;

    }

    public void close(Connection myConn, Statement myStmt, ResultSet myRs) throws SQLException {

        if (myRs != null) {
            myRs.close();
        }

        if (myStmt != null) {

        }

        if (myConn != null) {
            myConn.close();
        }
    }

    public void close(Statement myStmt, ResultSet myRs) throws SQLException {
        close(null, myStmt, myRs);
    }

    public void close(Statement myStmt) throws SQLException {
        close(null, myStmt, null);
    }

    public void deleteBook(String booId) {
        
        
        
        
        
        
    }

    

}
