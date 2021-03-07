package org.qgiuaooe.service;

import org.qgiuaooe.helper.DatabaseHelper;
import org.qgiuaooe.model.Customer;
import org.qgiuaooe.utils.PropsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);



    public List<Customer> getCustomerList() {
        String sql = "select * from customer";
        List<Customer> lists =  DatabaseHelper.queryEntityList(Customer.class, sql);
        return lists;
    }

    /**
     * 获取客户列表
     * @param keyword
     * @return
     */
    public ArrayList<Customer> getCustomerList(String keyword) {
        return null;
    }

    /**
     * 根据主键获取ID
     * @param id
     * @return
     */
    public Customer getCustomer(long id) {
        String sql = "select * from customer where id = ?";
        Customer customer = DatabaseHelper.queryEntity(Customer.class, sql, id);
        return customer;
    }

    /**
     * 创建客户
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(HashMap<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    /**
     * 更新客户
     * @param id
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(long id, HashMap<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    /**
     * 删除客户
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
