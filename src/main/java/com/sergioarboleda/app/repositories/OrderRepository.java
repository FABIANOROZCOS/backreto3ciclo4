
package com.sergioarboleda.app.repositories;

import com.sergioarboleda.app.model.Order;
import com.sergioarboleda.app.repositories.crud.OrderCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author FABIAN
 */
@Repository
public class OrderRepository {
    @Autowired
    private OrderCrudRepository repository;
    
    
    public List<Order> getAll() {
        return (List<Order>) repository.findAll();
    }


    public Optional<Order> getOrder(Integer id){
        return repository.findById(id);
    }
    
    public Order create(Order Order) {
        return repository.save(Order);
    }
    
    public void update(Order Order) {
        repository.save(Order);
    }
    
    public void delete(Order Order) {
        repository.delete(Order);
    }
    
       
    public List<Order> getOrderByZone(String zone){
        return repository.findBySalesManZone(zone);
    }
}
