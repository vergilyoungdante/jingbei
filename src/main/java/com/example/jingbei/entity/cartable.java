package com.example.jingbei.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class cartable {

    @Id
    @Column(length = 11)
    private long id;

    @Column(length = 11)
    private long busertable_id;

    @Column(length = 11)
    private long goodstable_id;

    @Column(length = 11)
    private long shoppingnum;
}
