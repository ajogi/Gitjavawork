import java.io.*;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Date;

class Flight{
    private

    Integer flightCall;

    Integer scheduleId;

    Integer flightStatusId;

    Flight(){}

    Flight(Integer flightCall,Integer scheduleId,Integer flightStatusId){

        this.flightCall = flightCall;

        this.scheduleId = scheduleId;

       this.flightStatusId = flightStatusId;

    }

    public Integer getFlightCall() {

        return flightCall;

    }

    public void setFlightCall(Integer flightCall) {

        this.flightCall = flightCall;

    }

    public Integer getScheduleId() {

        return scheduleId;

    }

    public void setScheduleId(Integer scheduleId) {

        this.scheduleId = scheduleId;

    }

    public Integer getFlightStatusId() {

        return flightStatusId;

    }

    public void setFlightStatusId(Integer flightStatusId) {

        this.flightStatusId = flightStatusId;

    }
}
