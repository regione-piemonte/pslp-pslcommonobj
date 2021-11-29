/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Parametro con le informazioni relative a un cambio stato adesione ricevuto da
 * silp o da ministaro. Contiene info sul lavoratore e sui relativi incontri
 * eventuali da modificare
 * 
 * 
 * @author 1871
 *
 */

public class ParametriNotificaCambioStatoAdesione extends ParametriNotificaCambioStatoAppuntamento {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The data adesione. */
    private Date dataAdesione;
    
    /** The cod stato adesione. */
    private String codStatoAdesione;
    
    /** The identificativo sap. */
    private String identificativoSap;
    
    /** The codice ente. */
    private String codiceEnte;
    
    /** The data stato adesione. */
    private Date dataStatoAdesione;

    /** The id adesione silp. */
    private Long idAdesioneSilp;

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ParametriNotificaCambioStatoAdesione [");
        builder.append("extends=" + super.toString() + ",");
        if (dataAdesione != null) {
            builder.append("dataAdesione=");
            builder.append(dataAdesione);
            builder.append(", ");
        }
        if (codStatoAdesione != null) {
            builder.append("codStatoAdesione=");
            builder.append(codStatoAdesione);
            builder.append(", ");
        }
        if (identificativoSap != null) {
            builder.append("identificativoSap=");
            builder.append(identificativoSap);
            builder.append(", ");
        }
        if (codiceEnte != null) {
            builder.append("codiceEnte=");
            builder.append(codiceEnte);
            builder.append(", ");
        }
        if (dataStatoAdesione != null) {
            builder.append("dataStatoAdesione=");
            builder.append(dataStatoAdesione);
            builder.append(", ");
        }
        if (getIdIncontroSilp() != null) {
            builder.append("getIdIncontroSilp()=");
            builder.append(getIdIncontroSilp());
            builder.append(", ");
        }
        if (getCodStatoIncontro() != null) {
            builder.append("getCodStatoIncontro()=");
            builder.append(getCodStatoIncontro());
            builder.append(", ");
        }
        if (getIdAdesioneSilp() != null) {
            builder.append("getIdAdesioneSilp()=");
            builder.append(getIdAdesioneSilp());
            builder.append(", ");
        }
        if (getCodiceFiscaleLavoratore() != null) {
            builder.append("getCodiceFiscaleLavoratore()=");
            builder.append(getCodiceFiscaleLavoratore());
            builder.append(", ");
        }
        if (getCodiceOperatore() != null) {
            builder.append("getCodiceOperatore()=");
            builder.append(getCodiceOperatore());
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * Gets the data adesione.
     *
     * @return the data adesione
     */
    public Date getDataAdesione() {
        return dataAdesione;
    }

    /**
     * Sets the data adesione.
     *
     * @param dataAdesione the new data adesione
     */
    public void setDataAdesione(Date dataAdesione) {
        this.dataAdesione = dataAdesione;
    }

    /**
     * Gets the cod stato adesione.
     *
     * @return the cod stato adesione
     */
    public String getCodStatoAdesione() {
        return codStatoAdesione;
    }

    /**
     * Sets the cod stato adesione.
     *
     * @param codStatoAdesione the new cod stato adesione
     */
    public void setCodStatoAdesione(String codStatoAdesione) {
        this.codStatoAdesione = codStatoAdesione;
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
     * Gets the codice ente.
     *
     * @return the codice ente
     */
    public String getCodiceEnte() {
        return codiceEnte;
    }

    /**
     * Sets the codice ente.
     *
     * @param codiceEnte the new codice ente
     */
    public void setCodiceEnte(String codiceEnte) {
        this.codiceEnte = codiceEnte;
    }

    /**
     * Gets the data stato adesione.
     *
     * @return the data stato adesione
     */
    public Date getDataStatoAdesione() {
        return dataStatoAdesione;
    }

    /**
     * Sets the data stato adesione.
     *
     * @param dataStatoAdesione the new data stato adesione
     */
    public void setDataStatoAdesione(Date dataStatoAdesione) {
        this.dataStatoAdesione = dataStatoAdesione;
    }

    /**
     * Gets the id adesione silp.
     *
     * @return the id adesione silp
     */
    public Long getIdAdesioneSilp() {
        return idAdesioneSilp;
    }

    /**
     * Sets the id adesione silp.
     *
     * @param idAdesioneSilp the new id adesione silp
     */
    public void setIdAdesioneSilp(Long idAdesioneSilp) {
        this.idAdesioneSilp = idAdesioneSilp;
    }

}
