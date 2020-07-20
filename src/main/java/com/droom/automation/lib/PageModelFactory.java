package com.droom.automation.lib;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class PageModelFactory {

    private static final Logger LOG = LoggerFactory.getLogger(PageModelFactory.class);
    private static final ThreadLocal<HashMap<String, SeleniumWrapper>> PAGE_OBJECT_POOL = new ThreadLocal<>();

    private PageModelFactory() {
    }

    /**
     * Create Page Object For Given Class Type
     * @param T
     * @param <T>
     * @return
     */
    public static <T> T getPageModel(final Class T) {
        try {
            if (!PageModelFactory.PAGE_OBJECT_POOL.get().containsKey(T.getName())) {
                PageModelFactory.PAGE_OBJECT_POOL.get().put(T.getName(),
                        (SeleniumWrapper) T.newInstance());
            }
            return (T)PageModelFactory.PAGE_OBJECT_POOL.get().get(T.getName());
        } catch (final Exception ex) {
            LOG.info("ERROR : PageModelFactory failed to create page object of type " + T.getName()
                    + ".... " + ex.getMessage());
            return null;
        }
    }

    /**
     * This method will initialize thread pool to store run time page objects
     */
    public static void initPageConfig() {
        if (null == PageModelFactory.PAGE_OBJECT_POOL.get()) {
            PageModelFactory.PAGE_OBJECT_POOL.set(new HashMap<>());
        } else {
            LOG.info("PageModelFactory already initialized ...");
        }
    }
}




