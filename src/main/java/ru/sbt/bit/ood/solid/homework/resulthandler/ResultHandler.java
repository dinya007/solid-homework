package ru.sbt.bit.ood.solid.homework.resulthandler;

import ru.sbt.bit.ood.solid.homework.ReportDocument.ReportDocument;

import javax.mail.MessagingException;

/**
 * Created by denis on 01/11/15.
 */
public interface ResultHandler {

    void handleResult(ReportDocument htmlReportDocument) throws MessagingException;

}
