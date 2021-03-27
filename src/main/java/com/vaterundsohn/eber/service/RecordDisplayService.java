package com.vaterundsohn.eber.service;

import com.vaterundsohn.eber.mapper.DailyRecordMapper;
import com.vaterundsohn.eber.model.DailyRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordDisplayService {

    DailyRecordMapper dailyRecordMapper;

    @Autowired
    public RecordDisplayService(DailyRecordMapper dailyRecordMapper) {
        this.dailyRecordMapper = dailyRecordMapper;
    }

    public List<DailyRecord> findAll() {
        return dailyRecordMapper.findAll();
    }

}
