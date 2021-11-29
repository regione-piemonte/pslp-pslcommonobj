/******************************************************
 * Copyright Regione Piemonte - 2021
 * SPDX-License-Identifier: EUPL-1.2-or-later
 ******************************************************/

package it.csi.pslp.pslcommonobj.dbdef;

import it.csi.pslp.pslcommonobj.dto.EstensioneDTO;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class EstensioneDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_D_ESTENSIONE_DOC")
public abstract class EstensioneDBDef extends EstensioneDTO {

  /**
   * Gets the cod estensione.
   *
   * @return the cod estensione
   */
  @Column(name = "COD_ESTENSIONE_DOC", pk = true)
  public abstract String getCodEstensione();

  /**
   * Gets the descr estensione.
   *
   * @return the descr estensione
   */
  @Column(name = "DESCR_ESTENSIONE_DOC")
  public abstract String getDescrEstensione();

  /**
   * Gets the mime type.
   *
   * @return the mime type
   */
  @Column(name = "DS_MIME_TYPE")
  public abstract String getMimeType();

}
