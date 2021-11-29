/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.PeriodoGiornoSettDTO;
import it.csi.silos.jedi.annotations.AutoUpdate;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class PeriodoGiornoSettDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_R_PERIODO_GIORNO_SETT") // Sostituire con @Query se il DBDef
                                            // mappa il risultato di una query e
                                            // non e' legato a una tabella
public abstract class PeriodoGiornoSettDBDef extends PeriodoGiornoSettDTO {

  /**
   * Gets the durata slot.
   *
   * @return the durata slot
   */
  @Column(name = "DURATA_SLOT")
  public abstract Integer getDurataSlot();

  /**
   * Gets the num max prenotazioni.
   *
   * @return the num max prenotazioni
   */
  @Column(name = "NUM_MAX_PRENOTAZIONI")
  public abstract Integer getNumMaxPrenotazioni();

  /**
   * Gets the d inserim.
   *
   * @return the d inserim
   */
  @Column(name = "D_INSERIM", autoUpdate = AutoUpdate.CURRENT_TIMESTAMP_INSERT)
  public abstract Date getDInserim();

  /**
   * Gets the id periodo giorno sett.
   *
   * @return the id periodo giorno sett
   */
  @Column(name = "ID_PERIODO_GIORNO_SETT", pk = true, sequenceName = "SEQ_PSLP_R_PERIODO_GIORNO_SETT")
  public abstract Long getIdPeriodoGiornoSett();

  /**
   * Gets the cod user inserim.
   *
   * @return the cod user inserim
   */
  @Column(name = "COD_USER_INSERIM")
  public abstract String getCodUserInserim();

  /**
   * Gets the id giorno settimana.
   *
   * @return the id giorno settimana
   */
  @Column(name = "ID_GIORNO_SETTIMANA")
  public abstract Integer getIdGiornoSettimana();

  /**
   * Gets the ora fine.
   *
   * @return the ora fine
   */
  @Column(name = "ORA_FINE")
  public abstract Integer getOraFine();

  /**
   * Gets the cod user aggiorn.
   *
   * @return the cod user aggiorn
   */
  @Column(name = "COD_USER_AGGIORN")
  public abstract String getCodUserAggiorn();

  /**
   * Gets the ora inizio.
   *
   * @return the ora inizio
   */
  @Column(name = "ORA_INIZIO")
  public abstract Integer getOraInizio();

  /**
   * Gets the d aggiorn.
   *
   * @return the d aggiorn
   */
  @Column(name = "D_AGGIORN", autoUpdate = AutoUpdate.CURRENT_TIMESTAMP)
  public abstract Date getDAggiorn();

  /**
   * Gets the id periodo.
   *
   * @return the id periodo
   */
  @Column(name = "ID_PERIODO")
  public abstract Long getIdPeriodo();

} // fine classe
