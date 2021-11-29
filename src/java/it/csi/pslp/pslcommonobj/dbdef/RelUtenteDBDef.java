/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.RelUtenteDTO;
import it.csi.silos.jedi.annotations.AutoUpdate;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.RelationN1;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class RelUtenteDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_R_UTENTE") // Sostituire con @Query se il DBDef mappa il
                               // risultato di una query e non e' legato a una
                               // tabella
public abstract class RelUtenteDBDef extends RelUtenteDTO {

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
   * Gets the tipo responsabilita.
   *
   * @return the tipo responsabilita
   */
  @RelationN1(columnName = "COD_TIPO_RESPONSABILITA")
  public abstract TipoResponsabilitaDBDef getTipoResponsabilita();

  /**
   * Gets the cod user aggiorn.
   *
   * @return the cod user aggiorn
   */
  @Column(name = "COD_USER_AGGIORN")
  public abstract String getCodUserAggiorn();

  /**
   * Gets the d aggiorn.
   *
   * @return the d aggiorn
   */
  @Column(name = "D_AGGIORN", autoUpdate = AutoUpdate.CURRENT_TIMESTAMP)
  public abstract Date getDAggiorn();

  /**
   * Gets the id responsabile.
   *
   * @return the id responsabile
   */
  @Column(name = "ID_RESPONSABILE", pk = true)
  public abstract Long getIdResponsabile();

  /**
   * Gets the tutelato.
   *
   * @return the tutelato
   */
  @RelationN1(columnName = "ID_TUTELATO", pk = true)
  public abstract UtenteDBDef getTutelato();

} // fine classe
