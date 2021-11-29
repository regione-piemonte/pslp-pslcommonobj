/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.RelUtentePrivacyDTO;
import it.csi.silos.jedi.annotations.AutoUpdate;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class RelUtentePrivacyDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_R_UTENTE_PRIVACY")
public abstract class RelUtentePrivacyDBDef extends RelUtentePrivacyDTO {

  /**
   * Gets the id rel utente privacy.
   *
   * @return the id rel utente privacy
   */
  @Override
  @Column(name = "ID_R_UTENTE_PRIVACY", pk = true, sequenceName = "SEQ_PSLP_R_UTENTE_PRIVACY")
  public abstract Long getIdRelUtentePrivacy();

  /**
   * Gets the id responsabile.
   *
   * @return the id responsabile
   */
  @Override
  @Column(name = "ID_RESPONSABILE")
  public abstract Long getIdResponsabile();

  /**
   * Gets the id tutelato.
   *
   * @return the id tutelato
   */
  @Override
  @Column(name = "ID_TUTELATO")
  public abstract Long getIdTutelato();
  
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
   * Gets the data inserim.
   *
   * @return the data inserim
   */
  @Override
  @Column(name = "D_INSERIM", autoUpdate = AutoUpdate.CURRENT_TIMESTAMP_INSERT)
  public abstract Date getDataInserim();

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
