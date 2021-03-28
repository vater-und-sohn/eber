package com.vaterundsohn.eber.repository;

import com.vaterundsohn.eber.model.DailyRecord;
import com.vaterundsohn.eber.model.GroupByChangeReason;
import com.vaterundsohn.eber.model.GroupByPeriod;
import com.vaterundsohn.eber.model.GroupByPigType;
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
    @Select("SELECT * FROM daily_record order by date_time")
    List<DailyRecord> findAll();

    @Select("SELECT pig_type, sum(pig_num) as num, sum(pig_weight) as weight FROM daily_record group by pig_type")
    @Result(property = "pigType", column = "pig_type")
    @Result(property = "allNum", column = "num")
    @Result(property = "allWeight", column = "weight")
    List<GroupByPigType> groupByPigType();

    @Select("SELECT period_type, sum(pig_num) as num, sum(pig_weight) as weight FROM daily_record group by period_type")
    @Result(property = "periodType", column = "period_type")
    @Result(property = "allNum", column = "num")
    @Result(property = "allWeight", column = "weight")
    List<GroupByPeriod> groupByPeriodType();

    @Select("SELECT change_reason, sum(pig_num) as num, sum(pig_weight) as weight FROM daily_record group by change_reason")
    @Result(property = "changeReason", column = "change_reason")
    @Result(property = "allNum", column = "num")
    @Result(property = "allWeight", column = "weight")
    List<GroupByChangeReason> groupByChangeReason();

    @Insert("insert into daily_record(date_time, pig_type, period_type, change_reason, pig_num, pig_weight)\n" +
            "values (#{dateTime}, #{pigType}, #{periodType}, #{changeReason}, #{pigNum}, #{pigWeight})")
    void saveRecord(DailyRecord dailyRecord);
}


