package mx.utng.cbrv.model.dao;

import java.util.List;

import mx.utng.cbrv.model.entity.Student;

public interface IStudentDao {
    //Estos metodos son abstractos no tienen cuerpo
    
    //Listar usuarios
    List<Student>list();

    //Guardar un usuario
    void save(Student student);

    //Obterner un usuario en especifico a partir del id
    Student getById(Long id);

    //Eliminar un usuario por el id
    void delete(Long id);
}
