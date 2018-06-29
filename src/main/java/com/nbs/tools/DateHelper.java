/*
 *   Copyright © 2018, lanbery,Lambor Co,. Ltd. All Rights Reserved.
 *
 *   Copyright Notice
 *   lanbery copyrights this specification. No part of this specification may be reproduced in any form or means, without the prior written consent of lanbery.
 *
 *   Disclaimer
 *   This specification is preliminary and is subject to change at any time without notice. Lambor assumes no responsibility for any errors contained herein.
 *
 */

package com.nbs.tools;

import org.apache.commons.lang3.time.DateFormatUtils;

public class DateHelper {
    public static final String FORMAT_STANDARD_TIME = "yyyy-MM-dd HH:mm:ss";

    /**
     * @Date    : 2018/6/21 16:29
     * @Author  : lanbery
     * @Decription :
     * <p>获取当前时间</p>
     * @Param   :
     * @return
     * @throws
     */
    public static String currentTime(){
        return DateFormatUtils.format(System.currentTimeMillis(),FORMAT_STANDARD_TIME);
    }
}
