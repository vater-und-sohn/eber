package com.vaterundsohn.eber.repository;

import com.vaterundsohn.eber.model.DailyRecord;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DailyRecordRepository {
    @Results(id = "BaseResultMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "dateTime", column = "date_time"),
            @Result(property = "pigType", column = "pig_type"),
            @Result(property = "periodType", column = "period_type"),
            @Result(property = "changeReason", column = "change_reason"),
            @Result(property = "pigNum", column = "pig_num"),
            @Result(property = "pigWeight", column = "pig_weight")
    })
    @Select("SELECT * FROM daily_record")
    List<DailyRecord> findAll();

    @Insert("insert into daily_record(date_time, pig_type, period_type, change_reason, pig_num, pig_weight)\n" +
            "values (#{dateTime}, #{pigType}, #{periodType}, #{changeReason}, #{pigNum}, #{pigWeight})")
    void saveRecord(DailyRecord dailyRecord);
}


