package io.jpress.module.article.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseArticleMetaInfo<M extends BaseArticleMetaInfo<M>> extends JbootModel<M> implements IBean {

	public void setId(Long id) {
		set("id", id);
	}
	
	public Long getId() {
		return getLong("id");
	}

	public void setFieldId(String fieldId) {
		set("field_id", fieldId);
	}
	
	public String getFieldId() {
		return getStr("field_id");
	}

	public void setFieldName(String fieldName) {
		set("field_name", fieldName);
	}
	
	public String getFieldName() {
		return getStr("field_name");
	}

	public void setLabel(String label) {
		set("label", label);
	}
	
	public String getLabel() {
		return getStr("label");
	}

	public void setPlaceholder(String placeholder) {
		set("placeholder", placeholder);
	}
	
	public String getPlaceholder() {
		return getStr("placeholder");
	}

	public void setHelpText(String helpText) {
		set("help_text", helpText);
	}
	
	public String getHelpText() {
		return getStr("help_text");
	}

	public void setType(String type) {
		set("type", type);
	}
	
	public String getType() {
		return getStr("type");
	}

	public void setValue(String value) {
		set("value", value);
	}
	
	public String getValue() {
		return getStr("value");
	}

	public void setValueText(String valueText) {
		set("value_text", valueText);
	}
	
	public String getValueText() {
		return getStr("value_text");
	}

	public void setAttrs(String attrs) {
		set("attrs", attrs);
	}
	
	public String getAttrs() {
		return getStr("attrs");
	}

	public void setOrderNo(Integer orderNo) {
		set("order_no", orderNo);
	}
	
	public Integer getOrderNo() {
		return getInt("order_no");
	}

	public void setEnable(Boolean enable) {
		set("enable", enable);
	}
	
	public Boolean getEnable() {
		return get("enable");
	}

	public void setRemarks(String remarks) {
		set("remarks", remarks);
	}
	
	public String getRemarks() {
		return getStr("remarks");
	}

}
