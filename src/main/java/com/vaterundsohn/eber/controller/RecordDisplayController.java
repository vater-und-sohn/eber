package com.vaterundsohn.eber.controller;

import com.vaterundsohn.eber.model.DailyRecord;
import com.vaterundsohn.eber.model.GroupByPeriod;
import com.vaterundsohn.eber.service.RecordDisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping("record")
public class RecordDisplayController {

    RecordDisplayService recordDisplayService;

    @Autowired
    public RecordDisplayController(RecordDisplayService dataDisplayService) {
        this.recordDisplayService = dataDisplayService;
    }

    @GetMapping
    public List<DailyRecord> getAllRecord() {
        return recordDisplayService.findAll();
    }

    @GetMapping("group-by-period-type")
    public List<GroupByPeriod> groupByPeriods() {
        return recordDisplayService.groupByPeriodType();
    }

}
