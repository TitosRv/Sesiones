package mx.utng.cbrv.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import mx.utng.cbrv.model.entity.Teacher;

@Repository
public class TeacherDaoImpl implements ITeacherDao{

    //Coloco un atributo que me permitira gestionar la entidad
    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Override
    public List<Teacher> list() {
        return em.createQuery("from Teacher").getResultList();
    }

    @Override
    public void save(Teacher teacher) {
        //Si el id es distinto a nulo o mayor que cero, quiere decir que el registro ya existe lo va a modificar
        if(teacher.getId() != null && teacher.getId()>0){
            em.merge(teacher);
        }else{
            //Registro nuevo al usar persist
            em.persist(teacher);
        }
    }

    @Override
    public Teacher getById(Long id) {
        return em.find(Teacher.class, id);
    }

    @Override
    public void delete(Long id) {
      Teacher teacher = getById(id);
      em.remove(teacher);
    }
    

}