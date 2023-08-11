package com.cojar.market.question.entity;

import com.cojar.market.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Question extends BaseEntity {

    private int memberId;
    private String title;
    private String content;


}
