package com.springlearning.expensetracker.repository;

import com.springlearning.expensetracker.domain.User;
import com.springlearning.expensetracker.exception.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
