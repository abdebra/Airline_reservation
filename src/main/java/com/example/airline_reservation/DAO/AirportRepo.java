package com.example.airline_reservation.DAO;

import com.example.airline_reservation.Model.Airport;
import com.example.airline_reservation.Web.DTOs.AirportDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.awt.*;
import java.util.List;

@Repository
@Transactional
public interface AirportRepo extends JpaRepository<Airport, Integer> {
    @Query("SELECT a from Airport a WHERE a.code = ?1")
    List<AirportDTO> findFlightsFromAirport(String airportCode);
}
