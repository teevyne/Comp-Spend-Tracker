package com.springlearning.expensetracker.service;

import com.springlearning.expensetracker.domain.User;
import com.springlearning.expensetracker.exception.EtAuthException;

public interface UserService {

    User validateUser (String email, String password) throws EtAuthException;

    User registerUser (String firstName, String lastName, String email, String password) throws EtAuthException;
}
