package com;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;
@Data
public class Test {
    private Long id;

    private String code;

    private String name;

    private Boolean type;

    private Long amount;

    private Long bigAmount;

    private Date createTime;

}