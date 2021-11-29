/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;

/**
 * The Class MailPlaceholder.
 */
public class MailPlaceholder implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new mail placeholder.
     */
    public MailPlaceholder() {

    }

    /** The index. */
    int index;
    
    /** The label. */
    String label;
    
    /** The value. */
    Object value;

    /**
     * Gets the index.
     *
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the index.
     *
     * @param index the new index
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * Gets the label.
     *
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the label.
     *
     * @param label the new label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    public Object getValue() {
        return value;
    }

    /**
     * Sets the value.
     *
     * @param value the new value
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("MailPlaceholder [index=");
        builder.append(index);
        builder.append(", ");
        if (label != null) {
            builder.append("label=");
            builder.append(label);
            builder.append(", ");
        }
        if (value != null) {
            builder.append("value=");
            builder.append(value);
        }
        builder.append("]");
        return builder.toString();
    }
}