package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.PersonDAO;
import web.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class PersonServiceImp implements PersonService {

    @Autowired
    PersonDAO personDAO;

    public List<Person> index() {
        return personDAO.index();
    }
    @Transactional
    public Person show(Long  id) {
        return personDAO.show(id);
    }
    @Transactional
    public void save(Person person) {
       personDAO.save(person);
    }

    @Transactional
    public void update(Long  id, Person updatedPerson) {
       personDAO.update(id, updatedPerson);
    }

    @Transactional
    public void delete(Long  id) {
       personDAO.delete(id);
    }

}
