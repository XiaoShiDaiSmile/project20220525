package com.test.common.persistence;

import java.io.Serializable;
import java.util.Map;

public abstract class BaseEntity<T> implements Serializable {
    private static final long serialVersionUID = 7658471447371062995L;
    private String id;
    private Map<String,String> sqlMap;

    public BaseEntity() {
    }
    public abstract void preInsert();
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, String> getSqlMap() {
        return sqlMap;
    }

    public void setSqlMap(Map<String, String> sqlMap) {
        this.sqlMap = sqlMap;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id='" + id + '\'' +
                ", sqlMap=" + sqlMap +
                '}';
    }
}
