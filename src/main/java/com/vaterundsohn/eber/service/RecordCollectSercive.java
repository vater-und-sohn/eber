package com.vaterundsohn.eber.service;

import com.vaterundsohn.eber.mapper.DailyRecordMapper;
import com.vaterundsohn.eber.model.DailyRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordCollectSercive {

    DailyRecordMapper dailyRecordMapper;

    @Autowired
    public RecordCollectSercive(DailyRecordMapper dailyRecordMapper) {
        this.dailyRecordMapper = dailyRecordMapper;
    }

    public void saveRecord(DailyRecord dailyRecord) {
        dailyRecordMapper.saveRecord(dailyRecord);
    }

}
