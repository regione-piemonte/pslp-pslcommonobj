/* **************************************************** */
/* Copyright Regione Piemonte - 2021					*/
/* SPDX-License-Identifier: EUPL-1.2-or-later			*/
/* **************************************************** */

//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import it.csi.pslp.pslcommonobj.dto.TipoMessaggioDTO;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class TipoMessaggioDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_D_TIPO_MESSAGGIO") // Sostituire con @Query se il DBDef
                                       // mappa il risultato di una query e non
                                       // e' legato a una tabella
public abstract class TipoMessaggioDBDef extends TipoMessaggioDTO {

  /**
   * Gets the cod tipo messaggio.
   *
   * @return the cod tipo messaggio
   */
  @Column(name = "COD_TIPO_MESSAGGIO", pk = true, sequenceName = "SEQ_PSLP_D_TIPO_MESSAGGIO")
  public abstract String getCodTipoMessaggio();

  /**
   * Gets the descr tipo messaggio.
   *
   * @return the descr tipo messaggio
   */
  @Column(name = "DESCR_TIPO_MESSAGGIO")
  public abstract String getDescrTipoMessaggio();

} // fine classe
