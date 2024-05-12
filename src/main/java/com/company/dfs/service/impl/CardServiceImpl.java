package com.company.dfs.service.impl;

import com.company.dfs.entity.Card;
import com.company.dfs.service.CardService;

public class CardServiceImpl implements CardService {

    @Override
    public void setStatus(Card card, String status) {
        card.setStatus(status);
    }
}
