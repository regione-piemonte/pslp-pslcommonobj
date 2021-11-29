/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DTOJediStrategy
package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * The Class PrenotazioneDTO.
 */
@JsonIgnoreProperties({ "keys" })
public class PrenotazioneDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The slot. */
    // campo chiave esterna verso la colonna ID_SLOT della tabella PSLP_T_SLOT
    private SlotDTO slot = null;

    /** The utente. */
    // campo chiave esterna verso la colonna ID_UTENTE della tabella PSLP_T_UTENTE
    private UtenteDTO utente = null;

    /** The d inserim. */
    private Date dInserim = null;

    /** The id prenotazione. */
    // campo chiave primaria
    private Long idPrenotazione = null;

    /** The cod user inserim. */
    private String codUserInserim = null;

    /** The note. */
    private String note = null;

    /** The cod user aggiorn. */
    private String codUserAggiorn = null;

    /** The d aggiorn. */
    private Date dAggiorn = null;

    /** The id stato appuntamento. */
    private String idStatoAppuntamento;

    /** The id sil in contatto. */
    private Long idSilInContatto;

    /** The id sil rif ambito. */
    private Long idSilRifAmbito;

    /** The flg allineato silp. */
    private String flgAllineatoSilp;

    /** The flg inviato promemoria. */
    private String flgInviatoPromemoria;

    /** The flg inviato annullamento. */
    private String flgInviatoAnnullamento;

    /** The gruppo operatore. */
    private String gruppoOperatore = null;

    /** The cod operatore. */
    private Long codOperatore = null;

    /** The subcodice. */
    private Long subcodice = null;

    /**
     * Gets the slot.
     *
     * @return the slot
     */
    public SlotDTO getSlot() {
        return slot;
    }

    /**
     * Gets the utente.
     *
     * @return the utente
     */
    public UtenteDTO getUtente() {
        return utente;
    }

    /**
     * Gets the d inserim.
     *
     * @return the d inserim
     */
    public Date getDInserim() {
        return dInserim;
    }

    /**
     * Gets the id prenotazione.
     *
     * @return the id prenotazione
     */
    public Long getIdPrenotazione() {
        return idPrenotazione;
    }

    /**
     * Gets the cod user inserim.
     *
     * @return the cod user inserim
     */
    public String getCodUserInserim() {
        return codUserInserim;
    }

    /**
     * Gets the note.
     *
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * Gets the cod user aggiorn.
     *
     * @return the cod user aggiorn
     */
    public String getCodUserAggiorn() {
        return codUserAggiorn;
    }

    /**
     * Gets the d aggiorn.
     *
     * @return the d aggiorn
     */
    public Date getDAggiorn() {
        return dAggiorn;
    }

    /**
     * Sets the slot.
     *
     * @param slot the new slot
     */
    public void setSlot(SlotDTO slot) {
        this.slot = slot;
    }

    /**
     * Sets the utente.
     *
     * @param utente the new utente
     */
    public void setUtente(UtenteDTO utente) {
        this.utente = utente;
    }

    /**
     * Sets the d inserim.
     *
     * @param dInserim the new d inserim
     */
    public void setDInserim(Date dInserim) {
        this.dInserim = dInserim;
    }

    /**
     * Sets the id prenotazione.
     *
     * @param idPrenotazione the new id prenotazione
     */
    public void setIdPrenotazione(Long idPrenotazione) {
        this.idPrenotazione = idPrenotazione;
    }

    /**
     * Sets the cod user inserim.
     *
     * @param codUserInserim the new cod user inserim
     */
    public void setCodUserInserim(String codUserInserim) {
        this.codUserInserim = codUserInserim;
    }

    /**
     * Sets the note.
     *
     * @param note the new note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Sets the cod user aggiorn.
     *
     * @param codUserAggiorn the new cod user aggiorn
     */
    public void setCodUserAggiorn(String codUserAggiorn) {
        this.codUserAggiorn = codUserAggiorn;
    }

    /**
     * Sets the d aggiorn.
     *
     * @param dAggiorn the new d aggiorn
     */
    public void setDAggiorn(Date dAggiorn) {
        this.dAggiorn = dAggiorn;
    }

    /**
     * Gets the keys.
     *
     * @return the keys
     */
    public Object[] getKeys() {
        return new Object[] { idPrenotazione };
    }

    /**
     * Gets the dto for test.
     *
     * @return the dto for test
     */
    public static PrenotazioneDTO getDtoForTest() {
        return new PrenotazioneDTO();
    }

    /**
     * Gets the d inserim.
     *
     * @return the d inserim
     */
    public Date getdInserim() {
        return dInserim;
    }

    /**
     * Sets the d inserim.
     *
     * @param dInserim the new d inserim
     */
    public void setdInserim(Date dInserim) {
        this.dInserim = dInserim;
    }

    /**
     * Gets the d aggiorn.
     *
     * @return the d aggiorn
     */
    public Date getdAggiorn() {
        return dAggiorn;
    }

    /**
     * Sets the d aggiorn.
     *
     * @param dAggiorn the new d aggiorn
     */
    public void setdAggiorn(Date dAggiorn) {
        this.dAggiorn = dAggiorn;
    }

    /**
     * Gets the id stato appuntamento.
     *
     * @return the id stato appuntamento
     */
    public String getIdStatoAppuntamento() {
        return idStatoAppuntamento;
    }

    /**
     * Sets the id stato appuntamento.
     *
     * @param idStatoAppuntamento the new id stato appuntamento
     */
    public void setIdStatoAppuntamento(String idStatoAppuntamento) {
        this.idStatoAppuntamento = idStatoAppuntamento;
    }

    /**
     * Gets the id sil in contatto.
     *
     * @return the id sil in contatto
     */
    public Long getIdSilInContatto() {
        return idSilInContatto;
    }

    /**
     * Sets the id sil in contatto.
     *
     * @param idSilInContatto the new id sil in contatto
     */
    public void setIdSilInContatto(Long idSilInContatto) {
        this.idSilInContatto = idSilInContatto;
    }

    /**
     * Gets the flg allineato silp.
     *
     * @return the flg allineato silp
     */
    public String getFlgAllineatoSilp() {
        return flgAllineatoSilp;
    }

    /**
     * Sets the flg allineato silp.
     *
     * @param flgAllineatoSilp the new flg allineato silp
     */
    public void setFlgAllineatoSilp(String flgAllineatoSilp) {
        this.flgAllineatoSilp = flgAllineatoSilp;
    }

    /**
     * Gets the flg inviato promemoria.
     *
     * @return the flg inviato promemoria
     */
    public String getFlgInviatoPromemoria() {
        return flgInviatoPromemoria;
    }

    /**
     * Sets the flg inviato promemoria.
     *
     * @param flgInviatoPromemoria the new flg inviato promemoria
     */
    public void setFlgInviatoPromemoria(String flgInviatoPromemoria) {
        this.flgInviatoPromemoria = flgInviatoPromemoria;
    }

    /**
     * Gets the flg inviato annullamento.
     *
     * @return the flg inviato annullamento
     */
    public String getFlgInviatoAnnullamento() {
        return flgInviatoAnnullamento;
    }

    /**
     * Sets the flg inviato annullamento.
     *
     * @param flgInviatoAnnullamento the new flg inviato annullamento
     */
    public void setFlgInviatoAnnullamento(String flgInviatoAnnullamento) {
        this.flgInviatoAnnullamento = flgInviatoAnnullamento;
    }

    /**
     * Gets the gruppo operatore.
     *
     * @return the gruppo operatore
     */
    public String getGruppoOperatore() {
        return gruppoOperatore;
    }

    /**
     * Sets the gruppo operatore.
     *
     * @param gruppoOperatore the new gruppo operatore
     */
    public void setGruppoOperatore(String gruppoOperatore) {
        this.gruppoOperatore = gruppoOperatore;
    }

    /**
     * Gets the cod operatore.
     *
     * @return the cod operatore
     */
    public Long getCodOperatore() {
        return codOperatore;
    }

    /**
     * Sets the cod operatore.
     *
     * @param codOperatore the new cod operatore
     */
    public void setCodOperatore(Long codOperatore) {
        this.codOperatore = codOperatore;
    }

    /**
     * Gets the subcodice.
     *
     * @return the subcodice
     */
    public Long getSubcodice() {
        return subcodice;
    }

    /**
     * Sets the subcodice.
     *
     * @param subcodice the new subcodice
     */
    public void setSubcodice(Long subcodice) {
        this.subcodice = subcodice;
    }

    /**
     * Gets the id sil rif ambito.
     *
     * @return the id sil rif ambito
     */
    public Long getIdSilRifAmbito() {
        return idSilRifAmbito;
    }

    /**
     * Sets the id sil rif ambito.
     *
     * @param idSilRifAmbito the new id sil rif ambito
     */
    public void setIdSilRifAmbito(Long idSilRifAmbito) {
        this.idSilRifAmbito = idSilRifAmbito;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PrenotazioneDTO [");
        if (idPrenotazione != null) {
            builder.append("idPrenotazione=");
            builder.append(idPrenotazione);
            builder.append(", ");
        }
        if (idSilRifAmbito != null) {
            builder.append("idSilRifAmbito=");
            builder.append(idSilRifAmbito);
            builder.append(", ");
        }
        if (idSilInContatto != null) {
            builder.append("idSilInContatto=");
            builder.append(idSilInContatto);
            builder.append(", ");
        }
        if (slot != null) {
            builder.append("slot=");
            builder.append(slot);
            builder.append(", ");
        }
        if (utente != null) {
            builder.append("utente=");
            builder.append(utente);
            builder.append(", ");
        }
        if (dInserim != null) {
            builder.append("dInserim=");
            builder.append(dInserim);
            builder.append(", ");
        }
        if (codUserInserim != null) {
            builder.append("codUserInserim=");
            builder.append(codUserInserim);
            builder.append(", ");
        }
        if (note != null) {
            builder.append("note=");
            builder.append(note);
            builder.append(", ");
        }
        if (codUserAggiorn != null) {
            builder.append("codUserAggiorn=");
            builder.append(codUserAggiorn);
            builder.append(", ");
        }
        if (dAggiorn != null) {
            builder.append("dAggiorn=");
            builder.append(dAggiorn);
            builder.append(", ");
        }
        if (idStatoAppuntamento != null) {
            builder.append("idStatoAppuntamento=");
            builder.append(idStatoAppuntamento);
            builder.append(", ");
        }
        if (flgAllineatoSilp != null) {
            builder.append("flgAllineatoSilp=");
            builder.append(flgAllineatoSilp);
            builder.append(", ");
        }
        if (flgInviatoPromemoria != null) {
            builder.append("flgInviatoPromemoria=");
            builder.append(flgInviatoPromemoria);
            builder.append(", ");
        }
        if (flgInviatoAnnullamento != null) {
            builder.append("flgInviatoAnnullamento=");
            builder.append(flgInviatoAnnullamento);
            builder.append(", ");
        }
        if (gruppoOperatore != null) {
            builder.append("gruppoOperatore=");
            builder.append(gruppoOperatore);
            builder.append(", ");
        }
        if (codOperatore != null) {
            builder.append("codOperatore=");
            builder.append(codOperatore);
            builder.append(", ");
        }
        if (subcodice != null) {
            builder.append("subcodice=");
            builder.append(subcodice);
            builder.append(", ");
        }
        if (getSlot() != null) {
            builder.append("getSlot()=");
            builder.append(getSlot());
            builder.append(", ");
        }
        if (getUtente() != null) {
            builder.append("getUtente()=");
            builder.append(getUtente());
            builder.append(", ");
        }
        if (getDInserim() != null) {
            builder.append("getDInserim()=");
            builder.append(getDInserim());
            builder.append(", ");
        }
        if (getIdPrenotazione() != null) {
            builder.append("getIdPrenotazione()=");
            builder.append(getIdPrenotazione());
            builder.append(", ");
        }
        if (getCodUserInserim() != null) {
            builder.append("getCodUserInserim()=");
            builder.append(getCodUserInserim());
            builder.append(", ");
        }
        if (getNote() != null) {
            builder.append("getNote()=");
            builder.append(getNote());
            builder.append(", ");
        }
        if (getCodUserAggiorn() != null) {
            builder.append("getCodUserAggiorn()=");
            builder.append(getCodUserAggiorn());
            builder.append(", ");
        }
        if (getDAggiorn() != null) {
            builder.append("getDAggiorn()=");
            builder.append(getDAggiorn());
            builder.append(", ");
        }
        if (getKeys() != null) {
            builder.append("getKeys()=");
            builder.append(getKeys());
            builder.append(", ");
        }
        if (getdInserim() != null) {
            builder.append("getdInserim()=");
            builder.append(getdInserim());
            builder.append(", ");
        }
        if (getdAggiorn() != null) {
            builder.append("getdAggiorn()=");
            builder.append(getdAggiorn());
            builder.append(", ");
        }
        if (getIdStatoAppuntamento() != null) {
            builder.append("getIdStatoAppuntamento()=");
            builder.append(getIdStatoAppuntamento());
            builder.append(", ");
        }
        if (getIdSilInContatto() != null) {
            builder.append("getIdSilInContatto()=");
            builder.append(getIdSilInContatto());
            builder.append(", ");
        }
        if (getFlgAllineatoSilp() != null) {
            builder.append("getFlgAllineatoSilp()=");
            builder.append(getFlgAllineatoSilp());
            builder.append(", ");
        }
        if (getFlgInviatoPromemoria() != null) {
            builder.append("getFlgInviatoPromemoria()=");
            builder.append(getFlgInviatoPromemoria());
            builder.append(", ");
        }
        if (getFlgInviatoAnnullamento() != null) {
            builder.append("getFlgInviatoAnnullamento()=");
            builder.append(getFlgInviatoAnnullamento());
            builder.append(", ");
        }
        if (getGruppoOperatore() != null) {
            builder.append("getGruppoOperatore()=");
            builder.append(getGruppoOperatore());
            builder.append(", ");
        }
        if (getCodOperatore() != null) {
            builder.append("getCodOperatore()=");
            builder.append(getCodOperatore());
            builder.append(", ");
        }
        if (getSubcodice() != null) {
            builder.append("getSubcodice()=");
            builder.append(getSubcodice());
            builder.append(", ");
        }
        if (getClass() != null) {
            builder.append("getClass()=");
            builder.append(getClass());
            builder.append(", ");
        }
        builder.append("hashCode()=");
        builder.append(hashCode());
        builder.append(", ");
        if (super.toString() != null) {
            builder.append("toString()=");
            builder.append(super.toString());
        }
        builder.append("]");
        return builder.toString();
    }

} // fine classe
