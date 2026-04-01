package kr.gsm.bookerp.controller;


import kr.gsm.bookerp.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController { //new BookController()
   // GET http://localhost:8080/list
   @GetMapping("/list")
   public List<Book> index(){
       Book b1=new Book(1,"자바","박매일",30000);
       Book b2=new Book(2,"인공지능","홍길동",35000);
       List<Book> list=new ArrayList<>();
       list.add(b1);
       list.add(b2);
       return list;
   }
}
