package com.github.kokorin.jaffree.ffmpeg;

import org.junit.Assert;
import org.junit.Test;

public class UrlInOutTest {
    @Test
    public void testFormatDuration() throws Exception {
        Assert.assertEquals("123.456", UrlInOut.formatDuration(123_456));
        Assert.assertEquals("123.056", UrlInOut.formatDuration(123_056));
        Assert.assertEquals("123.05", UrlInOut.formatDuration(123_050));
        Assert.assertEquals("123", UrlInOut.formatDuration(123_000));

        Assert.assertEquals("-123.456", UrlInOut.formatDuration(-123_456));
        Assert.assertEquals("-123.056", UrlInOut.formatDuration(-123_056));
        Assert.assertEquals("-123.05", UrlInOut.formatDuration(-123_050));
        Assert.assertEquals("-123", UrlInOut.formatDuration(-123_000));
    }

}