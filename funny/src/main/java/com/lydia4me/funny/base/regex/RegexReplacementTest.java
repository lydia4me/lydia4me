package com.lydia4me.funny.base.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lydia on 14-5-7.
 */
public class RegexReplacementTest {
        public static void main(String[] args){
            String abc = "123ABC456";
            String re = "#7T\\$/#";
            String re2 = "#7T$/#";
            System.out.println(abc.replaceAll("ABC", re));

            Matcher matcher = Pattern.compile("ABC").matcher(abc);
            System.out.println(matcher.replaceAll(Matcher.quoteReplacement(re2)));

            System.out.println(abc.replaceAll("ABC", Matcher.quoteReplacement(re2)));
        }
}
