package com.atguigu.gulimall.search.dao;

import org.elasticsearch.action.search.SearchResponse;

import java.util.List;
import java.util.Map;

public interface SkuInfoDao {

    public SearchResponse getAllRowsBySearchAfter(String index, Integer pageSize, Integer pageNum);

    public SearchResponse getAllRowsByFromSize(String index, Integer pageSize, Integer pageNum);

    public List<Map<String, Object>> getAllRowsByScroll(String index);

    public long totalCount(String... index);

    public boolean docIsExist(String index, String id);

    public int insertDoc(String index, Map<String,Object> kvs);

    public int deleteDoc(String index);

    public int updateDoc(String index);

    public double userRate();

    public Map<String, List<String>> getClusterIndexs(String clusterName);

    public Map<String, List<String>> getIndexTypes(String clusterName);

    public double storeSizeOfMB();

    public double storeSizeOfMB(String index);

    public int countTables();

    public List<String> getTablenamesOfDB();

    public SearchResponse queryByRandomField(String indexName, String fieldName, String fieldValue, int pageSize, int pageNum);

    public long totalCountOfFuzzyQuery(String indexName, String fieldName, String fieldValue);

    public Map<String, Object> getColumnNames(String indexName);
}
