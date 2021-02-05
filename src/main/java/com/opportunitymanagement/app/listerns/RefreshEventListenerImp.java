package com.opportunitymanagement.app.listerns;

import com.opportunitymanagement.app.entities.User;
import org.hibernate.HibernateException;
import org.hibernate.event.spi.RefreshEvent;
import org.hibernate.event.spi.RefreshEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class RefreshEventListenerImp  implements RefreshEventListener {

    public static final Logger LOGGER = LoggerFactory.getLogger(RefreshEventListenerImp.class);
    @Override
    public void onRefresh(RefreshEvent e) throws HibernateException {
       LOGGER.info("onRefresh is called.");
       Object object=e.getObject();
       if (object instanceof User){
           User user=(User)object;
           LOGGER.info("REFRESHED >>>>>>>>>>>>>" + user);
       }
    }

    @Override
    public void onRefresh(RefreshEvent refreshEvent, Map map) throws HibernateException {
        LOGGER.info("onRefresh is called.");
    }
}
