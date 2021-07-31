package com.example.jingbei.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "goodstable")
public class goods {

    @Id
    private long id;

    @Column(length = 50)
    private String gname;

    private double goprice;

    private double grprice;

    @Column(length = 11)
    private long gstore;

    @Column(length = 50)
    private String gpicture;

    @Column(length = 2)
    private int isRecommend;

    @Column(length = 2)
    private int isAdvertisement;

    @Column(length = 11)
    private int goodstype_id;
}
