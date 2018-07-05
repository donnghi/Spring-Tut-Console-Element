package com.mkyong.common;

public interface ICustomerDAO
{
    public void insert(Customer customer);
    public Customer findByCustomerId(int custId);
}
