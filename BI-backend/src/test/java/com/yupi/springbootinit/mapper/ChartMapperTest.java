package com.yupi.springbootinit.mapper;

import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ClassName: ChartMapperTest
 * Package: com.yupi.springbootinit.mapper
 * Description:
 *
 * @Author lilray
 * @Create 2023/12/27 16:50
 * @Version 1.0
 */
class ChartMapperTest {

    @Resource
    private ChartMapper chartMapper;

    @Test
    void queryChartData() {
        String chartId = "165884564654486";
        String querySql = String.format("select * from chart_%s",chartId);
        List<Map<String, Object>> resultData = chartMapper.queryChartData(querySql);
        System.out.println(resultData);
    }
}