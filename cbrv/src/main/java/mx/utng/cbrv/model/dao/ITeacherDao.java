package mx.utng.cbrv.model.dao;

import java.util.List;

import mx.utng.cbrv.model.entity.Teacher;

public interface ITeacherDao {
    //Estos metodos son abstractos no tienen cuerpo
    
    //Listar usuarios
    List<Teacher>list();

    //Guardar un usuario
    void save(Teacher teacher);

    //Obterner un usuario en especifico a partir del id
    Teacher getById(Long id);

    //Eliminar un usuario por el id
    void delete(Long id);
}
