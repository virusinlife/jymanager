package com.demo.model;

import java.math.BigDecimal;
import java.util.Date;

public class TYs {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ys.id
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ys.ys_type
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    private String ys_type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ys.ys_name
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    private String ys_name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ys.ys_subname
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    private String ys_subname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ys.item_name
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    private String item_name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ys.item_year
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    private String item_year;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ys.item_buy_way
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    private String item_buy_way;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ys.item_tax
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    private Integer item_tax;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ys.item_cur_amount
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    private BigDecimal item_cur_amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ys.item_next_amount
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    private BigDecimal item_next_amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ys.item_own_user
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    private String item_own_user;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ys.item_input_datetime
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    private Date item_input_datetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ys.item_input_user
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    private String item_input_user;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ys.isvalid
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    private String isvalid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ys.id
     *
     * @return the value of t_ys.id
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ys.id
     *
     * @param id the value for t_ys.id
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ys.ys_type
     *
     * @return the value of t_ys.ys_type
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public String getYs_type() {
        return ys_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ys.ys_type
     *
     * @param ys_type the value for t_ys.ys_type
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public void setYs_type(String ys_type) {
        this.ys_type = ys_type == null ? null : ys_type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ys.ys_name
     *
     * @return the value of t_ys.ys_name
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public String getYs_name() {
        return ys_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ys.ys_name
     *
     * @param ys_name the value for t_ys.ys_name
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public void setYs_name(String ys_name) {
        this.ys_name = ys_name == null ? null : ys_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ys.ys_subname
     *
     * @return the value of t_ys.ys_subname
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public String getYs_subname() {
        return ys_subname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ys.ys_subname
     *
     * @param ys_subname the value for t_ys.ys_subname
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public void setYs_subname(String ys_subname) {
        this.ys_subname = ys_subname == null ? null : ys_subname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ys.item_name
     *
     * @return the value of t_ys.item_name
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public String getItem_name() {
        return item_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ys.item_name
     *
     * @param item_name the value for t_ys.item_name
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public void setItem_name(String item_name) {
        this.item_name = item_name == null ? null : item_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ys.item_year
     *
     * @return the value of t_ys.item_year
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public String getItem_year() {
        return item_year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ys.item_year
     *
     * @param item_year the value for t_ys.item_year
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public void setItem_year(String item_year) {
        this.item_year = item_year == null ? null : item_year.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ys.item_buy_way
     *
     * @return the value of t_ys.item_buy_way
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public String getItem_buy_way() {
        return item_buy_way;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ys.item_buy_way
     *
     * @param item_buy_way the value for t_ys.item_buy_way
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public void setItem_buy_way(String item_buy_way) {
        this.item_buy_way = item_buy_way == null ? null : item_buy_way.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ys.item_tax
     *
     * @return the value of t_ys.item_tax
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public Integer getItem_tax() {
        return item_tax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ys.item_tax
     *
     * @param item_tax the value for t_ys.item_tax
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public void setItem_tax(Integer item_tax) {
        this.item_tax = item_tax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ys.item_cur_amount
     *
     * @return the value of t_ys.item_cur_amount
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public BigDecimal getItem_cur_amount() {
        return item_cur_amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ys.item_cur_amount
     *
     * @param item_cur_amount the value for t_ys.item_cur_amount
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public void setItem_cur_amount(BigDecimal item_cur_amount) {
        this.item_cur_amount = item_cur_amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ys.item_next_amount
     *
     * @return the value of t_ys.item_next_amount
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public BigDecimal getItem_next_amount() {
        return item_next_amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ys.item_next_amount
     *
     * @param item_next_amount the value for t_ys.item_next_amount
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public void setItem_next_amount(BigDecimal item_next_amount) {
        this.item_next_amount = item_next_amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ys.item_own_user
     *
     * @return the value of t_ys.item_own_user
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public String getItem_own_user() {
        return item_own_user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ys.item_own_user
     *
     * @param item_own_user the value for t_ys.item_own_user
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public void setItem_own_user(String item_own_user) {
        this.item_own_user = item_own_user == null ? null : item_own_user.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ys.item_input_datetime
     *
     * @return the value of t_ys.item_input_datetime
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public Date getItem_input_datetime() {
        return item_input_datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ys.item_input_datetime
     *
     * @param item_input_datetime the value for t_ys.item_input_datetime
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public void setItem_input_datetime(Date item_input_datetime) {
        this.item_input_datetime = item_input_datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ys.item_input_user
     *
     * @return the value of t_ys.item_input_user
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public String getItem_input_user() {
        return item_input_user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ys.item_input_user
     *
     * @param item_input_user the value for t_ys.item_input_user
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public void setItem_input_user(String item_input_user) {
        this.item_input_user = item_input_user == null ? null : item_input_user.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ys.isvalid
     *
     * @return the value of t_ys.isvalid
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public String getIsvalid() {
        return isvalid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ys.isvalid
     *
     * @param isvalid the value for t_ys.isvalid
     *
     * @mbggenerated Mon Apr 25 19:27:18 GMT+08:00 2016
     */
    public void setIsvalid(String isvalid) {
        this.isvalid = isvalid == null ? null : isvalid.trim();
    }
}