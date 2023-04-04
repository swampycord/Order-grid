package com.orderservicebackedn.orderservice.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class ItemOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private LocalDate date;

    @Column
    private Integer orderId;

    @Column
    private String name;

    @Column
    private Double price;

    @Column
    private Integer quantity;

    @Column
    private Double total;

    public ItemOrder(Long id, LocalDate date, Integer orderId, String name, Double price, Integer quantity, Double total) {
        this.id = id;
        this.date = date;
        this.orderId = orderId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.total = total;
    }

    public ItemOrder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
