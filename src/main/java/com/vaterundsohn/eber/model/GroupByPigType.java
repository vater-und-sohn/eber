package com.vaterundsohn.eber.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GroupByPigType {

    @JsonProperty("pig_type")
    private DailyRecord.PigType pigType;

    @JsonProperty("all_num")
    private int allNum;

    @JsonProperty("all_weight")
    private int allWeight;

}
