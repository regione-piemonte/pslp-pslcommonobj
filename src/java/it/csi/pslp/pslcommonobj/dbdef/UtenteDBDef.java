/* **************************************************** */
/* Copyright Regione Piemonte - 2021					*/
/* SPDX-License-Identifier: EUPL-1.2-or-later			*/
/* **************************************************** */

//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.UtenteDTO;
import it.csi.silos.jedi.annotations.AutoUpdate;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.RelationN1;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class UtenteDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_T_UTENTE") // Sostituire con @Query se il DBDef mappa il
                               // risultato di una query e non e' legato a una
                               // tabella
public abstract class UtenteDBDef extends UtenteDTO {

  /**
   * Gets the cf utente.
   *
   * @return the cf utente
   */
  @Column(name = "CF_UTENTE")
  public abstract String getCfUtente();

  /**
   * Gets the cognome.
   *
   * @return the cognome
   */
  @Column(name = "COGNOME")
  public abstract String getCognome();

  /**
   * Gets the id sil lav angrafica.
   *
   * @return the id sil lav angrafica
   */
  @Column(name = "ID_SIL_LAV_ANAGRAFICA")
  public abstract Long getIdSilLavAngrafica();

  /**
   * Gets the cod user aggiorn.
   *
   * @return the cod user aggiorn
   */
  @Column(name = "COD_USER_AGGIORN")
  public abstract String getCodUserAggiorn();

  /**
   * Gets the email.
   *
   * @return the email
   */
  @Column(name = "EMAIL")
  public abstract String getEmail();

  /**
   * Gets the d aggiorn.
   *
   * @return the d aggiorn
   */
  @Column(name = "D_AGGIORN", autoUpdate = AutoUpdate.CURRENT_TIMESTAMP)
  public abstract Date getDAggiorn();

  /**
   * Gets the cod tipo utente.
   *
   * @return the cod tipo utente
   */
  @Override
  @Column(name = "COD_TIPO_UTENTE")
  public abstract String getCodTipoUtente();

  /**
   * Gets the identificativo sap.
   *
   * @return the identificativo sap
   */
  @Column(name = "IDENTIFICATIVO_SAP")
  public abstract String getIdentificativoSap();

  /**
   * Gets the id utente.
   *
   * @return the id utente
   */
  @Column(name = "ID_UTENTE", pk = true, sequenceName = "SEQ_PSLP_T_UTENTE")
  public abstract Long getIdUtente();

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
   * Gets the nome.
   *
   * @return the nome
   */
  @Column(name = "NOME")
  public abstract String getNome();

} // fine classe
