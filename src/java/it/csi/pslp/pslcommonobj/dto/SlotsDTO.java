/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The Class SlotsDTO.
 */
public class SlotsDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The els. */
  private List<SlotDTO> els = new ArrayList<SlotDTO>();

  /**
   * Gets the els.
   *
   * @return the els
   */
  public List<SlotDTO> getEls() {
    return els;
  }

  /**
   * Sets the els.
   *
   * @param els the new els
   */
  public void setEls(List<SlotDTO> els) {
    this.els = els;
  }

}
