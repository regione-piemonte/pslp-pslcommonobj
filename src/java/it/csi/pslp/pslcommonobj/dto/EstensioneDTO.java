/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * The Class EstensioneDTO.
 */
@JsonIgnoreProperties({ "keys" })
public class EstensioneDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The cod estensione. */
  // campo chiave primaria
  private String codEstensione = null;

  /** The descr estensione. */
  private String descrEstensione = null;

  /** The mime type. */
  private String mimeType = null;
  
  /**
   * Instantiates a new estensione DTO.
   */
  public EstensioneDTO() {
  }
  
  /**
   * Instantiates a new estensione DTO.
   *
   * @param codEstensione the cod estensione
   */
  public EstensioneDTO(String codEstensione) {
    this.codEstensione = codEstensione;
  }

  /**
   * Gets the cod estensione.
   *
   * @return the cod estensione
   */
  public String getCodEstensione() {
    return codEstensione;
  }

  /**
   * Sets the cod estensione.
   *
   * @param codEstensione the new cod estensione
   */
  public void setCodEstensione(String codEstensione) {
    this.codEstensione = codEstensione;
  }

  /**
   * Gets the descr estensione.
   *
   * @return the descr estensione
   */
  public String getDescrEstensione() {
    return descrEstensione;
  }

  /**
   * Sets the descr estensione.
   *
   * @param descrEstensione the new descr estensione
   */
  public void setDescrEstensione(String descrEstensione) {
    this.descrEstensione = descrEstensione;
  }

  /**
   * Gets the mime type.
   *
   * @return the mime type
   */
  public String getMimeType() {
    return mimeType;
  }

  /**
   * Sets the mime type.
   *
   * @param mimeType the new mime type
   */
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * Gets the keys.
   *
   * @return the keys
   */
  public Object[] getKeys() {
    return new Object[] { codEstensione };
  }

  /**
   * Gets the dto for test.
   *
   * @return the dto for test
   */
  public static EstensioneDTO getDtoForTest() {
    return new EstensioneDTO();
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "EstensioneDTO [codEstensione=" + codEstensione + ", descrEstensione=" + descrEstensione + ", mimeType=" + mimeType + "]";
  }

}
