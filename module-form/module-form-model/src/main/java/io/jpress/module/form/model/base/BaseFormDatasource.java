package io.jpress.module.form.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseFormDatasource<M extends BaseFormDatasource<M>> extends JbootModel<M> implements IBean {

    private static final long serialVersionUID = 1L;

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return getLong("id");
	}

    /**
     * 数据源名称
     */
	public void setName(java.lang.String name) {
		set("name", name);
	}

    /**
     * 数据源名称
     */
	public java.lang.String getName() {
		return getStr("name");
	}

    /**
     * 导入类型 1 一行一个内容  2 json 内容 3 动态 json URL
     */
	public void setImportType(java.lang.Integer importType) {
		set("import_type", importType);
	}

    /**
     * 导入类型 1 一行一个内容  2 json 内容 3 动态 json URL
     */
	public java.lang.Integer getImportType() {
		return getInt("import_type");
	}

    /**
     * 导入内容
     */
	public void setImportText(java.lang.String importText) {
		set("import_text", importText);
	}

    /**
     * 导入内容
     */
	public java.lang.String getImportText() {
		return getStr("import_text");
	}

    /**
     * 动态导入时，配置的 headers
     */
	public void setHeaders(java.lang.String headers) {
		set("headers", headers);
	}

    /**
     * 动态导入时，配置的 headers
     */
	public java.lang.String getHeaders() {
		return getStr("headers");
	}

    /**
     * 是否级联
     */
	public void setWithCascade(java.lang.Boolean withCascade) {
		set("with_cascade", withCascade);
	}

    /**
     * 是否级联
     */
	public java.lang.Boolean getWithCascade() {
		return getBoolean("with_cascade");
	}

    /**
     * 是否是静态内容
     */
	public void setWithStatic(java.lang.Boolean withStatic) {
		set("with_static", withStatic);
	}

    /**
     * 是否是静态内容
     */
	public java.lang.Boolean getWithStatic() {
		return getBoolean("with_static");
	}

    /**
     * 创建时间
     */
	public void setCreated(java.util.Date created) {
		set("created", created);
	}

    /**
     * 创建时间
     */
	public java.util.Date getCreated() {
		return getDate("created");
	}

    /**
     * 修改时间
     */
	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}

    /**
     * 修改时间
     */
	public java.util.Date getModified() {
		return getDate("modified");
	}

    /**
     * json 扩展
     */
	public void setOptions(java.lang.String options) {
		set("options", options);
	}

    /**
     * json 扩展
     */
	public java.lang.String getOptions() {
		return getStr("options");
	}

    /**
     * 站点ID
     */
	public void setSiteId(java.lang.Long siteId) {
		set("site_id", siteId);
	}

    /**
     * 站点ID
     */
	public java.lang.Long getSiteId() {
		return getLong("site_id");
	}

}

