package com.droom.automation.constants;

import java.io.File;

public class UIConstants {

    // General Parameters
    public static final String FILE_SEPARATOR = File.separator;
    public static final String BASE_FILE_PATH = System.getProperty("user.dir");
    public static final String BASE_DRIVER_PATH = FILE_SEPARATOR + "src" + FILE_SEPARATOR + "test" + FILE_SEPARATOR + "resources" + FILE_SEPARATOR + "drivers";
    public static final String DOWNLOAD_PATH = new File("src" + File.separator + "test" + File.separator + "resources" + File.separator + "downloads").getAbsolutePath();

    // Browser Related Parameters
    public static enum BROWSERS {FIREFOX, CHROME, SAFARI, IE};

    // FIREFOX PARAMETERS
    public static final String SUPPORTED_LANGUAGE = "en-us";

    // Selenium Parameters
    public static final long DEFAULT_WAIT_TIME_IN_SECONDS = 30;

    public static final class NumericValues {

        public static final int ONE = 1;
        public static final int TWO = 2;
    }
}
