package com.test.common.persistence;

import com.test.common.utils.IdGen;

import java.util.Date;

public class DataEntity<T> extends BaseEntity<T> {
    private static final long serialVersionUID = -1077452057738335144L;
    private String remarks;
    private String createBy;
    private Date createDate;
    private String updateBy;
    private Date updateDate;
    private String delFlag;

    public DataEntity() {
    }

    @Override
    public void preInsert(){
        setId(IdGen.uuid());
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

}
