package alex.klimchuk.spring.webflux.rest.bootstrap;

import alex.klimchuk.spring.webflux.rest.domain.Category;
import alex.klimchuk.spring.webflux.rest.domain.Vendor;
import alex.klimchuk.spring.webflux.rest.repositories.CategoryRepository;
import alex.klimchuk.spring.webflux.rest.repositories.VendorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
@Slf4j
@Component
public class BootstrapData implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final VendorRepository vendorRepository;

    public BootstrapData(CategoryRepository categoryRepository, VendorRepository vendorRepository) {
        this.categoryRepository = categoryRepository;
        this.vendorRepository = vendorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (categoryRepository.count().block() == 0) {
            loadCategories();
            loadVendors();
        }
    }

    private void loadCategories() {
        Category fruits = new Category();
        fruits.setDescription("Fruits");
        categoryRepository.save(fruits).block();

        Category dried = new Category();
        dried.setDescription("Dried");
        categoryRepository.save(dried).block();

        Category fresh = new Category();
        fresh.setDescription("Fresh");
        categoryRepository.save(fresh).block();

        Category exotic = new Category();
        exotic.setDescription("Exotic");
        categoryRepository.save(exotic).block();

        Category nuts = new Category();
        nuts.setDescription("Nuts");
        categoryRepository.save(nuts).block();

        log.info("Categories Loaded: " + categoryRepository.count().block());
    }

    private void loadVendors() {
        Vendor vendor1 = new Vendor();
        vendor1.setFirstName("Vendor 1");
        vendorRepository.save(vendor1).block();

        Vendor vendor2 = new Vendor();
        vendor2.setFirstName("Vendor 2");
        vendorRepository.save(vendor2).block();

        log.info("Vendors Loaded: " + vendorRepository.count().block());
    }

}
