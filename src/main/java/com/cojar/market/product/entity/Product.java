package com.cojar.market.product.entity;

import com.cojar.market.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Setter
@Getter
public class Product extends BaseEntity {

    private int marketId;
    private String name;
    private int price;
    private int hitCount;
    private String isActive;
    private String Description;

}
