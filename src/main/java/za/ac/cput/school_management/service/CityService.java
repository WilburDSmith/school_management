package za.ac.cput.school_management.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.City;

import java.util.List;
import java.util.Optional;

public interface CityService extends IService<City,String> {
     List<City> findAll ();
     Optional<City> read(String id);
    City save(City city);
      City reading(City city);
       void delete(City city);

     City findByCountry_IdOrderByName(String countryId);
}
