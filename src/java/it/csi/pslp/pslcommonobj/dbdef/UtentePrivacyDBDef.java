/* **************************************************** */
/* Copyright Regione Piemonte - 2021					*/
/* SPDX-License-Identifier: EUPL-1.2-or-later			*/
/* **************************************************** */

package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.UtentePrivacyDTO;
import it.csi.silos.jedi.annotations.AutoUpdate;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class UtentePrivacyDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_T_UTENTE_PRIVACY")
public abstract class UtentePrivacyDBDef extends UtentePrivacyDTO {

  /**
   * Gets the id utente privacy.
   *
   * @return the id utente privacy
   */
  @Override
  @Column(name = "ID_UTENTE_PRIVACY", pk = true, sequenceName = "SEQ_PSLP_T_UTENTE_PRIVACY")
  public abstract Long getIdUtentePrivacy();

  /**
   * Gets the id utente.
   *
   * @return the id utente
   */
  @Override
  @Column(name = "ID_UTENTE")
  public abstract Long getIdUtente();

  /**
   * Gets the data presa visione.
   *
   * @return the data presa visione
   */
  @Override
  @Column(name = "D_PRESA_VISIONE")
  public abstract Date getDataPresaVisione();

  /**
   * Gets the cod ambito.
   *
   * @return the cod ambito
   */
  @Override
  @Column(name = "COD_AMBITO")
  public abstract String getCodAmbito();

  /**
   * Gets the data inserimento.
   *
   * @return the data inserimento
   */
  @Override
  @Column(name = "D_INSERIM", autoUpdate = AutoUpdate.CURRENT_TIMESTAMP_INSERT)
  public abstract Date getDataInserimento();

  /**
   * Gets the cod user inserim.
   *
   * @return the cod user inserim
   */
  @Override
  @Column(name = "COD_USER_INSERIM")
  public abstract String getCodUserInserim();

  /**
   * Gets the data aggiorn.
   *
   * @return the data aggiorn
   */
  @Override
  @Column(name = "D_AGGIORN", autoUpdate = AutoUpdate.CURRENT_TIMESTAMP)
  public abstract Date getDataAggiorn();

  /**
   * Gets the cod user aggiorn.
   *
   * @return the cod user aggiorn
   */
  @Override
  @Column(name = "COD_USER_AGGIORN")
  public abstract String getCodUserAggiorn();

  
}
