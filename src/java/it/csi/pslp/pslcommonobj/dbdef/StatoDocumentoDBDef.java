/* **************************************************** */
/* Copyright Regione Piemonte - 2021					*/
/* SPDX-License-Identifier: EUPL-1.2-or-later			*/
/* **************************************************** */

//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import it.csi.pslp.pslcommonobj.dto.StatoDocumentoDTO;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class StatoDocumentoDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_D_STATO_DOCUMENTO") // Sostituire con @Query se il DBDef
                                        // mappa il risultato di una query e non
                                        // e' legato a una tabella
public abstract class StatoDocumentoDBDef extends StatoDocumentoDTO {

  /**
   * Gets the cod stato documento.
   *
   * @return the cod stato documento
   */
  @Column(name = "COD_STATO_DOCUMENTO", pk = true, sequenceName = "SEQ_PSLP_D_STATO_DOCUMENTO")
  public abstract String getCodStatoDocumento();

  /**
   * Gets the descr stato documento.
   *
   * @return the descr stato documento
   */
  @Column(name = "DESCR_STATO_DOCUMENTO")
  public abstract String getDescrStatoDocumento();

} // fine classe
