package com.vaterundsohn.eber.service;

import com.vaterundsohn.eber.model.GroupByPeriod;
import com.vaterundsohn.eber.model.GroupByPigType;
import com.vaterundsohn.eber.repository.DailyRecordRepository;
import com.vaterundsohn.eber.model.DailyRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordDisplayService {

    DailyRecordRepository dailyRecordRepository;

    @Autowired
    public RecordDisplayService(DailyRecordRepository dailyRecordRepository) {
        this.dailyRecordRepository = dailyRecordRepository;
    }

    public List<DailyRecord> findAll() {
        return dailyRecordRepository.findAll();
    }

    public List<GroupByPeriod> groupByPeriodType() {
        return dailyRecordRepository.groupByPeriodType();
    }

    public List<GroupByPigType> groupByPigType() {
        return dailyRecordRepository.groupByPigType();
    }

}
