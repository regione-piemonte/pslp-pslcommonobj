/******************************************************
 * Copyright Regione Piemonte - 2021
 * SPDX-License-Identifier: EUPL-1.2-or-later
 ******************************************************/
 
//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.MessaggioAggiuntivoDTO;
import it.csi.silos.jedi.annotations.AutoUpdate;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.RelationN1;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class MessaggioAggiuntivoDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_T_MESSAGGIO_AGGIUNTIVO") // Sostituire con @Query se il
                                             // DBDef mappa il risultato di una
                                             // query e non e' legato a una
                                             // tabella
public abstract class MessaggioAggiuntivoDBDef extends MessaggioAggiuntivoDTO {

  /**
   * Gets the messaggio.
   *
   * @return the messaggio
   */
  @RelationN1(columnName="ID_MESSAGGIO")
  public abstract MessaggioDBDef getMessaggio();

  /**
   * Gets the id messaggio aggiuntivo.
   *
   * @return the id messaggio aggiuntivo
   */
  @Column(name = "ID_MESSAGGIO_AGGIUNTIVO", pk = true, sequenceName = "SEQ_PSLP_T_MESSAGGIO_AGGIUNT")
  public abstract Long getIdMessaggioAggiuntivo();

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
   * Gets the cod operatore.
   *
   * @return the cod operatore
   */
  @Column(name = "COD_OPERATORE")
  public abstract Long getCodOperatore();

  /**
   * Gets the cod user aggiorn.
   *
   * @return the cod user aggiorn
   */
  @Column(name = "COD_USER_AGGIORN")
  public abstract String getCodUserAggiorn();

  /**
   * Gets the gruppo operatore.
   *
   * @return the gruppo operatore
   */
  @Column(name = "GRUPPO_OPERATORE")
  public abstract String getGruppoOperatore();

  /**
   * Gets the calendario.
   *
   * @return the calendario
   */
  @RelationN1(columnName = "ID_CALENDARIO")
  public abstract CalendarioDBDef getCalendario();

  /**
   * Gets the d aggiorn.
   *
   * @return the d aggiorn
   */
  @Column(name = "D_AGGIORN", autoUpdate = AutoUpdate.CURRENT_TIMESTAMP)
  public abstract Date getDAggiorn();

  /**
   * Gets the testo.
   *
   * @return the testo
   */
  @Column(name = "TESTO")
  public abstract String getTesto();

  /**
   * Gets the subcodice.
   *
   * @return the subcodice
   */
  @Column(name = "SUBCODICE")
  public abstract Long getSubcodice();

} // fine classe
