package ra.crud.repository;

import ra.crud.model.Categories;

import java.util.List;

public interface CategoriesRepository {
    List<Categories> findAll();

    Categories findById(int catalogId);

    boolean create(Categories categories);

    boolean update(Categories categories);

    boolean delete(int catalogId);
}
