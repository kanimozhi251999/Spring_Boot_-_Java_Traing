package com.example.Assignment4.Repository;

import com.example.Assignment4.Model.HeandlingException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExceptionHandeleRepository extends JpaRepository<HeandlingException,String> {
    


    HeandlingException getById(String id);

    HeandlingException getByUserName(String username);

    Optional<Object> findByUserName(String userName);
}
