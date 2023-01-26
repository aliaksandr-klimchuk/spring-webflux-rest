package alex.klimchuk.spring.webflux.rest.repositories;

import alex.klimchuk.spring.webflux.rest.domain.Vendor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {

}
