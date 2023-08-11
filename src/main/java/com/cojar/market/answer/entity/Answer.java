package com.cojar.market.answer.entity;

import com.cojar.market.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Answer extends BaseEntity {

    private int memberId;
    private int questionId;
    private String comment;
}
