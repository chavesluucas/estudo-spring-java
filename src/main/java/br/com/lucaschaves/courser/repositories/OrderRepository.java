package br.com.lucaschaves.courser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucaschaves.courser.entities.Order;

//Copiei o UserRepository e colei só trando o nome de user para Order, e deeentro do JpaRepository troquei também do antigo
//para Order
public interface OrderRepository extends JpaRepository<Order, Long>{

}
