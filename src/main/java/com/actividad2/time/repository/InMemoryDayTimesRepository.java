package com.actividad2.time.repository;

import com.actividad2.time.domain.DayTime;
import com.actividad2.time.domain.Hora;
import com.actividad2.time.domain.Minuto;
import com.actividad2.time.domain.Segundo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Qualifier("in-memory")
public class InMemoryDayTimesRepository implements DayTimesRepository{
    private final List<DayTime> state= new ArrayList<>();

    @Override
    public DayTime insertOne(Hora hora, Minuto minuto, Segundo segundo) {
        DayTime dayTime=DayTime.of(hora, minuto, segundo);
        state.add(dayTime);
        return dayTime;
    }

    @Override
    public List<DayTime> findAll() {
        return state;
    }

    @Override
    public int getInsertPosition() {
        return state.size();
    }
}
