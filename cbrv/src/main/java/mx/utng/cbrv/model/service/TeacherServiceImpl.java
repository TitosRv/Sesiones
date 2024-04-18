package mx.utng.cbrv.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.cbrv.model.dao.ITeacherDao;
import mx.utng.cbrv.model.entity.Teacher;


/*
 * Una clase service, esta basada en el patron de diseño facade.
 * Un unico punto de acceso hacia distintos DAOS (Datas and objects).
 * Dentro de la clase service podemos operar distintas clases DAO.
 */
@Service
public class TeacherServiceImpl implements ITeacherService{

    //Inyecta una interfaz para utilizar sus metodos
    @Autowired
    private ITeacherDao teacherDao;

    @Transactional(readOnly = true)
    @Override
    public List<Teacher> list() {
        return teacherDao.list();
    }

    @Transactional
    @Override
    public void save(Teacher teacher) {
        teacherDao.save(teacher);
    }

    @Transactional(readOnly = true)
    @Override
    public Teacher getById(Long id) {
        return teacherDao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        teacherDao.delete(id);
    }
    
}


