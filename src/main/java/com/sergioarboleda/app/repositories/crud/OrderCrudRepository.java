
package com.sergioarboleda.app.repositories.crud;

import com.sergioarboleda.app.model.Order;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author FABIAN
 */
public interface OrderCrudRepository extends MongoRepository<Order, Integer>{
    List<Order> findBySalesManZone(String zone);
}
