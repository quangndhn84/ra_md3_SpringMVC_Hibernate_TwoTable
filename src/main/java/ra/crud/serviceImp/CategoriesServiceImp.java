package ra.crud.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.crud.model.Categories;
import ra.crud.repository.CategoriesRepository;
import ra.crud.service.CategoriesService;

import java.util.List;

@Service
public class CategoriesServiceImp implements CategoriesService {
    @Autowired
    private CategoriesRepository categoriesRepository;

    @Override
    public List<Categories> findAll() {
        return categoriesRepository.findAll();
    }

    @Override
    public Categories findById(int catalogId) {
        return categoriesRepository.findById(catalogId);
    }

    @Override
    public boolean create(Categories catalog) {
        return categoriesRepository.create(catalog);
    }

    @Override
    public boolean update(Categories catalog) {
        //1. Lấy entity catalog cần cập nhật
        Categories catalogUpdate = categoriesRepository.findById(catalog.getCatalogId());
        catalogUpdate.setCatalogName(catalog.getCatalogName());
        catalogUpdate.setDescription(catalog.getDescription());
        catalogUpdate.setStatus(catalog.isStatus());
        return categoriesRepository.update(catalogUpdate);
    }

    @Override
    public boolean delete(int catalogId) {
        return categoriesRepository.delete(catalogId);
    }
}
