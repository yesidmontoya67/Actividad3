package com.actividad2.time.repository;

import com.actividad2.time.domain.DayTime;
import com.actividad2.time.domain.Hora;
import com.actividad2.time.domain.Minuto;
import com.actividad2.time.domain.Segundo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DayTimesRepository {
   DayTime insertOne (Hora hora, Minuto minuto, Segundo segundo);
   List<DayTime> findAll();
   int getInsertPosition();
}
