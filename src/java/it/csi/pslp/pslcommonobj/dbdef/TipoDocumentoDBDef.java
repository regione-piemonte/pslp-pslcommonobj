/* **************************************************** */
/* Copyright Regione Piemonte - 2021					*/
/* SPDX-License-Identifier: EUPL-1.2-or-later			*/
/* **************************************************** */

//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import it.csi.pslp.pslcommonobj.dto.TipoDocumentoDTO;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class TipoDocumentoDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_D_TIPO_DOCUMENTO") // Sostituire con @Query se il DBDef
                                       // mappa il risultato di una query e non
                                       // e' legato a una tabella
public abstract class TipoDocumentoDBDef extends TipoDocumentoDTO {

  /**
   * Gets the cod tipo documento.
   *
   * @return the cod tipo documento
   */
  @Column(name = "COD_TIPO_DOCUMENTO", pk = true, sequenceName = "SEQ_PSLP_D_TIPO_DOCUMENTO")
  public abstract String getCodTipoDocumento();

  /**
   * Gets the descr tipo documento.
   *
   * @return the descr tipo documento
   */
  @Column(name = "DESCR_TIPO_DOCUMENTO")
  public abstract String getDescrTipoDocumento();

} // fine classe
