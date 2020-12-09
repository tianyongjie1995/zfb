package com.qf.service.impl;

import com.qf.common.BaseResp;
import com.qf.dao.BookRespository;
import com.qf.pojo.Book;
import com.qf.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * @USER: Tian
 * @DATE: 2020/12/6 15:26
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRespository bookRespository;
    BaseResp baseResp = new BaseResp();
    @Override
    public BaseResp findAll(Integer page, Integer size) {
        //设置分页
        PageRequest pageRequest = new PageRequest(page - 1, size);
        Page<Book> all = bookRespository.findAll(pageRequest);
        baseResp.setData(all.getContent());
        baseResp.setTotal(all.getTotalElements());
        baseResp.setMessage("查询成功");
        baseResp.setCode(200);
        return baseResp;
    }

    @Override
    public BaseResp findById(Integer id) {
        return null;
    }

    @Override
    public BaseResp saveOrUpdate(Book book) {
        return null;
    }

    @Override
    public BaseResp deleteById(Integer id) {
        return null;
    }
}
