package com.qf.controller;

import com.qf.common.BaseResp;
import com.qf.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@CrossOrigin
public class BookController {
    @Autowired
    BookService bookService;
    BaseResp baseResp = new BaseResp();
    @RequestMapping(value = "/findAll/{page}/{size}",method = RequestMethod.GET)
    public BaseResp findAll(@PathVariable("page")Integer page,@PathVariable("size")Integer size){
        return bookService.findAll(page,size);
    }
}
