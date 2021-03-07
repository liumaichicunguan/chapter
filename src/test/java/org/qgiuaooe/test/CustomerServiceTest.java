package org.qgiuaooe.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.qgiuaooe.helper.DatabaseHelper;
import org.qgiuaooe.model.Customer;
import org.qgiuaooe.service.CustomerService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class CustomerServiceTest extends BaseTest{

    private final CustomerService customerService;

    public CustomerServiceTest() {
        customerService = new CustomerService();
    }

    @Before
    public void init() {
        executeSqlFile("sql/customer_init.sql");
    }

    @Test
    public void getCustomerListTest() {
        List<Customer> lists = customerService.getCustomerList();
        System.out.println(lists.size());
        Assert.assertEquals(2, lists.size());
    }

    @Test
    public void getCustomerTest() {
        long id = 1;
        Customer customer = customerService.getCustomer(id);
        System.out.println(customer.getEmail());
        Assert.assertEquals("aaa", customer.getName());
    }
}
