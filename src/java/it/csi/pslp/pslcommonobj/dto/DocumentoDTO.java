/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DTOJediStrategy
package it.csi.pslp.pslcommonobj.dto;

/**
 * The Class DocumentoDTO.
 */
public class DocumentoDTO extends DocumentoHeaderDTO {

    /** The documento. */
    private byte[] documento = null;

    /**
     * Gets the documento.
     *
     * @return the documento
     */
    public byte[] getDocumento() {
        return documento;
    }

    /**
     * Sets the documento.
     *
     * @param documento the new documento
     */
    public void setDocumento(byte[] documento) {
        this.documento = documento;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DocumentoDTO [");
        if (documento != null) {
            builder.append("documento.length=");
            builder.append(documento.length);
            builder.append(", ");
        }
        if (getDocumento() != null) {
            builder.append("getDocumento()=");
            builder.append(getDocumento());
            builder.append(", ");
        }
        if (super.toString() != null) {
            builder.append("super.toString()=");
            builder.append(super.toString());
        }
        builder.append("]");
        return builder.toString();
    }

} // fine classe
