package com.test.common.persistence;

import java.util.List;

public interface CrudDao<T> extends BaseDao<T> {
    public List<T> findAllList();
    public int insert(T entity);
    public int delete(T entity);
}
