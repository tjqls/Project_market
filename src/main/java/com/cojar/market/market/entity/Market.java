package com.cojar.market.market.entity;

import com.cojar.market.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Market extends BaseEntity {

    private int memberId;
    private String email;
    private String name;
    private String info;
}
