/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto.silp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The Class SendSAPResultSILPDTO.
 */
public class SendSAPResultSILPDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2755765245858336829L;

    /** The messaggi. */
    private List<MessaggioSILPDTO> messaggi = new ArrayList<MessaggioSILPDTO>();
    
    /** The validazione xsd errata. */
    private Boolean validazioneXsdErrata;
    
    /** The id interscambio SAP. */
    private Long idInterscambioSAP;
    
    /** The identificativo sap. */
    private String identificativoSap;

    /**
     * Gets the messaggi.
     *
     * @return the messaggi
     */
    public List<MessaggioSILPDTO> getMessaggi() {
        return messaggi;
    }

    /**
     * Sets the messaggi.
     *
     * @param messaggi the new messaggi
     */
    public void setMessaggi(List<MessaggioSILPDTO> messaggi) {
        this.messaggi = messaggi != null ? messaggi : new ArrayList<MessaggioSILPDTO>();
    }

    /**
     * Gets the validazione xsd errata.
     *
     * @return the validazione xsd errata
     */
    public Boolean getValidazioneXsdErrata() {
        return validazioneXsdErrata;
    }

    /**
     * Sets the validazione xsd errata.
     *
     * @param validazioneXsdErrata the new validazione xsd errata
     */
    public void setValidazioneXsdErrata(Boolean validazioneXsdErrata) {
        this.validazioneXsdErrata = validazioneXsdErrata;
    }

    /**
     * Gets the id interscambio SAP.
     *
     * @return the id interscambio SAP
     */
    public Long getIdInterscambioSAP() {
        return idInterscambioSAP;
    }

    /**
     * Sets the id interscambio SAP.
     *
     * @param idInterscambioSAP the new id interscambio SAP
     */
    public void setIdInterscambioSAP(Long idInterscambioSAP) {
        this.idInterscambioSAP = idInterscambioSAP;
    }

    /**
     * Gets the identificativo sap.
     *
     * @return the identificativo sap
     */
    public String getIdentificativoSap() {
        return identificativoSap;
    }

    /**
     * Sets the identificativo sap.
     *
     * @param identificativoSap the new identificativo sap
     */
    public void setIdentificativoSap(String identificativoSap) {
        this.identificativoSap = identificativoSap;
    }

    /**
     * Collect messaggi.
     *
     * @return the string
     */
    public String collectMessaggi() {
        return collectMessaggi(null);
    }

    /**
     * Collect messaggi.
     *
     * @param tipo the tipo
     * @return the string
     */
    public String collectMessaggi(String tipo) {
        StringBuilder sb = new StringBuilder();
        for (MessaggioSILPDTO messaggio : messaggi) {
            if (tipo == null || tipo.equals(messaggio.getTipo())) {
                sb.append(messaggio.getMessaggio());
            }
        }
        return sb.toString();
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "SendSAPResultSILPDTO [messaggi=" + messaggi + ", validazioneXsdErrata=" + validazioneXsdErrata + ", idInterscambioSAP=" + idInterscambioSAP
                + ", identificativoSap=" + identificativoSap + "]";
    }
}
