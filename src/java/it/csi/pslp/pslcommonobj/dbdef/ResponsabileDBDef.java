/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.ResponsabileDTO;
import it.csi.silos.jedi.annotations.AutoUpdate;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class ResponsabileDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_T_RESPONSABILE") // Sostituire con @Query se il DBDef mappa
                                     // il risultato di una query e non e'
                                     // legato a una tabella
public abstract class ResponsabileDBDef extends ResponsabileDTO {

  /**
   * Gets the id sil T nazione res.
   *
   * @return the id sil T nazione res
   */
  @Column(name = "ID_SIL_T_NAZIONE_RES")
  public abstract String getIdSilTNazioneRes();

  /**
   * Gets the ds indirizzo dom.
   *
   * @return the ds indirizzo dom
   */
  @Column(name = "DS_INDIRIZZO_DOM")
  public abstract String getDsIndirizzoDom();

  /**
   * Gets the ds fax.
   *
   * @return the ds fax
   */
  @Column(name = "DS_FAX")
  public abstract String getDsFax();

  /**
   * Gets the ds num civico dom.
   *
   * @return the ds num civico dom
   */
  @Column(name = "DS_NUM_CIVICO_DOM")
  public abstract String getDsNumCivicoDom();

  /**
   * Gets the id sil T comune dom.
   *
   * @return the id sil T comune dom
   */
  @Column(name = "ID_SIL_T_COMUNE_DOM")
  public abstract String getIdSilTComuneDom();

  /**
   * Gets the genere.
   *
   * @return the genere
   */
  @Column(name = "GENERE")
  public abstract String getGenere();

  /**
   * Gets the d inserim.
   *
   * @return the d inserim
   */
  @Column(name = "D_INSERIM", autoUpdate = AutoUpdate.CURRENT_TIMESTAMP_INSERT)
  public abstract Date getDInserim();

  /**
   * Gets the cap dom.
   *
   * @return the cap dom
   */
  @Column(name = "CAP_DOM")
  public abstract String getCapDom();

  /**
   * Gets the ds indirizzo res.
   *
   * @return the ds indirizzo res
   */
  @Column(name = "DS_INDIRIZZO_RES")
  public abstract String getDsIndirizzoRes();

  /**
   * Gets the id sil T comune res.
   *
   * @return the id sil T comune res
   */
  @Column(name = "ID_SIL_T_COMUNE_RES")
  public abstract String getIdSilTComuneRes();

  /**
   * Gets the d scadenza perm sogg.
   *
   * @return the d scadenza perm sogg
   */
  @Column(name = "D_SCADENZA_PERM_SOGG")
  public abstract Date getDScadenzaPermSogg();

  /**
   * Gets the id sil T cittadinanza.
   *
   * @return the id sil T cittadinanza
   */
  @Column(name = "ID_SIL_T_CITTADINANZA")
  public abstract String getIdSilTCittadinanza();

  /**
   * Gets the id sil T provincia dom.
   *
   * @return the id sil T provincia dom
   */
  @Column(name = "ID_SIL_T_PROVINCIA_DOM")
  public abstract String getIdSilTProvinciaDom();

  /**
   * Gets the id sil T toponimo dom.
   *
   * @return the id sil T toponimo dom
   */
  @Column(name = "ID_SIL_T_TOPONIMO_DOM")
  public abstract String getIdSilTToponimoDom();

  /**
   * Gets the id sil T provincia res.
   *
   * @return the id sil T provincia res
   */
  @Column(name = "ID_SIL_T_PROVINCIA_RES")
  public abstract String getIdSilTProvinciaRes();

  /**
   * Gets the d nascita.
   *
   * @return the d nascita
   */
  @Column(name = "D_NASCITA")
  public abstract Date getDNascita();

  /**
   * Gets the cod user aggiorn.
   *
   * @return the cod user aggiorn
   */
  @Column(name = "COD_USER_AGGIORN")
  public abstract String getCodUserAggiorn();

  /**
   * Gets the ds telefono cellulare.
   *
   * @return the ds telefono cellulare
   */
  @Column(name = "DS_TELEFONO_CELLULARE")
  public abstract String getDsTelefonoCellulare();

  /**
   * Gets the ds indirizzo res esteso.
   *
   * @return the ds indirizzo res esteso
   */
  @Column(name = "DS_INDIRIZZO_RES_ESTESO")
  public abstract String getDsIndirizzoResEsteso();

  /**
   * Gets the id sil T comune nasc.
   *
   * @return the id sil T comune nasc
   */
  @Column(name = "ID_SIL_T_COMUNE_NASC")
  public abstract String getIdSilTComuneNasc();

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
   * Gets the numero perm sogg.
   *
   * @return the numero perm sogg
   */
  @Column(name = "NUMERO_PERM_SOGG")
  public abstract String getNumeroPermSogg();

  /**
   * Gets the id sil T nazione nasc.
   *
   * @return the id sil T nazione nasc
   */
  @Column(name = "ID_SIL_T_NAZIONE_NASC")
  public abstract String getIdSilTNazioneNasc();

  /**
   * Gets the cap res.
   *
   * @return the cap res
   */
  @Column(name = "CAP_RES")
  public abstract String getCapRes();

  /**
   * Gets the ds telefono fisso.
   *
   * @return the ds telefono fisso
   */
  @Column(name = "DS_TELEFONO_FISSO")
  public abstract String getDsTelefonoFisso();

  /**
   * Gets the cod user inserim.
   *
   * @return the cod user inserim
   */
  @Column(name = "COD_USER_INSERIM")
  public abstract String getCodUserInserim();

  /**
   * Gets the ds num civico res.
   *
   * @return the ds num civico res
   */
  @Column(name = "DS_NUM_CIVICO_RES")
  public abstract String getDsNumCivicoRes();

  /**
   * Gets the id sil T status lav extra ue.
   *
   * @return the id sil T status lav extra ue
   */
  @Column(name = "ID_SIL_T_STATUS_LAV_EXTRA_UE")
  public abstract String getIdSilTStatusLavExtraUe();

  /**
   * Gets the id sil T mot ril perm.
   *
   * @return the id sil T mot ril perm
   */
  @Column(name = "ID_SIL_T_MOT_RIL_PERM")
  public abstract String getIdSilTMotRilPerm();

  /**
   * Gets the id sil T toponimo res.
   *
   * @return the id sil T toponimo res
   */
  @Column(name = "ID_SIL_T_TOPONIMO_RES")
  public abstract String getIdSilTToponimoRes();

  /**
   * Gets the ds indirizzo dom esteso.
   *
   * @return the ds indirizzo dom esteso
   */
  @Column(name = "DS_INDIRIZZO_DOM_ESTESO")
  public abstract String getDsIndirizzoDomEsteso();

  /**
   * Gets the id sil T nazione dom.
   *
   * @return the id sil T nazione dom
   */
  @Column(name = "ID_SIL_T_NAZIONE_DOM")
  public abstract String getIdSilTNazioneDom();

} // fine classe
