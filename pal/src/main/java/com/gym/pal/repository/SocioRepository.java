package com.gym.pal.repository;

import com.gym.pal.domain.Socio;

import java.util.ArrayList;
import java.util.List;

public class SocioRepository {
    private List<Socio> socios = new ArrayList<>();

    public List<Socio> getAllSocio() {
        return socios;
    }

    public Socio createUser(Socio socio) {
        socios.add(socio);
        return socio;
    }
}
