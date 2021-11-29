/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Vector;

/**
 * Parametro in input per un servizio di invio mail generico che accetti in
 * input un elenco di parametri por impostare i valori nel testo della mail.
 * 
 * Ogni parametro puo' avere un indice e una label, oltre al valore, cosi' il
 * template potra' essere composto da placeholder con indice o label.
 * 
 * 
 * 
 * @author 1871
 *
 */
public class ParametriInvioMail implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /*
     * INVIATA Richiesta - Cod Template PSLP = L68IN
     * 
     * OGGETTO: Richiesta Collocamento Mirato Piemonte: Inviata per la validazione
     * 
     */

    public static final String PSLP_COD_MAIL_RCM_MAIL_INVIATA_RICHIESTA_L68IN = "L68IN";

    /*
     * ACCOLTA Richiesta Inviata - Cod Template PSLP = L68AC
     * 
     * OGGETTO: Richiesta Collocamento Mirato Piemonte: Accolta
     */

    public static final String PSLP_COD_MAIL_RCM_MAIL_ACCOLTA_RICHIESTA_L68AC = "L68AC";

    /*
     * RESPINTA Richiesta Inviata - Cod Template PSLP = L68RI
     * 
     * OGGETTO: Richiesta Collocamento Mirato Piemonte: Respinta
     */

    public static final String PSLP_COD_MAIL_RCM_MAIL_RESPINTA_RICHIESTA_L68RI = "L68RI";

    /*
     * ANNULLAMENTO DA OPERATORE Richiesta in Bozza - Cod Template PSLP = L68AN
     * 
     * OGGETTO: Richiesta Collocamento Mirato Piemonte: Annullata
     */

    public static final String PSLP_COD_MAIL_RCM_MAIL_ANNULLATA_RICHIESTA_L68AN = "L68AN";

    /**
     * The Constant
     * PSLP_COD_MAIL_NOTIFICA_BENEFICIARIO_REDDITO_DI_CITTADINANZA_RCRIC.
     */
    /*
     * Codice mail per avviso di notifica a beneficiario di reddito di cittadinanza
     */
    public static final String PSLP_COD_MAIL_NOTIFICA_BENEFICIARIO_REDDITO_DI_CITTADINANZA_RCRIC = "RCRIC";

    /** The Constant PSLP_COD_MAIL_RICEZIONE_ADESIONE_GARANZIA_GIOVANI_GGRIC. */
    /*
     * Codice mail di pslp da utilizzare all'atto di ricezione di una nuova adesione
     * Garanzia Giovani
     */
    public static final String PSLP_COD_MAIL_RICEZIONE_ADESIONE_GARANZIA_GIOVANI_GGRIC = "GGRIC";

    /**
     * The Constant PSLP_COD_MAIL_RICEZIONE_FINE_ADESIONE_GARANZIA_GIOVANI_GGENDEXT.
     */
    /*
     * Codice mail di pslp da utilizzare all'atto di ricezione di un cambio stato
     * adesione Garanzia Giovani richiamato da sistemi esterni
     */
    public static final String PSLP_COD_MAIL_RICEZIONE_FINE_ADESIONE_GARANZIA_GIOVANI_GGENDEXT = "GGENDEXT";

    /** The Constant PSLP_COD_MAIL_RIFIUTO_ADESIONE_GGR1. */
    /*
     * Codice mail di pslp da utilizzare per un rifiuto completo di adesione, ossia
     * quando tutti gli stati sono stati rifiutati
     */
    public static final String PSLP_COD_MAIL_RIFIUTO_ADESIONE_GGR1 = "GGR1";

    /** The Constant PSLP_COD_MAIL_RIFIUTO_STATO_ADESIONE_GGR2. */
    /*
     * Codice mail di pslp da utilizzare per un rifiuto di un singolo stato adesione
     * che non sia l'ultimo, ossia ne esistono altri attivi
     */
    public static final String PSLP_COD_MAIL_RIFIUTO_STATO_ADESIONE_GGR2 = "GGR2";

    /** The Constant PSLP_COD_MAIL_RIFIUTO_DID. */
    /*
     * Codice mail di pslp da utilizzare per un rifiuto completo di una did, ossia
     * quando tutti gli stati sono stati rifiutati
     */
    public static final String PSLP_COD_MAIL_RIFIUTO_DID = "DIDR1";

    /** The Constant PSLP_COD_MAIL_RIFIUTO_STATO_DID. */
    /*
     * Codice mail di pslp da utilizzare per un rifiuto di un singolo stato did che
     * non sia l'ultimo, ossia ne esistono altri attivi
     */
    public static final String PSLP_COD_MAIL_RIFIUTO_STATO_DID = "DIDR2";

    /** The Constant PSLP_COD_MAIL_CAMBIO_ACCETTAZIONE_PATTO_SERVIZIO. */
    /*
     * Codice mail di pslp da utilizzare per accettazione/non accettazione di patto
     * di servizio
     */
    public static final String PSLP_COD_MAIL_CAMBIO_ACCETTAZIONE_PATTO_SERVIZIO = "PSES";

    /**
     * Instantiates a new parametri invio mail.
     */
    public ParametriInvioMail() {

    }

    /** The codice mail. */
    // Il codice di template della stampa
    String codiceMail;

    /** The mail to. */
    String mailTo;

    /** The codice fiscale destinatario. */
    // Il codice fiscale del destinatario della mail
    String codiceFiscaleDestinatario;

    /** The parametri mail. */
    // I parametri per la mail, possono essere per indice e valore, o label e valore
    Vector<MailPlaceholder> parametriMail = new Vector<MailPlaceholder>();

    /**
     * Adds the mail placeholder.
     *
     * @param index the index
     * @param value the value
     */
    public void addMailPlaceholder(int index, Object value) {
        addMailPlaceholder(index, null, value);
    }

    /**
     * Adds the mail placeholder.
     *
     * @param label the label
     * @param value the value
     */
    public void addMailPlaceholder(String label, Object value) {
        addMailPlaceholder(label, value);
    }

    /**
     * Adds the mail placeholder.
     *
     * @param index the index
     * @param label the label
     * @param value the value
     */
    public void addMailPlaceholder(int index, String label, Object value) {
        MailPlaceholder mp = new MailPlaceholder();
        mp.setIndex(index);
        mp.setLabel(label);
        mp.setValue(value);
        parametriMail.add(mp);
    }

    /**
     * Gets the parametri mail.
     *
     * @return the parametri mail
     */
    public Vector<MailPlaceholder> getParametriMail() {
        return parametriMail;
    }

    /**
     * Gets the mail placeholder.
     *
     * @param index the index
     * @return the mail placeholder
     */
    public MailPlaceholder getMailPlaceholder(int index) {
        return getMailPlaceholderPrivate(index, null);
    }

    /**
     * Gets the mail placeholder.
     *
     * @param label the label
     * @return the mail placeholder
     */
    public MailPlaceholder getMailPlaceholder(String label) {
        return getMailPlaceholderPrivate(-1, label);
    }

    /**
     * Gets the mail placeholder private.
     *
     * @param index the index
     * @param label the label
     * @return the mail placeholder private
     */
    private MailPlaceholder getMailPlaceholderPrivate(int index, String label) {
        for (MailPlaceholder mailPlaceholder : parametriMail) {
            if (index == mailPlaceholder.getIndex()) {
                return mailPlaceholder;
            } else if (label != null && label.equals(mailPlaceholder.getLabel())) {
                return mailPlaceholder;
            }
        }
        return null;
    }

    /**
     * Gets the codice mail.
     *
     * @return the codice mail
     */
    public String getCodiceMail() {
        return codiceMail;
    }

    /**
     * Sets the codice mail.
     *
     * @param codiceMail the new codice mail
     */
    public void setCodiceMail(String codiceMail) {
        this.codiceMail = codiceMail;
    }

    /**
     * Gets the mail to.
     *
     * @return the mail to
     */
    public String getMailTo() {
        return mailTo;
    }

    /**
     * Sets the mail to.
     *
     * @param mailTo the new mail to
     */
    public void setMailTo(String mailTo) {
        this.mailTo = mailTo;
    }

    /**
     * Gets the codice fiscale destinatario.
     *
     * @return the codice fiscale destinatario
     */
    public String getCodiceFiscaleDestinatario() {
        return codiceFiscaleDestinatario;
    }

    /**
     * Sets the codice fiscale destinatario.
     *
     * @param codiceFiscaleDestinatario the new codice fiscale destinatario
     */
    public void setCodiceFiscaleDestinatario(String codiceFiscaleDestinatario) {
        this.codiceFiscaleDestinatario = codiceFiscaleDestinatario;
    }

    /**
     * Sets the parametri mail.
     *
     * @param parametriMail the new parametri mail
     */
    public void setParametriMail(Vector<MailPlaceholder> parametriMail) {
        this.parametriMail = parametriMail;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ParametriInvioMail [");
        if (codiceMail != null) {
            builder.append("codiceMail=");
            builder.append(codiceMail);
            builder.append(", ");
        }
        if (mailTo != null) {
            builder.append("mailTo=");
            builder.append(mailTo);
            builder.append(", ");
        }
        if (codiceFiscaleDestinatario != null) {
            builder.append("codiceFiscaleDestinatario=");
            builder.append(codiceFiscaleDestinatario);
            builder.append(", ");
        }
        if (parametriMail != null) {
            builder.append("parametriMail=");
            builder.append(parametriMail);
        }
        builder.append("]");
        return builder.toString();
    }

}