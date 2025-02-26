package ltd.newbee.mall.controller.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 首页分类数据VO(第二级)
 */
public class SecondLevelCategoryVO implements Serializable {

    /** 商品分类id */
    private Long categoryId;

    /** 上一级商品分类id */
    private Long parentId;

    /** 商品分类等级 现在最多三级 */
    private Byte categoryLevel;

    /** 商品分类名称 */
    private String categoryName;

    private List<ThirdLevelCategoryVO> thirdLevelCategoryVOS;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Byte getCategoryLevel() {
        return categoryLevel;
    }

    public void setCategoryLevel(Byte categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<ThirdLevelCategoryVO> getThirdLevelCategoryVOS() {
        return thirdLevelCategoryVOS;
    }

    public void setThirdLevelCategoryVOS(List<ThirdLevelCategoryVO> thirdLevelCategoryVOS) {
        this.thirdLevelCategoryVOS = thirdLevelCategoryVOS;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}
