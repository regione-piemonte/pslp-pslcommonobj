/* **************************************************** */
/* Copyright Regione Piemonte - 2021					*/
/* SPDX-License-Identifier: EUPL-1.2-or-later			*/
/* **************************************************** */

package it.csi.pslp.pslcommonobj.dbdef;

import it.csi.pslp.pslcommonobj.dto.SlotHeaderDTO;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.Query;

/**
 * The Class SlotHeaderDBDef.
 */
@Query
public abstract class SlotHeaderDBDef extends SlotHeaderDTO {

  /**
   * Gets the id slot.
   *
   * @return the id slot
   */
  @Override
  @Column(name = "ID_SLOT")
  public abstract Long getIdSlot();

  /**
   * Gets the giorno.
   *
   * @return the giorno
   */
  @Override
  @Column(name = "GIORNO")
  public abstract String getGiorno();

  /**
   * Gets the ora inizio.
   *
   * @return the ora inizio
   */
  @Override
  @Column(name = "ORA_INIZIO")
  public abstract Integer getOraInizio();

  /**
   * Gets the ora fine.
   *
   * @return the ora fine
   */
  @Override
  @Column(name = "ORA_FINE")
  public abstract Integer getOraFine();

  /**
   * Gets the disponibilita.
   *
   * @return the disponibilita
   */
  @Override
  @Column(name = "DISPONIBILITA")
  public abstract Integer getDisponibilita();

}
