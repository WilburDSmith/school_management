package za.ac.cput.school_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.City;
import za.ac.cput.school_management.repository.ICityRepository;

import java.util.List;
import java.util.Optional;
@Service
public class CityServiceImpl implements CityService{

    private final ICityRepository repository;

    private  CityServiceImpl(ICityRepository repository){
    this.repository = repository;
    }
    @Override
    public City save(City city) {
        return this.repository.save(city);
    }

    @Override
    public Optional<City> read(String id) {
        return this.repository.read(id);
    }

    @Override
    public City reading(City city) {
        return null;
    }

    @Override
    public City findByCountry_IdOrderByName(String countryId) {
      return  this.repository.findByCountry_IdOrderByName(countryId);
    }


    @Override
    public void delete(City city) {
   this.repository.delete(city);

    }
    public List<City> findAll(){
        return  this.repository.findAll();
    }
}
