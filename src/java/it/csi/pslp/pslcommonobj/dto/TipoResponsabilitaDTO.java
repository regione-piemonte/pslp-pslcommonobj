/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DTOJediStrategy
package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;

/**
 * The Class TipoResponsabilitaDTO.
 */
public class TipoResponsabilitaDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The codice. */
  // campo chiave primaria
  private String codice = null;

  /** The descrizione. */
  private String descrizione = null;


  /**
   * Gets the codice.
   *
   * @return the codice
   */
  public String getCodice() {
    return codice;
  }

  /**
   * Sets the codice.
   *
   * @param codice the new codice
   */
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * Gets the descrizione.
   *
   * @return the descrizione
   */
  public String getDescrizione() {
    return descrizione;
  }

  /**
   * Sets the descrizione.
   *
   * @param descrizione the new descrizione
   */
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * Gets the keys.
   *
   * @return the keys
   */
  public Object[] getKeys() {
    return new Object[] { codice };
  }

  /**
   * Gets the dto for test.
   *
   * @return the dto for test
   */
  public static TipoResponsabilitaDTO getDtoForTest() {
    return new TipoResponsabilitaDTO();
  }
} // fine classe
