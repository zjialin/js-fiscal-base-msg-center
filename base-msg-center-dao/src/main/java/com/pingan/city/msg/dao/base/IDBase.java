package com.pingan.city.msg.dao.base;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
public class IDBase {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;
}
