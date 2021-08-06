package com.atguigu.gulimall.search.vo;

import com.atguigu.common.to.es.SkuEsModel;
import lombok.Data;

import java.util.List;

@Data
public class SearchResult {

    private List<SkuEsModel> product;

    private Integer pageNum;

    private long total;

    private Integer totalPages;

    private List<Integer> pageNavs;

    private List<BrandVo> brands;

    private List<NavVo> navs;

    public static class NavVo {
        private String navName;

        private String navValue;
        private String link;
    }

    private class BrandVo {

        private Long brandId;

        private String brandName;

        private String brandImg;

    }

    public static class AttrVo {
        private Long attrId;

        private String attrName;

        private List<String> attrValue;
    }

    public static class CatalogVo {
        private Long catalogId;

        private String catalogName;
    }
}
