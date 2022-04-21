package br.com.lucaschaves.courser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucaschaves.courser.entities.User;

//os repositorios são interfaces, que estende o JpaRepository e informamos a classe e o tipo
public interface UserRepository extends JpaRepository<User, Long>{

}

//só isso é o suficiente, por incrivel que pareça rsrsrs