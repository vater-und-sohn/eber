package com.vaterundsohn.eber.controller;

import com.vaterundsohn.eber.model.DailyRecord;
import com.vaterundsohn.eber.service.RecordCollectSercive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping("record")
public class RecordCollectController {

    RecordCollectSercive recordCollectSercive;

    @Autowired
    public RecordCollectController(RecordCollectSercive dataCollectSercive) {
        this.recordCollectSercive = dataCollectSercive;
    }

    // TODO 包装返回数据
    @PostMapping
    public void postRecord(@RequestBody DailyRecord dailyRecord) {
        recordCollectSercive.saveRecord(dailyRecord);
    }

}
