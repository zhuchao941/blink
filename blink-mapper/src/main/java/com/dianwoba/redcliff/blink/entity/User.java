package com.dianwoba.redcliff.blink.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.city_id
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private Integer cityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.title
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.type
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private Byte type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.code
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.status
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.addr
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private String addr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.lng
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private Integer lng;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.lat
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private Integer lat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.tel
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.mobile
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.version
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private String version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.client
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private String client;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.imei
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private String imei;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.verified
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private Byte verified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.verified_tm
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private Date verifiedTm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.archive_status
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private Byte archiveStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.archive_time
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private Date archiveTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sign_status
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private Byte signStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sign_time
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private Date signTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.forbidden_time
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private Date forbiddenTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.remarks
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private String remarks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.balance
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private BigDecimal balance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.settle_time
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private Date settleTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.bd_id
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private Integer bdId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.platform_shopid
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private Integer platformShopid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.external_shopid
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private String externalShopid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.trading_area_id
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private Integer tradingAreaId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.region_id
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private Integer regionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.maintain_bdcode
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private String maintainBdcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.openup_bdcode
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private String openupBdcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.ins_ip
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private String insIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.ins_tm
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private Date insTm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.upd_ip
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private String updIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.upd_tm
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private Date updTm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.service_type
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private Byte serviceType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.channel_id
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private Integer channelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.shardx
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private Integer shardx;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.city_id
     *
     * @return the value of user.city_id
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.city_id
     *
     * @param cityId the value for user.city_id
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.username
     *
     * @param username the value for user.username
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.title
     *
     * @return the value of user.title
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.title
     *
     * @param title the value for user.title
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.type
     *
     * @return the value of user.type
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.type
     *
     * @param type the value for user.type
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.code
     *
     * @return the value of user.code
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.code
     *
     * @param code the value for user.code
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.status
     *
     * @return the value of user.status
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.status
     *
     * @param status the value for user.status
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.addr
     *
     * @return the value of user.addr
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public String getAddr() {
        return addr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.addr
     *
     * @param addr the value for user.addr
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.lng
     *
     * @return the value of user.lng
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public Integer getLng() {
        return lng;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.lng
     *
     * @param lng the value for user.lng
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setLng(Integer lng) {
        this.lng = lng;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.lat
     *
     * @return the value of user.lat
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public Integer getLat() {
        return lat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.lat
     *
     * @param lat the value for user.lat
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setLat(Integer lat) {
        this.lat = lat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.tel
     *
     * @return the value of user.tel
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.tel
     *
     * @param tel the value for user.tel
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.mobile
     *
     * @return the value of user.mobile
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.mobile
     *
     * @param mobile the value for user.mobile
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.version
     *
     * @return the value of user.version
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public String getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.version
     *
     * @param version the value for user.version
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.client
     *
     * @return the value of user.client
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public String getClient() {
        return client;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.client
     *
     * @param client the value for user.client
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setClient(String client) {
        this.client = client == null ? null : client.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.imei
     *
     * @return the value of user.imei
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public String getImei() {
        return imei;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.imei
     *
     * @param imei the value for user.imei
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.verified
     *
     * @return the value of user.verified
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public Byte getVerified() {
        return verified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.verified
     *
     * @param verified the value for user.verified
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setVerified(Byte verified) {
        this.verified = verified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.verified_tm
     *
     * @return the value of user.verified_tm
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public Date getVerifiedTm() {
        return verifiedTm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.verified_tm
     *
     * @param verifiedTm the value for user.verified_tm
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setVerifiedTm(Date verifiedTm) {
        this.verifiedTm = verifiedTm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.archive_status
     *
     * @return the value of user.archive_status
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public Byte getArchiveStatus() {
        return archiveStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.archive_status
     *
     * @param archiveStatus the value for user.archive_status
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setArchiveStatus(Byte archiveStatus) {
        this.archiveStatus = archiveStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.archive_time
     *
     * @return the value of user.archive_time
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public Date getArchiveTime() {
        return archiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.archive_time
     *
     * @param archiveTime the value for user.archive_time
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setArchiveTime(Date archiveTime) {
        this.archiveTime = archiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sign_status
     *
     * @return the value of user.sign_status
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public Byte getSignStatus() {
        return signStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sign_status
     *
     * @param signStatus the value for user.sign_status
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setSignStatus(Byte signStatus) {
        this.signStatus = signStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sign_time
     *
     * @return the value of user.sign_time
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public Date getSignTime() {
        return signTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sign_time
     *
     * @param signTime the value for user.sign_time
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.forbidden_time
     *
     * @return the value of user.forbidden_time
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public Date getForbiddenTime() {
        return forbiddenTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.forbidden_time
     *
     * @param forbiddenTime the value for user.forbidden_time
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setForbiddenTime(Date forbiddenTime) {
        this.forbiddenTime = forbiddenTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.remarks
     *
     * @return the value of user.remarks
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.remarks
     *
     * @param remarks the value for user.remarks
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.balance
     *
     * @return the value of user.balance
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.balance
     *
     * @param balance the value for user.balance
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.settle_time
     *
     * @return the value of user.settle_time
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public Date getSettleTime() {
        return settleTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.settle_time
     *
     * @param settleTime the value for user.settle_time
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setSettleTime(Date settleTime) {
        this.settleTime = settleTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.bd_id
     *
     * @return the value of user.bd_id
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public Integer getBdId() {
        return bdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.bd_id
     *
     * @param bdId the value for user.bd_id
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setBdId(Integer bdId) {
        this.bdId = bdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.platform_shopid
     *
     * @return the value of user.platform_shopid
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public Integer getPlatformShopid() {
        return platformShopid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.platform_shopid
     *
     * @param platformShopid the value for user.platform_shopid
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setPlatformShopid(Integer platformShopid) {
        this.platformShopid = platformShopid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.external_shopid
     *
     * @return the value of user.external_shopid
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public String getExternalShopid() {
        return externalShopid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.external_shopid
     *
     * @param externalShopid the value for user.external_shopid
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setExternalShopid(String externalShopid) {
        this.externalShopid = externalShopid == null ? null : externalShopid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.trading_area_id
     *
     * @return the value of user.trading_area_id
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public Integer getTradingAreaId() {
        return tradingAreaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.trading_area_id
     *
     * @param tradingAreaId the value for user.trading_area_id
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setTradingAreaId(Integer tradingAreaId) {
        this.tradingAreaId = tradingAreaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.region_id
     *
     * @return the value of user.region_id
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public Integer getRegionId() {
        return regionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.region_id
     *
     * @param regionId the value for user.region_id
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.maintain_bdcode
     *
     * @return the value of user.maintain_bdcode
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public String getMaintainBdcode() {
        return maintainBdcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.maintain_bdcode
     *
     * @param maintainBdcode the value for user.maintain_bdcode
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setMaintainBdcode(String maintainBdcode) {
        this.maintainBdcode = maintainBdcode == null ? null : maintainBdcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.openup_bdcode
     *
     * @return the value of user.openup_bdcode
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public String getOpenupBdcode() {
        return openupBdcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.openup_bdcode
     *
     * @param openupBdcode the value for user.openup_bdcode
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setOpenupBdcode(String openupBdcode) {
        this.openupBdcode = openupBdcode == null ? null : openupBdcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.ins_ip
     *
     * @return the value of user.ins_ip
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public String getInsIp() {
        return insIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.ins_ip
     *
     * @param insIp the value for user.ins_ip
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setInsIp(String insIp) {
        this.insIp = insIp == null ? null : insIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.ins_tm
     *
     * @return the value of user.ins_tm
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public Date getInsTm() {
        return insTm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.ins_tm
     *
     * @param insTm the value for user.ins_tm
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setInsTm(Date insTm) {
        this.insTm = insTm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.upd_ip
     *
     * @return the value of user.upd_ip
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public String getUpdIp() {
        return updIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.upd_ip
     *
     * @param updIp the value for user.upd_ip
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setUpdIp(String updIp) {
        this.updIp = updIp == null ? null : updIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.upd_tm
     *
     * @return the value of user.upd_tm
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public Date getUpdTm() {
        return updTm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.upd_tm
     *
     * @param updTm the value for user.upd_tm
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setUpdTm(Date updTm) {
        this.updTm = updTm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.service_type
     *
     * @return the value of user.service_type
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public Byte getServiceType() {
        return serviceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.service_type
     *
     * @param serviceType the value for user.service_type
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setServiceType(Byte serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.channel_id
     *
     * @return the value of user.channel_id
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.channel_id
     *
     * @param channelId the value for user.channel_id
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.shardx
     *
     * @return the value of user.shardx
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public Integer getShardx() {
        return shardx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.shardx
     *
     * @param shardx the value for user.shardx
     *
     * @mbggenerated Sat Jul 16 15:48:16 CST 2016
     */
    public void setShardx(Integer shardx) {
        this.shardx = shardx;
    }
}