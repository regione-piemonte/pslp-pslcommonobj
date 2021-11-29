/* **************************************************** */
/* Copyright Regione Piemonte - 2021					*/
/* SPDX-License-Identifier: EUPL-1.2-or-later			*/
/* **************************************************** */

//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.SlotDTO;
import it.csi.silos.jedi.annotations.AutoUpdate;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.RelationN1;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class SlotDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_T_SLOT") // Sostituire con @Query se il DBDef mappa il
                             // risultato di una query e non e' legato a una
                             // tabella
public abstract class SlotDBDef extends SlotDTO {

  /**
   * Gets the id slot.
   *
   * @return the id slot
   */
  @Column(name = "ID_SLOT", pk = true, sequenceName = "SEQ_PSLP_T_SLOT")
  public abstract Long getIdSlot();

  /**
   * Gets the num prenotazioni valide.
   *
   * @return the num prenotazioni valide
   */
  @Column(name = "NUM_PRENOTAZIONI_VALIDE")
  public abstract Integer getNumPrenotazioniValide();

  /**
   * Gets the d inserim.
   *
   * @return the d inserim
   */
  @Column(name = "D_INSERIM", autoUpdate = AutoUpdate.CURRENT_TIMESTAMP_INSERT)
  public abstract Date getDInserim();

  /**
   * Gets the cod user inserim.
   *
   * @return the cod user inserim
   */
  @Column(name = "COD_USER_INSERIM")
  public abstract String getCodUserInserim();

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
   * Gets the num max prenotazioni.
   *
   * @return the num max prenotazioni
   */
  @Column(name = "NUM_MAX_PRENOTAZIONI")
  public abstract Integer getNumMaxPrenotazioni();

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
   * Gets the flg eccezione.
   *
   * @return the flg eccezione
   */
  @Column(name = "FLG_ECCEZIONE")
  public abstract String getFlgEccezione();

  /**
   * Gets the giorno.
   *
   * @return the giorno
   */
  @RelationN1(columnName = "ID_GIORNO")
  public abstract GiornoDBDef getGiorno();

  /**
   * Gets the numero lock.
   *
   * @return the numero lock
   */
  @Column(name = "NUMERO_LOCK")
  public abstract Long getNumeroLock();

} // fine classe
