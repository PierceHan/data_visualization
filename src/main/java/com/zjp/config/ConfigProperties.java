package com.zjp.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/***************************************************************************************
 * Project:        ocm-service
 * <p>
 * Copyright ©
 * <p>
 * **************************************************************************************
 * <p>
 * Header Name: WellJoint
 * <p>
 * Description:
 * <p>
 * 包含所有配置参数
 * 因为程序最终是打包至docker中运行的
 * 因此所有需要配置的参数都从环境变量中获取
 *
 * Revision History:
 * Modification
 * Author                  Date(MM/DD/YYYY)             JiraID            Description of Changes
 * ----------------      ------------------------       -------------     ----------------------
 * zhanglu               2017/12/22-9:19                 WEL-3567         add redis sentinel
 ****************************************************************************************/
@Component
public class ConfigProperties implements EnvironmentAware {

    private static Logger logger = LoggerFactory.getLogger(ConfigProperties.class);


    // database
    private String className = "com.mysql.jdbc.Driver";
    private String dbUrl;
    private String dbUsername;
    private String dbPassword;

    @Override
    public void setEnvironment(Environment environment) {
        dbUrl = environment.getProperty("db_url");
        dbUsername = environment.getProperty("db_username");
        dbPassword = environment.getProperty("db_password");
    }

    public String getClassName() {
        return className;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public String getDbUsername() {
        return dbUsername;
    }

    public String getDbPassword() {
        return dbPassword;
    }
}
