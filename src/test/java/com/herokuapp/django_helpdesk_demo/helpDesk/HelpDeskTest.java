package com.herokuapp.django_helpdesk_demo.helpDesk;

import com.herokuapp.django_helpdesk_demo.core.BaseTest;
import com.herokuapp.django_helpdesk_demo.helpers.testValues;
import org.junit.Assert;
import org.junit.Test;
import com.herokuapp.django_helpdesk_demo.readProperties.ConfigProvider;
import static com.herokuapp.django_helpdesk_demo.helpers.StringModifier.getUniqueString;


public class HelpDeskTest extends BaseTest {

    @Test
    public void checkTicket() {

    String title = getUniqueString(testValues.TEST_TITLE);


    TicketPage ticketPage = new MainPage()
            .createTicket(title, testValues.TEST_BODY, testValues.TEST_EMAIL)
            .openLoginPage()
            .auth(ConfigProvider.DEMO_USER_USERNAME, ConfigProvider.DEMO_USER_PASSWORD)
            .findTicket(title);

    Assert.assertTrue(ticketPage.getTitle().contains(title));
    Assert.assertEquals(ticketPage.getBody(), testValues.TEST_BODY);
    Assert.assertEquals(ticketPage.getEmail(), testValues.TEST_EMAIL);

    }

}
