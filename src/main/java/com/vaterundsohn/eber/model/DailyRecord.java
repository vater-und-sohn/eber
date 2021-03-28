package com.vaterundsohn.eber.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.sql.Date;

public class DailyRecord {

    private int id;
    @JsonProperty("date_time")
    private Date dateTime;

    @JsonProperty("pig_type")
    private PigType pigType;

    @JsonProperty("period_type")
    private PeriodType periodType;

    @JsonProperty("change_reason")
    private ChangeReason changeReason;

    @JsonProperty("pig_num")
    private int pigNum;

    @JsonProperty("pig_weight")
    private int pigWeight;

    enum PigType  {
        MALE, FEMLE;
    }

    enum PeriodType {
        START, ADD, DELETE, END;
    }

    // 开始和结束阶段类型不存在变动原因，所以该类型的变动原因为null
    enum ChangeReason {
        // 增加原因
        MOVE_IN,
        BUY,

        // 减少原因
        MOVE_OUT,
        SELL,
        DIE,
        ELIMINATE;

    }


}

