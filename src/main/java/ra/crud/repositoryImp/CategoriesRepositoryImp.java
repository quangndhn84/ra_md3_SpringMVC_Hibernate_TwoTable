package ra.crud.repositoryImp;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ra.crud.model.Categories;
import ra.crud.repository.CategoriesRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CategoriesRepositoryImp implements CategoriesRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Categories> findAll() {
        return entityManager.createQuery("from Categories c", Categories.class).getResultList();
    }

    @Override
    public Categories findById(int catalogId) {
        return entityManager.createQuery("from Categories c where c.catalogId=:id", Categories.class)
                .setParameter("id", catalogId).getSingleResult();
    }

    @Override
    @Transactional
    public boolean create(Categories categories) {
        try {
            entityManager.persist(categories);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    @Transactional
    public boolean update(Categories categories) {
        try {
            entityManager.merge(categories);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    @Transactional
    public boolean delete(int catalogId) {
        try {
            Categories catalog = findById(catalogId);
            entityManager.remove(catalog);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
