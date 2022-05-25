package com.test.common.persistence;

import java.util.List;

public interface CrudDao<T> extends BaseDao<T> {
    public List<T> findAllList();
}
