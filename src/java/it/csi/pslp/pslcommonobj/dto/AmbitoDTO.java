/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DTOJediStrategy
package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;

/**
 * The Class AmbitoDTO.
 */
public class AmbitoDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The Constant COD_AMBITO_GG_GARANZIA_GIOVANI. */
    public static final String COD_AMBITO_GG_GARANZIA_GIOVANI = "GG";

    /** The Constant COD_AMBITO_RDC_REDDITO_DI_CITTADINANZA. */
    public static final String COD_AMBITO_RDC_REDDITO_DI_CITTADINANZA = "RDC";

    /** The Constant COD_AMBITO_FASCICOLO. */
    public static final String COD_AMBITO_FASCICOLO = "FASC";

    /** The Constant COD_AMBITO_COLLOCAMENTO_MIRATO. */
    public static final String COD_AMBITO_COLLOCAMENTO_MIRATO = "COMI";

    /** The Constant COD_AMBITO_COLLOCAMENTO_MIRATO DISABILI. L68 */
    public static final String COD_AMBITO_COLLOCAMENTO_MIRATO_DISABILI = "CMDIS";

    /** The Constant COD_AMBITO_COLLOCAMENTO_MIRATO CATEGORIE PROTETTE L68. */
    public static final String COD_AMBITO_COLLOCAMENTO_MIRATO_PROTETTE = "CMPRO";

    /** The id sil T in servizio. */
    private Long idSilTInServizio = null;

    /** The cod ambito. */
    // campo chiave primaria
    private String codAmbito = null;

    /** The descr ambito. */
    private String descrAmbito = null;

    /**
     * Instantiates a new ambito DTO.
     */
    public AmbitoDTO() {
    }

    /**
     * Instantiates a new ambito DTO.
     *
     * @param codAmbito the cod ambito
     */
    public AmbitoDTO(String codAmbito) {
        this.codAmbito = codAmbito;
    }

    /**
     * Gets the id sil T in servizio.
     *
     * @return the id sil T in servizio
     */
    public Long getIdSilTInServizio() {
        return idSilTInServizio;
    }

    /**
     * Gets the cod ambito.
     *
     * @return the cod ambito
     */
    public String getCodAmbito() {
        return codAmbito;
    }

    /**
     * Gets the descr ambito.
     *
     * @return the descr ambito
     */
    public String getDescrAmbito() {
        return descrAmbito;
    }

    /**
     * Sets the id sil T in servizio.
     *
     * @param idSilTInServizio the new id sil T in servizio
     */
    public void setIdSilTInServizio(Long idSilTInServizio) {
        this.idSilTInServizio = idSilTInServizio;
    }

    /**
     * Sets the cod ambito.
     *
     * @param codAmbito the new cod ambito
     */
    public void setCodAmbito(String codAmbito) {
        this.codAmbito = codAmbito;
    }

    /**
     * Sets the descr ambito.
     *
     * @param descrAmbito the new descr ambito
     */
    public void setDescrAmbito(String descrAmbito) {
        this.descrAmbito = descrAmbito;
    }

    /**
     * Gets the dto for test.
     *
     * @return the dto for test
     */
    public static AmbitoDTO getDtoForTest() {
        return new AmbitoDTO();
    }

} // fine classe
