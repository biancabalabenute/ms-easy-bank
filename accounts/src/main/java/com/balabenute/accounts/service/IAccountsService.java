package com.balabenute.accounts.service;

import com.balabenute.accounts.dto.CustomerDto;

public interface IAccountsService {

    void createAccount(CustomerDto customerDto);
}
