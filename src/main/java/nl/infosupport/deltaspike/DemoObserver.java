package nl.infosupport.deltaspike;

import javax.enterprise.event.Observes;
import javax.enterprise.event.TransactionPhase;

public class DemoObserver {

    public void onEventSuccess(@Observes(during = TransactionPhase.AFTER_SUCCESS) DemoEvent event) {
        System.out.println("Book with title: \"" + event.getBook().getTitle() + "\"  has been successfully uploaded.");
    }

    public void onEventFail(@Observes(during = TransactionPhase.AFTER_FAILURE) DemoEvent event) {
        System.out.println("An error occurred! Book has not been uploaded");
    }
}
