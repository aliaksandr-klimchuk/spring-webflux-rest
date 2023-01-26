package alex.klimchuk.spring.webflux.rest.repositories;

import alex.klimchuk.spring.webflux.rest.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {

}
