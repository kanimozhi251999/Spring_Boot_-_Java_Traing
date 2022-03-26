package com.example.OneToMany.Repository;

import com.example.OneToMany.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,String> {
    Address findByCity(String city);

    Address findByPincode(String pincode);
}
