package com.lastma.data.models;

public enum ViolationType {
    OVERSPEEDING(50_000),
    DUI(11000),
    EXPIRED_PAPER(100000),
    TRAFFIC_LIGHT_OFFENCE(15000),
    ONE_WAY(25000);

    ViolationType(int fee){

    }


}
