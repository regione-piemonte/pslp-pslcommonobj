/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * The Class TipoDocumentoEstensioneDTO.
 */
@JsonIgnoreProperties({ "keys" })
public class TipoDocumentoEstensioneDTO implements Serializable {
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The tipo documento. */
  private TipoDocumentoDTO tipoDocumento;

  /** The estensione. */
  private EstensioneDTO estensione;

  /** The d inizio. */
  private Date dInizio;

  /** The d fine. */
  private Date dFine;
  
  /**
   * Instantiates a new tipo documento estensione DTO.
   */
  public TipoDocumentoEstensioneDTO() {
  }
  
  /**
   * Instantiates a new tipo documento estensione DTO.
   *
   * @param tipoDocumento the tipo documento
   * @param estensione the estensione
   */
  public TipoDocumentoEstensioneDTO(TipoDocumentoDTO tipoDocumento, EstensioneDTO estensione) {
    this.tipoDocumento = tipoDocumento;
    this.estensione = estensione;
  }

  /**
   * Gets the tipo documento.
   *
   * @return the tipo documento
   */
  public TipoDocumentoDTO getTipoDocumento() {
    return tipoDocumento;
  }

  /**
   * Sets the tipo documento.
   *
   * @param tipoDocumento the new tipo documento
   */
  public void setTipoDocumento(TipoDocumentoDTO tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }

  /**
   * Gets the estensione.
   *
   * @return the estensione
   */
  public EstensioneDTO getEstensione() {
    return estensione;
  }

  /**
   * Sets the estensione.
   *
   * @param estensione the new estensione
   */
  public void setEstensione(EstensioneDTO estensione) {
    this.estensione = estensione;
  }

  /**
   * Gets the d inizio.
   *
   * @return the d inizio
   */
  public Date getDInizio() {
    return dInizio;
  }

  /**
   * Sets the d inizio.
   *
   * @param dInizio the new d inizio
   */
  public void setDInizio(Date dInizio) {
    this.dInizio = dInizio;
  }

  /**
   * Gets the d fine.
   *
   * @return the d fine
   */
  public Date getDFine() {
    return dFine;
  }

  /**
   * Sets the d fine.
   *
   * @param dFine the new d fine
   */
  public void setDFine(Date dFine) {
    this.dFine = dFine;
  }

  /**
   * Gets the keys.
   *
   * @return the keys
   */
  public Object[] getKeys() {
    return new Object[] { tipoDocumento.getCodTipoDocumento(), estensione.getCodEstensione() };
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "TipoDocumentoEstensioneDTO [tipoDocumento=" + tipoDocumento + ", estensione=" + estensione + ", dInizio=" + dInizio + ", dFine=" + dFine + "]";
  }

}
