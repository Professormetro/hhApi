package com.chernov.Programmers.entity;

import lombok.Getter;
import lombok.Setter;

public class Vacancy {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private Schedule schedule;

    @Getter
    @Setter
    private Salary salary;

    public Vacancy() {};

    public class Salary{
        @Getter
        @Setter
        public Integer from;

        @Getter
        @Setter
        public Integer to;

        public Salary(){};

    }


    public class Schedule{
        @Getter
        @Setter
        public String id;

        @Getter
        @Setter
        public String name;

        public Schedule(){};

    }




}
