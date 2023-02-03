package com.api.parkingcontrol.services;

import com.api.parkingcontrol.DTOS.ParkingSpotDTO;
import com.api.parkingcontrol.models.ParkingSpot;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface InterfaceParkingSpotService {
    ParkingSpot save(ParkingSpot parkingSpot);
    boolean existsByLicensePlate(String licensePlate);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);
    boolean existsByApartmentAndBlock(String apartment,String block);
    Page<ParkingSpot> findAll(Pageable pageable);
    Optional<ParkingSpot> findById(UUID id);
    void delete(ParkingSpot parkingSpot);
}
