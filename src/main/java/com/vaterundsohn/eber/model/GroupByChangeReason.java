package com.vaterundsohn.eber.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GroupByChangeReason {

    @JsonProperty("change_reason")
    private DailyRecord.ChangeReason changeReason;

    @JsonProperty("all_num")
    private int allNum;

    @JsonProperty("all_weight")
    private int allWeight;
}
