package com.example.jingbei.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="goodstype")
public class type {

    @Id
    private long id;

    @Column(length = 50)
    private String typeName;
}
