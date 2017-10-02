/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chamin.data;

/**
 *
 * @author Chamin
 */
public class Book {
    private String booId;
    private String keeperId;
    private String title;
    private String authorName;
    private String ISBN;
    private String subject;
    private String language;
    
   

    

    public Book(String booId, String keeperId) {
        this.booId = booId;
        this.keeperId = keeperId;
    }

    public Book(String booId, String keeperId, String title, String authorName, String ISBN, String Subject, String language) {
        this.booId = booId;
        this.keeperId = keeperId;
        this.title = title;
        this.authorName = authorName;
        this.ISBN = ISBN;
        this.subject = Subject;
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getsubject() {
        return subject;
    }

    public void setsubject(String subject) {
        this.subject = subject;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    

    public String getBooId() {
        return booId;
    }

    public void setBooId(String booId) {
        this.booId = booId;
    }

    public String getKeeperId() {
        return keeperId;
    }

    public void setKeeperId(String keeperId) {
        this.keeperId = keeperId;
    }

    public String getSummary() {
        
        return null;
    }
    
}
