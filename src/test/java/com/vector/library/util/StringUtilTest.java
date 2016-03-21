package com.vector.library.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * author: vector.huang
 * date：2016/3/21 14:40
 */
public class StringUtilTest {

    @Test
    public void testSuffix(){
        String filename = "http://nice/nice/nice.nice.nice.png";
        String  filenameSuffix = StringUtil.suffix(filename,"_s");
        Assert.assertEquals("http://nice/nice/nice.nice.nice_s.png",filenameSuffix);
    }
}
