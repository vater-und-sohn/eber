package com.vaterundsohn.eber.service;

import com.vaterundsohn.eber.repository.DailyRecordRepository;
import com.vaterundsohn.eber.model.DailyRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordCollectSercive {

    DailyRecordRepository dailyRecordRepository;

    @Autowired
    public RecordCollectSercive(DailyRecordRepository dailyRecordRepository) {
        this.dailyRecordRepository = dailyRecordRepository;
    }

    public void saveRecord(DailyRecord dailyRecord) {
        dailyRecordRepository.saveRecord(dailyRecord);
    }

}
