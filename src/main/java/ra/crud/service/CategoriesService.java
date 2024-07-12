package ra.crud.service;

import ra.crud.model.Categories;

import java.util.List;

public interface CategoriesService {
    List<Categories> findAll();

    Categories findById(int catalogId);

    boolean create(Categories catalog);

    boolean update(Categories catalog);

    boolean delete(int catalogId);
}
