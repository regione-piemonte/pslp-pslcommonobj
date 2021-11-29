/* **************************************************** */
/* Copyright Regione Piemonte - 2021					*/
/* SPDX-License-Identifier: EUPL-1.2-or-later			*/
/* **************************************************** */

//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import it.csi.pslp.pslcommonobj.dto.TipoUtenteDTO;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class TipoUtenteDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_D_TIPO_UTENTE") // Sostituire con @Query se il DBDef mappa
                                    // il risultato di una query e non e' legato
                                    // a una tabella
public abstract class TipoUtenteDBDef extends TipoUtenteDTO {

  /**
   * Gets the cod tipo utente.
   *
   * @return the cod tipo utente
   */
  @Column(name = "COD_TIPO_UTENTE", pk = true)
  public abstract String getCodTipoUtente();

  /**
   * Gets the descr tipo utente.
   *
   * @return the descr tipo utente
   */
  @Column(name = "DESCR_TIPO_UTENTE")
  public abstract String getDescrTipoUtente();

} // fine classe
