package com.company;

public enum Days {
    MONDAY("Дуйшомбу куну жава окуйм"),
    TUESDAY("Шейшемби куну практика"),
    WEDNESDAY("Шаршемби куну жава жаны темасы"),
    THURSDAY("Бейшемби куну софтскил жана практика"),
    FRIDAY("Жума куну жаны тема"),
    SATURDAY("Ийшемби куну дем алыш жана онлайн практика"),
    SUNDAY("Жекшемби кунуу дем алыш");

    public String study;

    Days(String study) {
        this.study = study;
    }

    @Override
    public String toString() {
        return  study ;
    }
}
