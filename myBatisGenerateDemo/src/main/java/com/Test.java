package com;

import java.util.Date;

public class Test {
    private Long id;

    private String code;

    private String name;

    private Boolean type;

    private Long amount;

    private Long bigAmount;

    private Date createTime;

    public Test(Long id, String code, String name, Boolean type, Long amount, Long bigAmount, Date createTime) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.bigAmount = bigAmount;
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Boolean getType() {
        return type;
    }

    public Long getAmount() {
        return amount;
    }

    public Long getBigAmount() {
        return bigAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }
}