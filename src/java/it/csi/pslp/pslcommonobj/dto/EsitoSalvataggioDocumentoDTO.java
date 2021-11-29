/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

/**
 * The Class EsitoSalvataggioDocumentoDTO.
 */
public class EsitoSalvataggioDocumentoDTO extends EsitoDTO {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The documento. */
    private DocumentoDTO documento;

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("EsitoSalvataggioDocumentoDTO [");
        if (documento != null) {
            builder.append("documento=");
            builder.append(documento);
            builder.append(", ");
        }
        if (super.toString() != null) {
            builder.append("toString()=");
            builder.append(super.toString());
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * Gets the documento.
     *
     * @return the documento
     */
    public DocumentoDTO getDocumento() {
        return documento;
    }

    /**
     * Sets the documento.
     *
     * @param documento the new documento
     */
    public void setDocumento(DocumentoDTO documento) {
        this.documento = documento;
    }

}
