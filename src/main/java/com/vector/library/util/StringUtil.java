package com.vector.library.util;

/**
 * author: vector.huang
 * date：2016/3/21 14:40
 */
public class StringUtil {

    /**
     * 在文件名后面添加后缀
     * nice.png -> nice_s.png
     * @return
     */
    public static String suffix(String filename,String suffix){
        return filename.replaceAll("(.*)(\\W+)", "$1"+suffix+".");
    }

}
