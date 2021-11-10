package com.codegym.dethimodule4.service;

import com.codegym.dethimodule4.model.Country;
import com.codegym.dethimodule4.repository.ICountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService implements ICountryService{
    @Autowired
    private ICountryRepository countryRepository;

    @Override
    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Page<Country> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Country> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Country save(Country country) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
