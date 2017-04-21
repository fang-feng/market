package com.market.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.market.domain.BasicData;
import com.market.service.IBasicDatatService;
import com.market.service.impl.BasicDataService;

public class BasicDataUtil {
	
	/**
	 * 商品状态-初始化
	 */
	public final static Short GoodsStatus_Init = 1;
	/**
	 * 商品状态-即将上市
	 */
	public final static Short GoodsStatus_CommingSoon = 2;
	/**
	 * 商品状态-上架
	 */
	public final static Short GoodsStatus_Shelve = 3;
	/**
	 * 商品状态-下架
	 */
	public final static Short GoodsStatus_OffShelve = 4;
	/**
	 * 申请者类型-公司
	 */
	public final static Short ApplicantType_Company = 1;
	/**
	 * 申请者类型-销售员
	 */
	public final static Short ApplicantType_Sales = 2;
	/**
	 * 销售员申请状态-审核中
	 */
	public final static Short SalesApplyStatus_Checking = 1;
	/**
	 * 销售员申请状态-通过
	 */
	public final static Short SalesApplyStatus_Accepted = 2;
	/**
	 * 销售员申请状态-拒绝
	 */
	public final static Short SalesApplyStatus_Refused = 3;
	/**
	 * 公司状态-正常
	 */
	public final static Short CompanyStatus_Normal = 1;
	/**
	 * 公司状态-终止合作
	 */
	public final static Short CompanyStatus_Terminate = 2;
	/**
	 * 佣金配置对象-公司
	 */
	public final static Short CommisionApplicantType_Company = 1;
	/**
	 * 佣金配置对象-员工
	 */
	public final static Short CommisionApplicantType_Sales = 2;
	
	/**
	 * 产品性质
	 */
	public final static String ProductDomain_Nature = "product_nature";	
	/**
	 * 商品状态
	 */
	public final static String GoodsDomain_Status = "goods_status";
	/**
	 * 申请者类型
	 */
	public final static String Applicant_Type = "applicant_type";
	/**
	 * 订单状态
	 */
	public final static String Order_Status = "order_status";
	/**
	 * 佣金配置对象
	 */
	public final static String Commision_Applicant_Type = "commision_applicant_type";
	
	/**
	 * 基础数据列表（内存里）
	 */
	private static List<BasicData> basicDatas;
	/*private static List<BasicData> basicDatas = new BasicDataService().getBasicDatas();*/
	
	/**
	 * 获取基础数据列表
	 * @return
	 */
	public static List<BasicData> getBasicDatas() {
		if (basicDatas == null) {
			IBasicDatatService basicDatatService = (IBasicDatatService)SpringContextUtil.getBeanByClass(BasicDataService.class);
			basicDatas = basicDatatService.getBasicDatas();
		}
		return basicDatas;
	}
	
	/**
	 * 根据获取基础数据
	 * @param domain 领域
	 * @return
	 */
	public static List<BasicData> getBasicDataByDomain(String domain) {
		if (basicDatas == null) {
			IBasicDatatService basicDatatService = (IBasicDatatService)SpringContextUtil.getBeanByClass(BasicDataService.class);
			basicDatas = basicDatatService.getBasicDatas();
		}
		List<BasicData> listByDomain = new ArrayList<BasicData>();
		for (BasicData basicData : basicDatas) {
			if (basicData.getDomain().equals(domain)) {
				listByDomain.add(basicData);
			}
		}
		return listByDomain;
	}
}
