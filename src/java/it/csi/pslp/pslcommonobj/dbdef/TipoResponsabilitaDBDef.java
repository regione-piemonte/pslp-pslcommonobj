/* **************************************************** */
/* Copyright Regione Piemonte - 2021					*/
/* SPDX-License-Identifier: EUPL-1.2-or-later			*/
/* **************************************************** */

//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import it.csi.pslp.pslcommonobj.dto.TipoResponsabilitaDTO;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class TipoResponsabilitaDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_D_TIPO_RESPONSABILITA") // Sostituire con @Query se il DBDef
                                            // mappa il risultato di una query e
                                            // non e' legato a una tabella
public abstract class TipoResponsabilitaDBDef extends TipoResponsabilitaDTO {

  /**
   * Gets the codice.
   *
   * @return the codice
   */
  @Column(name = "COD_TIPO_RESPONSABILITA", pk = true, sequenceName = "SEQ_PSLP_D_TIPO_RESPONSABILITA")
  public abstract String getCodice();

  /**
   * Gets the descrizione.
   *
   * @return the descrizione
   */
  @Column(name = "DESCR_TIPO_RESPONSABILITA")
  public abstract String getDescrizione();

} // fine classe
