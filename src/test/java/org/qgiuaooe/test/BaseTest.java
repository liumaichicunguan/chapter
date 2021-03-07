package org.qgiuaooe.test;

import org.qgiuaooe.helper.DatabaseHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BaseTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);

    /**
     * 执行SQL文件
     * @param filePath
     */
    public void executeSqlFile(String filePath) {
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(filePath);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String sql = null;
        while (true) {
            try {
                if (!((sql = reader.readLine()) != null)) {
                    DatabaseHelper.executeUpdate(sql);
                }
            } catch (IOException e) {
                LOGGER.error("execute sql file failure", e);
                throw new RuntimeException(e);
            }

        }
    }
}
