package mx.utng.cbrv.model.dao;

import java.util.List;

import mx.utng.cbrv.model.entity.Building;


public interface IBuildingDao {
    //Estos metodos son abstractos no tienen cuerpo
    
    //Listar usuarios
    List<Building>list();

    //Guardar un usuario
    void save(Building building);

    //Obterner un usuario en especifico a partir del id
    Building getById(Long id);

    //Eliminar un usuario por el id
    void delete(Long id);
}
