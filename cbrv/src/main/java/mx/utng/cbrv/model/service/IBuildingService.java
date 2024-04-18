package mx.utng.cbrv.model.service;

import java.util.List;

import mx.utng.cbrv.model.entity.Building;


public interface IBuildingService {
    List<Building> list();
    void save(Building building);
    Building getById(Long id);
    void delete(Long id);
}

