package com.atguigu.gulimall.search.dao.impl;

import com.atguigu.gulimall.search.dao.SkuInfoDao;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RestHighLevelClient;

import java.util.List;
import java.util.Map;

public class SkuInfoDaoImpl implements SkuInfoDao {

    RestHighLevelClient restClient = null;


    @Override
    public SearchResponse getAllRowsBySearchAfter(String index, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public SearchResponse getAllRowsByFromSize(String index, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public List<Map<String, Object>> getAllRowsByScroll(String index) {
        return null;
    }

    @Override
    public long totalCount(String... index) {
        return 0;
    }

    @Override
    public boolean docIsExist(String index, String id) {
        return false;
    }

    @Override
    public int insertDoc(String index, Map<String, Object> kvs) {
        return 0;
    }

    @Override
    public int deleteDoc(String index) {
        return 0;
    }

    @Override
    public int updateDoc(String index) {
        return 0;
    }

    @Override
    public double userRate() {
        return 0;
    }

    @Override
    public Map<String, List<String>> getClusterIndexs(String clusterName) {
        return null;
    }

    @Override
    public Map<String, List<String>> getIndexTypes(String clusterName) {
        return null;
    }

    @Override
    public double storeSizeOfMB() {
        return 0;
    }

    @Override
    public double storeSizeOfMB(String index) {
        return 0;
    }

    @Override
    public int countTables() {
        return 0;
    }

    @Override
    public List<String> getTablenamesOfDB() {
        return null;
    }

    @Override
    public SearchResponse queryByRandomField(String indexName, String fieldName, String fieldValue, int pageSize, int pageNum) {
        return null;
    }

    @Override
    public long totalCountOfFuzzyQuery(String indexName, String fieldName, String fieldValue) {
        return 0;
    }

    @Override
    public Map<String, Object> getColumnNames(String indexName) {
        return null;
    }
}
