package kr.gsm.bookerp.controller;

import kr.gsm.bookerp.entity.Reply;
import kr.gsm.bookerp.repository.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReplyController {

    @Autowired
    private ReplyRepository repository;

    @GetMapping("/reply")
    public List<Reply> reply(){
        List<Reply> list=repository.findAll();
        return list;
    }
}
