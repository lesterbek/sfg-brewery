package com.projects.sfgbrewery.service;

import com.projects.sfgbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    public void updateBeer(UUID beerId, BeerDto beerDto);
}