/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.PrenotazioneDTO;
import it.csi.silos.jedi.annotations.AutoUpdate;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.RelationN1;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class PrenotazioneDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_T_PRENOTAZIONE") // Sostituire con @Query se il DBDef mappa
                                     // il risultato di una query e non e'
                                     // legato a una tabella
public abstract class PrenotazioneDBDef extends PrenotazioneDTO {

    /**
     * Gets the slot.
     *
     * @return the slot
     */
    @RelationN1(columnName = "ID_SLOT")
    public abstract SlotDBDef getSlot();

    /**
     * Gets the utente.
     *
     * @return the utente
     */
    @RelationN1(columnName = "ID_UTENTE")
    public abstract UtenteDBDef getUtente();

    /**
     * Gets the d inserim.
     *
     * @return the d inserim
     */
    @Column(name = "D_INSERIM", autoUpdate = AutoUpdate.CURRENT_TIMESTAMP_INSERT)
    public abstract Date getDInserim();

    /**
     * Gets the id prenotazione.
     *
     * @return the id prenotazione
     */
    @Column(name = "ID_PRENOTAZIONE", pk = true, sequenceName = "SEQ_PSLP_T_PRENOTAZIONE")
    public abstract Long getIdPrenotazione();

    /**
     * Gets the cod user inserim.
     *
     * @return the cod user inserim
     */
    @Column(name = "COD_USER_INSERIM")
    public abstract String getCodUserInserim();

    /**
     * Gets the note.
     *
     * @return the note
     */
    @Column(name = "NOTE")
    public abstract String getNote();

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
     * Gets the id stato appuntamento.
     *
     * @return the id stato appuntamento
     */
    @Override
    @Column(name = "COD_ANPAL_STATO_INCON")
    public abstract String getIdStatoAppuntamento();

    /**
     * Gets the id sil in contatto.
     *
     * @return the id sil in contatto
     */
    @Override
    @Column(name = "ID_SIL_IN_CONTATTO")
    public abstract Long getIdSilInContatto();

    /**
     * Gets the flg inviato promemoria.
     *
     * @return the flg inviato promemoria
     */
    @Override
    @Column(name = "FLG_INVIATO_PROMEMORIA")
    public abstract String getFlgInviatoPromemoria();

    /**
     * Gets the gruppo operatore.
     *
     * @return the gruppo operatore
     */
    @Override
    @Column(name = "GRUPPO_OPERATORE")
    public abstract String getGruppoOperatore();

    /**
     * Gets the cod operatore.
     *
     * @return the cod operatore
     */
    @Override
    @Column(name = "COD_OPERATORE")
    public abstract Long getCodOperatore();

    /**
     * Gets the subcodice.
     *
     * @return the subcodice
     */
    @Override
    @Column(name = "SUBCODICE")
    public abstract Long getSubcodice();

    /**
     * Gets the id sil rif ambito.
     *
     * @return the id sil rif ambito
     */
    @Override
    @Column(name = "ID_SIL_RIF_AMBITO")
    public abstract Long getIdSilRifAmbito();

} // fine classe
