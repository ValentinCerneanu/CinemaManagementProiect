package com.proiect.cinemamanagement.service;

import com.proiect.cinemamanagement.dao.Room;
import com.proiect.cinemamanagement.entity.RoomEntity;
import com.proiect.cinemamanagement.repository.RoomRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class RoomService {

    private RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public RoomEntity processPostRooms(Room room){
        RoomEntity roomEntity = new RoomEntity(room);
        if(roomEntity.getSeatsNumber()*roomEntity.getRowNumber()!=roomEntity.getCapacity()){
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,  "Row number*Seats number is not equal to capacity");
        }

        return roomRepository.save(roomEntity);
    }

    public Iterable<RoomEntity> processGetRooms(){return roomRepository.findAll();}

    public Iterable<RoomEntity> processFindByNameContaining(String name){
        return  roomRepository.findByNameContaining(name);
    }
}
