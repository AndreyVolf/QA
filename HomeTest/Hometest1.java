package HomeTest;

import org.junit.Assert;
import org.junit.Test;

public class Hometest1 {
    @Test

    public void testHome() {
        var actualResult = getRefundTicketPricePercent(140);
        Assert.assertEquals(30, actualResult);
    }

    private int getRefundTicketPricePercent(Integer hoursBeforeConcert) {

        return 30;
    }


    private Integer getRefundTicketPricePercent(Integer hoursBeforeConcert, Boolean wasConcertCancelled, Boolean wasConcertRescheduled)

    {


        if(wasConcertCancelled && wasConcertRescheduled) return 100;

        if(hoursBeforeConcert>240) return 100;

        if(hoursBeforeConcert>=144 && hoursBeforeConcert<=240) return 50;

        if(hoursBeforeConcert>3 && hoursBeforeConcert<=144) return 30;

        return 0;

    }


}
