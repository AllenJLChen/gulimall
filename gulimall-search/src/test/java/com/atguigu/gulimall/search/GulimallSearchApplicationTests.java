package com.atguigu.gulimall.search;

import com.alibaba.fastjson.JSON;
import com.atguigu.gulimall.search.config.GulimallESConfig;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.bucket.terms.TermsAggregationBuilder;
import org.elasticsearch.search.aggregations.metrics.AvgAggregationBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
@NoArgsConstructor
public class GulimallSearchApplicationTests {

	@Autowired
	private RestHighLevelClient client;

	@Test
	public void esTest() {
		log.info(client.toString());
	}

	@Test
	public void contextLoads() {
	}

	@Test
	public void indexData() throws IOException {
		IndexRequest indexRequest = new IndexRequest("users");
		indexRequest.id("1");

		indexRequest.source("{" +
		     "\"user\":\"kinchy\"," +
		     "\"postDate\":\"2013-01-30\"," +
		     "\"message\":\"tryng out Elasticsearch\"" +
				"}", XContentType.JSON);

		client.index(indexRequest, GulimallESConfig.COMMON_OPTIONS);
	}

	@Test
	public void searchDataTest() throws IOException {
		SearchRequest searchRequest = new SearchRequest();

		searchRequest.indices("newbank");

		SearchSourceBuilder builder = new SearchSourceBuilder();

		builder.query(QueryBuilders.matchQuery("address", "mill"));

		TermsAggregationBuilder ageAgg = AggregationBuilders.terms("ageAgg").field("age").size(10);
		builder.aggregation(ageAgg);

		AvgAggregationBuilder balanceAvg = AggregationBuilders.avg("balanceAvg").field("balance");
		builder.aggregation(balanceAvg);

		log.info("检索条件：" + builder.toString());

		searchRequest.source(builder);

		SearchResponse search = client.search(searchRequest, GulimallESConfig.COMMON_OPTIONS);

		Map map = JSON.parseObject(search.toString(), Map.class);
		log.info(String.valueOf(map));

		SearchHits hits = search.getHits();

		SearchHit[] searchHits = hits.getHits();
		for(SearchHit hit : searchHits){
			String index = hit.getIndex();
			String id = hit.getId();
			String source = hit.getSourceAsString();
			log.info(source);
		}
	}


}
