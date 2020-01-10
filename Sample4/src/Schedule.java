import java.io.*;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Date;

class Schedule{

    private

    Integer scheduleId;

    String originIataAirportCode;

    String destIataAirportCode;

    Date departureTime;

    Date arrivalTime;

    Schedule(){}

    Schedule(Integer scheduleId,String originIataAirportCode,String destIataAirportCode,Date departureTime,Date arrivalTime)

    {   this.scheduleId = scheduleId;

        this.originIataAirportCode = originIataAirportCode;

        this.destIataAirportCode = destIataAirportCode;

        this.departureTime = departureTime;

        this.arrivalTime = arrivalTime;

    }

    public Integer getScheduleId() {

        return scheduleId;

    }

    public void setScheduleId(Integer scheduleId) {

        this.scheduleId = scheduleId;

    }

    public String getOriginIataAirportCode() {

        return originIataAirportCode;

    }

    public void setOriginIataAirportCode(String originIataAirportCode) {

        this.originIataAirportCode = originIataAirportCode;

    }

    public String getDestIataAirportCode() {

        return destIataAirportCode;

    }

    public void setDestIataAirportCode(String destIataAirportCode) {

        this.destIataAirportCode = destIataAirportCode;

    }

    public Date getDepartureTime() {

        return departureTime;

    }

    public void setDepartureTime(Date departureTime) {

        this.departureTime = departureTime;

    }

    public Date getArrivalTime() {

        return arrivalTime;

    }

    public void setArrivalTime(Date arrivalTime) {

        this.arrivalTime = arrivalTime;

    } 

}

