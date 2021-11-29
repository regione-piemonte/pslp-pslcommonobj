/* **************************************************** */
/* Copyright Regione Piemonte - 2021					*/
/* SPDX-License-Identifier: EUPL-1.2-or-later			*/
/* **************************************************** */

//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.CalendarioDTO;
import it.csi.silos.jedi.annotations.AutoUpdate;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.RelationN1;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class CalendarioDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_T_CALENDARIO") // Sostituire con @Query se il DBDef mappa il
                                   // risultato di una query e non e' legato a
                                   // una tabella
public abstract class CalendarioDBDef extends CalendarioDTO {

  /**
   * Gets the flg invio conferma prenotaz.
   *
   * @return the flg invio conferma prenotaz
   */
  @Column(name = "FLG_INVIO_CONFERMA_PRENOTAZ")
  public abstract String getFlgInvioConfermaPrenotaz();

  /**
   * Gets the ambito.
   *
   * @return the ambito
   */
  @RelationN1(columnName = "COD_AMBITO")
  public abstract AmbitoDBDef getAmbito();

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
   * Gets the id calendario.
   *
   * @return the id calendario
   */
  @Column(name = "ID_CALENDARIO", pk = true, sequenceName = "SEQ_PSLP_T_CALENDARIO")
  public abstract Long getIdCalendario();

  /**
   * Gets the flg annulla garanzia giovani.
   *
   * @return the flg annulla garanzia giovani
   */
  @Column(name = "FLG_ANNULLA_GARANZIA_GIOVANI")
  public abstract String getFlgAnnullaGaranziaGiovani();

  /**
   * Gets the d aggiorn.
   *
   * @return the d aggiorn
   */
  @Column(name = "D_AGGIORN", autoUpdate = AutoUpdate.CURRENT_TIMESTAMP)
  public abstract Date getDAggiorn();

  /**
   * Gets the subcodice.
   *
   * @return the subcodice
   */
  @Column(name = "SUBCODICE")
  public abstract Long getSubcodice();

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
   * Gets the ore invio promemoria.
   *
   * @return the ore invio promemoria
   */
  @Column(name = "ORE_INVIO_PROMEMORIA")
  public abstract Integer getOreInvioPromemoria();

  /**
   * Gets the ore limite spostamento.
   *
   * @return the ore limite spostamento
   */
  @Column(name = "ORE_LIMITE_SPOSTAMENTO")
  public abstract Integer getOreLimiteSpostamento();

  /**
   * Gets the d annullamento.
   *
   * @return the d annullamento
   */
  @Column(name = "D_ANNULLAMENTO")
  public abstract Date getDAnnullamento();

  /**
   * Gets the flg visibile cpi.
   *
   * @return the flg visibile cpi
   */
  @Column(name = "FLG_VISIBILE_CPI")
  public abstract String getFlgVisibileCpi();

  /**
   * Gets the gruppo operatore.
   *
   * @return the gruppo operatore
   */
  @Column(name = "GRUPPO_OPERATORE")
  public abstract String getGruppoOperatore();

  /**
   * Gets the nome.
   *
   * @return the nome
   */
  @Column(name = "NOME")
  public abstract String getNome();

  /**
   * Gets the oggetto calendario.
   *
   * @return the oggetto calendario
   */
  @Column(name = "OGGETTO_CALENDARIO")
  public abstract String getOggettoCalendario();

  /**
   * Gets the flg bloccato.
   *
   * @return the flg bloccato
   */
  @Column(name = "FLG_BLOCCATO")
  public abstract String getFlgBloccato();

} // fine classe
