package io.jpress.module.article.model;

import io.jboot.db.annotation.Table;
import io.jpress.core.support.smartfield.SmartField;
import io.jpress.module.article.model.base.BaseArticleMetaInfo;

/**
 * Generated by Jboot.
 */
@Table(tableName = "article_meta_info", primaryKey = "id")
public class ArticleMetaInfo extends BaseArticleMetaInfo<ArticleMetaInfo> {

    /**
     * 默认的排序值
     */
    private static final int DEFAULT_ORDER_NUMBER = 100;
    private static final String FIELD_NAME_PREFIX = "articleMeta.";

    public SmartField toSmartField() {
        SmartField smartField = new SmartField();
        smartField.setOrderNo(getOrderNo() == null ? DEFAULT_ORDER_NUMBER : getOrderNo());
        smartField.setAttrs(getAttrs());
        smartField.setHelpText(getHelpText());
        smartField.setId(getFieldId());
        smartField.setName(buildFieldName(this));
        smartField.setLabel(getLabel());
        smartField.setPlaceholder(getPlaceholder());
        smartField.setType(getType());
        smartField.setValue(getValue());
        smartField.setValueText(getValueText());
        return smartField;
    }

    public static String buildFieldName(ArticleMetaInfo info) {
        return FIELD_NAME_PREFIX + info.getFieldName();
    }

    public Boolean isEnable() {
        return getEnable() != null && getEnable();
    }
}
