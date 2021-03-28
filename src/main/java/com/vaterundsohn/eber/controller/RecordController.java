package com.vaterundsohn.eber.controller;

import com.vaterundsohn.eber.model.DailyRecord;
import com.vaterundsohn.eber.service.RecordCollectSercive;
import com.vaterundsohn.eber.service.RecordDisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping("record")
public class RecordController {

    RecordCollectSercive recordCollectSercive;
    RecordDisplayService recordDisplayService;

    @Autowired
    public RecordController(RecordCollectSercive dataCollectSercive, RecordDisplayService dataDisplayService) {
        this.recordCollectSercive = dataCollectSercive;
        this.recordDisplayService = dataDisplayService;
    }

    @GetMapping
    public List<DailyRecord> getAllRecord() {
        return recordDisplayService.findAll();
    }

    // TODO 包装返回数据
    @PostMapping
    public void postRecord(@RequestBody DailyRecord dailyRecord) {
        recordCollectSercive.saveRecord(dailyRecord);
    }

}
