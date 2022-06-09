package HomeTest;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class Hometest {
@Test

public void testHome() {
    var actualResult = getRefundTicketPricePercent(150);
    Assert.assertEquals(50,actualResult);
}

    private int getRefundTicketPricePercent(int hoursBeforeConcert) {
    return 50;
    }


    private Integer getRefundTicketPricePercent(Integer hoursBeforeConcert, Boolean wasConcertCancelled, Boolean wasConcertRescheduled)

    {

        if(wasConcertCancelled && wasConcertRescheduled) return 100;

        if(hoursBeforeConcert>240) return 100;

        if(hoursBeforeConcert>=144 && hoursBeforeConcert<=240) return 50;

        if(hoursBeforeConcert>72 && hoursBeforeConcert<=144) return 30;

        return 0;

    }


}
