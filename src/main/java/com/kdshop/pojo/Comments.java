package com.kdshop.pojo;

public class Comments {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.goods_id
     *
     * @mbggenerated
     */
    private Integer goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.create_at
     *
     * @mbggenerated
     */
    private String createAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated
     */
    public Comments(Integer id, Integer userId, Integer goodsId, String createAt, String content) {
        this.id = id;
        this.userId = userId;
        this.goodsId = goodsId;
        this.createAt = createAt;
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated
     */
    public Comments() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.id
     *
     * @return the value of comments.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.id
     *
     * @param id the value for comments.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.user_id
     *
     * @return the value of comments.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.user_id
     *
     * @param userId the value for comments.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.goods_id
     *
     * @return the value of comments.goods_id
     *
     * @mbggenerated
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.goods_id
     *
     * @param goodsId the value for comments.goods_id
     *
     * @mbggenerated
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.create_at
     *
     * @return the value of comments.create_at
     *
     * @mbggenerated
     */
    public String getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.create_at
     *
     * @param createAt the value for comments.create_at
     *
     * @mbggenerated
     */
    public void setCreateAt(String createAt) {
        this.createAt = createAt == null ? null : createAt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.content
     *
     * @return the value of comments.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.content
     *
     * @param content the value for comments.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}