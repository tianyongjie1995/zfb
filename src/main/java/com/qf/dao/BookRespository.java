package com.qf.dao;

import com.qf.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @USER: Tian
 * @DATE: 2020/12/6 15:46
 */
public interface BookRespository extends JpaRepository<Book,Integer> {
}
