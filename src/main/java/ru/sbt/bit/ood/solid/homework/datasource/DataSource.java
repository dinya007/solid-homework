package ru.sbt.bit.ood.solid.homework.datasource;

import ru.sbt.bit.ood.solid.homework.report.Report;

import java.time.LocalDate;

/**
 * Created by denis on 01/11/15.
 */
public interface DataSource {

    Report getSalaryReport(String departmentId, LocalDate dateFrom, LocalDate dateTo);

}
