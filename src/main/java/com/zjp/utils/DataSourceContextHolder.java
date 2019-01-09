package com.zjp.utils;

import com.zjp.common.contants.DataSourceType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
 * 本地线程，数据源上下文
 * <p>
 * <p>
 * Revision History:
 * Modification
 * Author                  Date(MM/DD/YYYY)             JiraID            Description of Changes
 * ----------------      ------------------------       -------------     ----------------------
 * zhanglu               2017/8/23-10:59
 ****************************************************************************************/

public class DataSourceContextHolder {

    private static Logger logger = LoggerFactory.getLogger(DataSourceContextHolder.class);

    //线程本地环境
    private static ThreadLocal<String> local = new ThreadLocal<String>();

    public static ThreadLocal<String> getLocal() {
        return local;
    }

    /**
     * 读库
     */
    public static void setRead() {
        local.set(DataSourceType.slave.getType());
        logger.info("checkout to slave...");
    }

    /**
     * 写库
     */
    public static void setWrite() {
        local.set(DataSourceType.master.getType());
        logger.info("checkout to write...");
    }

    public static String getReadOrWrite() {
        if (local.get() == null)
            setWrite();
        return local.get();
    }

    public static void clear() {
        local.remove();
    }

}
