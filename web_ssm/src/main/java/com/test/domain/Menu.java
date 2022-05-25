package com.test.domain;

import com.test.common.persistence.DataEntity;

public class Menu extends DataEntity<Menu> {
    private static final long serialVersionUID = -5442887817379935242L;
    private String parentId;
    private String parentIds;
    private String name;
    private String sort;
    private String href;
    private String target;
    private String icon;
    private String isShow;

    public Menu() {
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "parentId='" + parentId + '\'' +
                ", parentIds='" + parentIds + '\'' +
                ", name='" + name + '\'' +
                ", sort='" + sort + '\'' +
                ", href='" + href + '\'' +
                ", target='" + target + '\'' +
                ", icon='" + icon + '\'' +
                ", isShow='" + isShow + '\'' +
                '}';
    }
}
