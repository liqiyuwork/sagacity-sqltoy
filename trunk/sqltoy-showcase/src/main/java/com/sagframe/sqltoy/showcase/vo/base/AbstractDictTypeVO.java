/**
 *@Generated by sagacity-quickvo 4.13
 */
package com.sagframe.sqltoy.showcase.vo.base;

import java.io.Serializable;
import org.sagacity.sqltoy.config.annotation.Entity;
import org.sagacity.sqltoy.config.annotation.Id;
import org.sagacity.sqltoy.config.annotation.Column;
import java.time.LocalDateTime;

import org.sagacity.sqltoy.config.annotation.OneToMany;
import java.util.List;
import java.util.ArrayList;
import com.sagframe.sqltoy.showcase.vo.DictDetailVO;

/**
 * @project sqltoy-showcase
 * @version 1.0.0
 * Table: sqltoy_dict_type,Remark:字典分类表   
 */
@Entity(tableName="sqltoy_dict_type",pk_constraint="PRIMARY")
public abstract class AbstractDictTypeVO implements Serializable,
	java.lang.Cloneable {
	 /*--------------- properties string,handier to copy ---------------------*/
	 //full properties 
	 //dictType,dictTypeName,comments,showIndex,createBy,createTime,updateBy,updateTime,status
	 
	 //not null properties
	 //dictType,dictTypeName,showIndex,createBy,createTime,updateBy,updateTime,status

	/**
	 * 
	 */
	private static final long serialVersionUID = 2296375949498896572L;
	
	/**
	 * 字典类型代码
	 */
	@Id(strategy="generator",generator="org.sagacity.sqltoy.plugins.id.DefaultIdGenerator")
	@Column(name="DICT_TYPE",length=50L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String dictType;
	
	/**
	 * 字典类型名称
	 */
	@Column(name="DICT_TYPE_NAME",length=100L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String dictTypeName;
	
	/**
	 * 说明
	 */
	@Column(name="COMMENTS",length=500L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String comments;
	
	/**
	 * 显示顺序
	 */
	@Column(name="SHOW_INDEX",length=8L,defaultValue="1",type=java.sql.Types.INTEGER,nullable=false)
	protected Integer showIndex;
	
	/**
	 * 创建人
	 */
	@Column(name="CREATE_BY",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String createBy;
	
	/**
	 * 创建时间
	 */
	@Column(name="CREATE_TIME",length=19L,type=java.sql.Types.DATE,nullable=false)
	protected LocalDateTime createTime;
	
	/**
	 * 最后修改人
	 */
	@Column(name="UPDATE_BY",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String updateBy;
	
	/**
	 * 最后修改时间
	 */
	@Column(name="UPDATE_TIME",length=19L,type=java.sql.Types.DATE,nullable=false)
	protected LocalDateTime updateTime;
	
	/**
	 * 状态
	 */
	@Column(name="STATUS",length=1L,defaultValue="1",type=java.sql.Types.INTEGER,nullable=false)
	protected Integer status;
	

	/**
	 * 主键关联子表信息
	 */
	@OneToMany(fields={"dictType"},mappedTable="sqltoy_dict_detail",mappedColumns={"DICT_TYPE"},mappedFields={"dictType"})
	protected List<DictDetailVO> dictDetailVOs=new ArrayList<DictDetailVO>();


	/** default constructor */
	public AbstractDictTypeVO() {
	}
	
	/** pk constructor */
	public AbstractDictTypeVO(String dictType)
	{
		this.dictType=dictType;
	}

	/** minimal constructor */
	public AbstractDictTypeVO(String dictType,String dictTypeName,Integer showIndex,String createBy,LocalDateTime createTime,String updateBy,LocalDateTime updateTime,Integer status)
	{
		this.dictType=dictType;
		this.dictTypeName=dictTypeName;
		this.showIndex=showIndex;
		this.createBy=createBy;
		this.createTime=createTime;
		this.updateBy=updateBy;
		this.updateTime=updateTime;
		this.status=status;
	}

	/** full constructor */
	public AbstractDictTypeVO(String dictType,String dictTypeName,String comments,Integer showIndex,String createBy,LocalDateTime createTime,String updateBy,LocalDateTime updateTime,Integer status)
	{
		this.dictType=dictType;
		this.dictTypeName=dictTypeName;
		this.comments=comments;
		this.showIndex=showIndex;
		this.createBy=createBy;
		this.createTime=createTime;
		this.updateBy=updateBy;
		this.updateTime=updateTime;
		this.status=status;
	}
	
	/**
	 *@param dictType the dictType to set
	 */
	public void setDictType(String dictType) {
		this.dictType=dictType;
	}
		
	/**
	 *@return the DictType
	 */
	public String getDictType() {
	    return this.dictType;
	}
	
	/**
	 *@param dictTypeName the dictTypeName to set
	 */
	public void setDictTypeName(String dictTypeName) {
		this.dictTypeName=dictTypeName;
	}
		
	/**
	 *@return the DictTypeName
	 */
	public String getDictTypeName() {
	    return this.dictTypeName;
	}
	
	/**
	 *@param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments=comments;
	}
		
	/**
	 *@return the Comments
	 */
	public String getComments() {
	    return this.comments;
	}
	
	/**
	 *@param showIndex the showIndex to set
	 */
	public void setShowIndex(Integer showIndex) {
		this.showIndex=showIndex;
	}
		
	/**
	 *@return the ShowIndex
	 */
	public Integer getShowIndex() {
	    return this.showIndex;
	}
	
	/**
	 *@param createBy the createBy to set
	 */
	public void setCreateBy(String createBy) {
		this.createBy=createBy;
	}
		
	/**
	 *@return the CreateBy
	 */
	public String getCreateBy() {
	    return this.createBy;
	}
	
	/**
	 *@param createTime the createTime to set
	 */
	public void setCreateTime(LocalDateTime createTime) {
		this.createTime=createTime;
	}
		
	/**
	 *@return the CreateTime
	 */
	public LocalDateTime getCreateTime() {
	    return this.createTime;
	}
	
	/**
	 *@param updateBy the updateBy to set
	 */
	public void setUpdateBy(String updateBy) {
		this.updateBy=updateBy;
	}
		
	/**
	 *@return the UpdateBy
	 */
	public String getUpdateBy() {
	    return this.updateBy;
	}
	
	/**
	 *@param updateTime the updateTime to set
	 */
	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime=updateTime;
	}
		
	/**
	 *@return the UpdateTime
	 */
	public LocalDateTime getUpdateTime() {
	    return this.updateTime;
	}
	
	/**
	 *@param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status=status;
	}
		
	/**
	 *@return the Status
	 */
	public Integer getStatus() {
	    return this.status;
	}


	/**
	 * @return the dictDetailVOs
	 */
	public List<DictDetailVO> getDictDetailVOs() {
		return this.dictDetailVOs;
	}
	
	public void setDictDetailVOs(List<DictDetailVO> dictDetailVOs)	{
		this.dictDetailVOs=dictDetailVOs;
	}

	/**
     * @todo vo columns to String
     */
    @Override
	public String toString() {
		StringBuilder columnsBuffer=new StringBuilder();
		columnsBuffer.append("dictType=").append(getDictType()).append("\n");
		columnsBuffer.append("dictTypeName=").append(getDictTypeName()).append("\n");
		columnsBuffer.append("comments=").append(getComments()).append("\n");
		columnsBuffer.append("showIndex=").append(getShowIndex()).append("\n");
		columnsBuffer.append("createBy=").append(getCreateBy()).append("\n");
		columnsBuffer.append("createTime=").append(getCreateTime()).append("\n");
		columnsBuffer.append("updateBy=").append(getUpdateBy()).append("\n");
		columnsBuffer.append("updateTime=").append(getUpdateTime()).append("\n");
		columnsBuffer.append("status=").append(getStatus()).append("\n");
		return columnsBuffer.toString();
	}
}
