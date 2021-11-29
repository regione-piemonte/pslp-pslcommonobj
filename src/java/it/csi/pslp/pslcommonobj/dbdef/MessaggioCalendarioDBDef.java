/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.MessaggioCalendarioDTO;
import it.csi.silos.jedi.annotations.AutoUpdate;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class MessaggioCalendarioDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_T_MESSAGGIO_CALENDARIO") // Sostituire con @Query se il
                                             // DBDef mappa il risultato di una
                                             // query e non e' legato a una
                                             // tabella
public abstract class MessaggioCalendarioDBDef extends MessaggioCalendarioDTO {

  /**
   * Gets the id messaggio.
   *
   * @return the id messaggio
   */
  @Column(name = "ID_MESSAGGIO_CALENDARIO", pk = true, sequenceName = "SEQ_PSLP_T_MESSAGGIO_CALEND")
  public abstract Long getIdMessaggio();

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
   * Gets the cod user aggiorn.
   *
   * @return the cod user aggiorn
   */
  @Column(name = "COD_USER_AGGIORN")
  public abstract String getCodUserAggiorn();

  /**
   * Gets the id calendario.
   *
   * @return the id calendario
   */
  @Column(name = "ID_CALENDARIO")
  public abstract Long getIdCalendario();

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
   * Gets the cod tipo messaggio calendario.
   *
   * @return the cod tipo messaggio calendario
   */
  @Column(name = "COD_TIPO_MESSAGGIO_CALEND")
  public abstract String getCodTipoMessaggioCalendario();

} // fine classe
