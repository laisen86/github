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

    public Test() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getBigAmount() {
        return bigAmount;
    }

    public void setBigAmount(Long bigAmount) {
        this.bigAmount = bigAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}