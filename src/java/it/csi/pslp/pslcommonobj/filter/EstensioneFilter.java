/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.EstensioneDTO;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class EstensioneFilter.
 */
public class EstensioneFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The cod estensione. */
  private StringFilter codEstensione = new StringFilter();

  /** The descr estensione. */
  private StringFilter descrEstensione = new StringFilter();

  /** The mime type. */
  private StringFilter mimeType = new StringFilter();

  /** The expr QBE. */
  EstensioneDTO exprQBE = new EstensioneDTO();

  /**
   * Gets the cod estensione.
   *
   * @return the cod estensione
   */
  public StringFilter getCodEstensione() {
    return codEstensione;
  }

  /**
   * Sets the cod estensione.
   *
   * @param codEstensione the new cod estensione
   */
  public void setCodEstensione(StringFilter codEstensione) {
    this.codEstensione = codEstensione;
  }

  /**
   * Gets the descr estensione.
   *
   * @return the descr estensione
   */
  public StringFilter getDescrEstensione() {
    return descrEstensione;
  }

  /**
   * Sets the descr estensione.
   *
   * @param descrEstensione the new descr estensione
   */
  public void setDescrEstensione(StringFilter descrEstensione) {
    this.descrEstensione = descrEstensione;
  }

  /**
   * Gets the mime type.
   *
   * @return the mime type
   */
  public StringFilter getMimeType() {
    return mimeType;
  }

  /**
   * Sets the mime type.
   *
   * @param mimeType the new mime type
   */
  public void setMimeType(StringFilter mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public EstensioneDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(EstensioneDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

}
