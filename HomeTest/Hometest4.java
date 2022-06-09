package HomeTest;

import org.junit.Assert;
import org.junit.Test;

public class Hometest4 {
    @Test

    public void testHome() {
        var actualResult = getRefundTicketPricePercent(0);
        Assert.assertEquals(30, actualResult);
    }

    private int getRefundTicketPricePercent(Integer  wasConcertCancelled) {

        return 100;
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
