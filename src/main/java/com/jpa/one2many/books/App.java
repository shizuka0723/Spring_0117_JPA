package com.jpa.one2many.books;

import com.jpa.one2many.books.entity.Book;
import com.jpa.one2many.books.entity.Page;
import com.jpa.one2many.books.service.BooksService;
import java.util.Set;
import java.util.stream.StreamSupport;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    static BooksService service;
    static {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.jpa");
        appContext.refresh();
        service = (BooksService)appContext.getBean("booksService");
    }
    
    public static void main(String[] args) {
//        save();
//        System.out.println(service.getBooksRepository().findBookByIsbn("456"));
//        System.out.println(service.getBooksRepository().findBooksByAuthor("Vincent"));

//        Set<Page> pages = service.getBooksRepository().findBookByIsbn("123").getPages();
//        System.out.println(pages);
//        pages.stream().forEach(System.out::println);
        
        //尋找 有基礎、演算的書名
        StreamSupport.stream(service.getPagesRepository().findAll().spliterator(), false)
                .filter(p -> p.getContent().contains("基礎") || p.getContent().contains("演算"))
                .forEach(p -> System.out.println(p.getBook().getTitle()));
        
    }
    public static void save(){
        Book book = new Book("Java", "Vincent", "123");
        Book book2 = new Book("Python", "Anita", "456");
        
        service.getBooksRepository().save(book);
        service.getBooksRepository().save(book2);
        
        Page p1 = new Page(1, "認識Java", "一", book);
        Page p2 = new Page(10, "Java基礎", "二", book);
        Page p3 = new Page(30, "Java資料結構", "三", book);
        service.getPagesRepository().save(p1);
        service.getPagesRepository().save(p2);
        service.getPagesRepository().save(p3);
        
        service.getPagesRepository().save(new Page(1, "認識Python", "一", book2));
        service.getPagesRepository().save(new Page(15, "Python基礎語法", "二", book2));
        service.getPagesRepository().save(new Page(35, "Python演算語法", "三", book2));
    }
}
