package com.example.OneToOne.Repository;

import com.example.OneToOne.Model.Address;
import com.example.OneToOne.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,String> {
    Address findByCity(String city);

    Address findByPincode(String pincode);
}
