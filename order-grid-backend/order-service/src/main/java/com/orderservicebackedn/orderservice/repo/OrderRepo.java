package com.orderservicebackedn.orderservice.repo;

import com.orderservicebackedn.orderservice.model.ItemOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<ItemOrder, Long> {
}
