package com.permission.model.vo;

import java.util.List;

import com.permission.pojo.ModuleElement;

/**
 * 
 * @author milanyangbo
 *
 */
public class ModuleView {

	/**
	 * ID
	 */
	private int id;

    /**
     * 组织名称
     */
	private String name;


    /**
     * 主页面URL
     */
	private String url;


    /**
     * 父节点流水号
     */
	private Integer parentid;


	/**
     * 节点图标文件名称
     */
	private String iconname;
	

	 public Integer getId() {
	        return id;
	  }

	 public void setId(Integer id) {
	        this.id = id;
	  }
	
	 
	 public String getName() {
	      return name;
	 }

	 public void setName(String name) {
	     this.name = name == null ? null : name.trim();
	 }
	 
	 public String getUrl() {
	        return url;
	 }

     public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
     }
     
     public Integer getParentid() {
         return parentid;
     }

     public void setParentid(Integer parentid) {
         this.parentid = parentid;
     }
     
     public String getIconname() {
         return iconname;
     }

     public void setIconname(String iconname) {
         this.iconname = iconname == null ? null : iconname.trim();
     }
     
	/**
     * 子节点
     */
    private List<ModuleView> childern ;
    
    public List<ModuleView> getChildern() {
        return childern;
    }

    public void setChildern(List<ModuleView> childern) {
        this.childern = childern;
    }


    /**
     * 模块中的元素
     */
    private List<ModuleElement> elements;
    
    public List<ModuleElement> getElements() {
        return elements;
    }

    public void setElements(List<ModuleElement> elements) {
        this.elements = elements;
    }
    
}
