package com.yes.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yes.entity.Livraison;

@Repository
public interface LivraisonRepository extends JpaRepository<Livraison,Integer> {


}
