package com.wuzixuan.makelogfile.bean;

import java.io.Serializable;

public class ChannelMemoBean implements Serializable {
    private String  ChannelMemoID;
    private String ChannelName_ZH ;
    private String ChannelName_EN ;
    private String  Channel_Level;
    private String Parent_Channel_id ;
    private String UpdateTime ;
    private String  UpdateBy;
    private String CreateBy ;
    private String CreateDate ;
    private String deletionflag;

    public String getChannelMemoID() {
        return ChannelMemoID;
    }

    public void setChannelMemoID(String channelMemoID) {
        ChannelMemoID = channelMemoID;
    }

    public String getChannelName_ZH() {
        return ChannelName_ZH;
    }

    public void setChannelName_ZH(String channelName_ZH) {
        ChannelName_ZH = channelName_ZH;
    }

    public String getChannelName_EN() {
        return ChannelName_EN;
    }

    public void setChannelName_EN(String channelName_EN) {
        ChannelName_EN = channelName_EN;
    }

    public String getChannel_Level() {
        return Channel_Level;
    }

    public void setChannel_Level(String channel_Level) {
        Channel_Level = channel_Level;
    }

    public String getParent_Channel_id() {
        return Parent_Channel_id;
    }

    public void setParent_Channel_id(String parent_Channel_id) {
        Parent_Channel_id = parent_Channel_id;
    }

    public String getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(String updateTime) {
        UpdateTime = updateTime;
    }

    public String getUpdateBy() {
        return UpdateBy;
    }

    public void setUpdateBy(String updateBy) {
        UpdateBy = updateBy;
    }

    public String getCreateBy() {
        return CreateBy;
    }

    public void setCreateBy(String createBy) {
        CreateBy = createBy;
    }

    public String getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(String createDate) {
        CreateDate = createDate;
    }

    public String getDeletionflag() {
        return deletionflag;
    }

    public void setDeletionflag(String deletionflag) {
        this.deletionflag = deletionflag;
    }
}
