/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.project.tables.records;


import com.tencent.devops.model.project.tables.TProjectLabel;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 项目标签信息表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TProjectLabelRecord extends UpdatableRecordImpl<TProjectLabelRecord> implements Record4<String, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = -419006095;

    /**
     * Setter for <code>devops_project.T_PROJECT_LABEL.ID</code>. 主键
     */
    public TProjectLabelRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.T_PROJECT_LABEL.ID</code>. 主键
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>devops_project.T_PROJECT_LABEL.LABEL_NAME</code>. 标签名称
     */
    public TProjectLabelRecord setLabelName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.T_PROJECT_LABEL.LABEL_NAME</code>. 标签名称
     */
    public String getLabelName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>devops_project.T_PROJECT_LABEL.CREATE_TIME</code>. 创建时间
     */
    public TProjectLabelRecord setCreateTime(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.T_PROJECT_LABEL.CREATE_TIME</code>. 创建时间
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>devops_project.T_PROJECT_LABEL.UPDATE_TIME</code>. 更新时间
     */
    public TProjectLabelRecord setUpdateTime(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.T_PROJECT_LABEL.UPDATE_TIME</code>. 更新时间
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TProjectLabel.T_PROJECT_LABEL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TProjectLabel.T_PROJECT_LABEL.LABEL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field3() {
        return TProjectLabel.T_PROJECT_LABEL.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field4() {
        return TProjectLabel.T_PROJECT_LABEL.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getLabelName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value3() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value4() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProjectLabelRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProjectLabelRecord value2(String value) {
        setLabelName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProjectLabelRecord value3(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProjectLabelRecord value4(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProjectLabelRecord values(String value1, String value2, LocalDateTime value3, LocalDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TProjectLabelRecord
     */
    public TProjectLabelRecord() {
        super(TProjectLabel.T_PROJECT_LABEL);
    }

    /**
     * Create a detached, initialised TProjectLabelRecord
     */
    public TProjectLabelRecord(String id, String labelName, LocalDateTime createTime, LocalDateTime updateTime) {
        super(TProjectLabel.T_PROJECT_LABEL);

        set(0, id);
        set(1, labelName);
        set(2, createTime);
        set(3, updateTime);
    }
}