package com.vaterundsohn.eber.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GroupByPeriod {

    @JsonProperty("period_type")
    private DailyRecord.PeriodType periodType;
    @JsonProperty("all_num")
    private int allNum;
    @JsonProperty("all_weight")
    private int allWeight;

}
