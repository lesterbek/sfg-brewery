package com.projects.sfgbrewery.service;

import com.projects.sfgbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

}
