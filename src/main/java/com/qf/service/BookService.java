package com.qf.service;

import com.qf.common.BaseResp;
import com.qf.pojo.Book;

public interface BookService {

    BaseResp findAll(Integer page,Integer size);
    BaseResp findById(Integer id);
    BaseResp saveOrUpdate(Book book);
    BaseResp deleteById(Integer id);
}
