/* **************************************************** */
/* Copyright Regione Piemonte - 2021					*/
/* SPDX-License-Identifier: EUPL-1.2-or-later			*/
/* **************************************************** */

//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import it.csi.pslp.pslcommonobj.dto.UtenteEnteDTO;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class UtenteEnteDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_R_UTENTE_ENTE") // Sostituire con @Query se il DBDef mappa
                                    // il risultato di una query e non e' legato
                                    // a una tabella
public abstract class UtenteEnteDBDef extends UtenteEnteDTO {

  /**
   * Gets the id utente.
   *
   * @return the id utente
   */
  @Column(name = "ID_UTENTE", pk = true)
  public abstract Long getIdUtente();

  /**
   * Gets the flg utente master.
   *
   * @return the flg utente master
   */
  @Column(name = "FLG_UTENTE_MASTER")
  public abstract String getFlgUtenteMaster();

  /**
   * Gets the cod operatore.
   *
   * @return the cod operatore
   */
  @Column(name = "COD_OPERATORE", pk = true)
  public abstract Long getCodOperatore();

  /**
   * Gets the gruppo operatore.
   *
   * @return the gruppo operatore
   */
  @Column(name = "GRUPPO_OPERATORE", pk = true)
  public abstract String getGruppoOperatore();

  /**
   * Gets the subcodice.
   *
   * @return the subcodice
   */
  @Column(name = "SUBCODICE", pk = true)
  public abstract Long getSubcodice();

} // fine classe
