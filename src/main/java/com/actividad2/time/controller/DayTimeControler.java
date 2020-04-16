package com.actividad2.time.controller;

import com.actividad2.time.domain.DayTime;
import com.actividad2.time.service.DayTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/times")
public class DayTimeControler {

    @Autowired
    DayTimeService dayTimeService;

    @PostMapping
    public int createDayTime(@RequestBody DayTime dayTimeBody){
        return  dayTimeService.createDayTime(dayTimeBody.getHora(),dayTimeBody.getMinuto(),dayTimeBody.getSegundo());

    }

    @GetMapping
    public List<DayTime> getAll(){
        return dayTimeService.getAll();
    }
}
