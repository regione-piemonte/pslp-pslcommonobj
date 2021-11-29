/* **************************************************** */
/* Copyright Regione Piemonte - 2021					*/
/* SPDX-License-Identifier: EUPL-1.2-or-later			*/
/* **************************************************** */

//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import it.csi.pslp.pslcommonobj.dto.TipoEventoDTO;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class TipoEventoDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_D_TIPO_EVENTO") // Sostituire con @Query se il DBDef mappa
                                    // il risultato di una query e non e' legato
                                    // a una tabella
public abstract class TipoEventoDBDef extends TipoEventoDTO {

  /**
   * Gets the id tipo evento.
   *
   * @return the id tipo evento
   */
  @Column(name = "ID_TIPO_EVENTO", pk = true, sequenceName = "SEQ_PSLP_D_TIPO_EVENTO")
  public abstract Long getIdTipoEvento();

  /**
   * Gets the descr tipo evento.
   *
   * @return the descr tipo evento
   */
  @Column(name = "DESCR_TIPO_EVENTO")
  public abstract String getDescrTipoEvento();

} // fine classe
