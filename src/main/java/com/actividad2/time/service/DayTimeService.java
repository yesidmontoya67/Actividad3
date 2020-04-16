package com.actividad2.time.service;

import com.actividad2.time.domain.DayTime;
import com.actividad2.time.domain.Hora;
import com.actividad2.time.domain.Minuto;
import com.actividad2.time.domain.Segundo;
import com.actividad2.time.repository.DayTimesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class DayTimeService {

    @Autowired
    @Qualifier("in-memory")
    DayTimesRepository dayTimesRepository;

    public int createDayTime(Hora hora, Minuto minuto, Segundo segundo){
       dayTimesRepository.insertOne(hora,minuto,segundo);
       return dayTimesRepository.getInsertPosition();
    }

    public List<DayTime> getAll(){
        return dayTimesRepository.findAll();
    }




}
