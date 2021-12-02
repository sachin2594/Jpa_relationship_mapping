package com.hibernate.repository;

import com.hibernate.dto.OrderResponse;
import com.hibernate.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query("select new com.hibernate.dto.OrderResponse(c.name , p.productName) from Customer c JOIN c.productList p")
    public List<OrderResponse> getJoinInformation();

    //join Query by using Spring data JPA
}
