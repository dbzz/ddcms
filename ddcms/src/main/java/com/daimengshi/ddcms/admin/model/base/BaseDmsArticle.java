package com.daimengshi.ddcms.admin.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDmsArticle<M extends BaseDmsArticle<M>> extends JbootModel<M> implements IBean {

    public static final String ACTION_ADD = "DmsArticle:add";
    public static final String ACTION_DELETE = "DmsArticle:delete";
    public static final String ACTION_UPDATE = "DmsArticle:update";


    @Override
    public String addAction() {
        return ACTION_ADD;
    }

    @Override
    public String deleteAction() {
        return ACTION_DELETE;
    }

    @Override
    public String updateAction() {
        return ACTION_UPDATE;
    }


	public void setId(java.lang.String id) {
		set("id", id);
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}
	
	public java.lang.String getTitle() {
		return getStr("title");
	}

	public void setContent(java.lang.String content) {
		set("content", content);
	}
	
	public java.lang.String getContent() {
		return getStr("content");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setUid(java.lang.String uid) {
		set("uid", uid);
	}
	
	public java.lang.String getUid() {
		return getStr("uid");
	}

	public void setIsOpen(java.lang.String isOpen) {
		set("is_open", isOpen);
	}
	
	public java.lang.String getIsOpen() {
		return getStr("is_open");
	}

	public void setDesc(java.lang.String desc) {
		set("desc", desc);
	}
	
	public java.lang.String getDesc() {
		return getStr("desc");
	}

	public void setUrl(java.lang.String url) {
		set("url", url);
	}
	
	public java.lang.String getUrl() {
		return getStr("url");
	}

	public void setType(java.lang.Integer type) {
		set("type", type);
	}
	
	public java.lang.Integer getType() {
		return getInt("type");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	public void setIsQuintessence(java.lang.String isQuintessence) {
		set("is_quintessence", isQuintessence);
	}
	
	public java.lang.String getIsQuintessence() {
		return getStr("is_quintessence");
	}

	public void setIsTop(java.lang.String isTop) {
		set("is_top", isTop);
	}
	
	public java.lang.String getIsTop() {
		return getStr("is_top");
	}

	public void setPv(java.lang.Integer pv) {
		set("pv", pv);
	}
	
	public java.lang.Integer getPv() {
		return getInt("pv");
	}

}
